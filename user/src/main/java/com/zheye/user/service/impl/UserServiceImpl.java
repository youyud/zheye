package com.zheye.user.service.impl;

import com.google.common.collect.Maps;
import com.zheye.common.enums.ErrorEnum;
import com.zheye.common.mapper.UserMapper;
import com.zheye.common.pojo.User;
import com.zheye.common.pojo.UserExample;
import com.zheye.common.result.Result;
import com.zheye.common.utils.DateUtils;
import com.zheye.common.utils.EncryUtil;
import com.zheye.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/8 16:51
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result login(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        example.createCriteria().andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);

        if (null != users && users.size() > 0) {
            User existUser = users.get(0);
            existUser.setLoginIp(user.getLoginIp());
            existUser.setLoginDate(new Date());
            userMapper.updateByPrimaryKeySelective(existUser);

            Date dt = new Date();
            String strDt = DateUtils.getDataFormat(dt);
            StringBuffer sb = new StringBuffer(strDt + "-");
            sb.append(String.valueOf(user.getId()));
            String token = EncryUtil.encrypt(sb.toString());
            ValueOperations<String, String> ops = redisTemplate.opsForValue();
            ops.set("token" + token, String.valueOf(existUser.getId()), 30 * 60, TimeUnit.SECONDS);

            Map<String, Object> map = Maps.newHashMap();
            map.put("token", existUser.getId());

            return Result.ok(map);
        }

        return Result.fail(ErrorEnum.USER_4001);
    }

    @Override
    public Result register(User user) {
        //判断用户名是否已经被使用
        Result result = usernameIsExist(user.getUsername());
        if (!result.getFlag()) {
            return Result.fail(ErrorEnum.USER_4008);
        }

        userMapper.insertSelective(user);
        return Result.ok();
    }

    @Override
    public Result usernameIsExist(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        if (null != users && users.size() > 0) {
            return Result.fail(ErrorEnum.USER_4008);
        }
        return Result.ok();
    }

    @Override
    public Result getUserInfo(String token) {
        try {
            Long id = null;
            try {
                id = (Long) redisTemplate.opsForValue().get(token);
            } catch (Exception e) {
                e.printStackTrace();
                return Result.fail(ErrorEnum.USER_4013);
            }
            User user = userMapper.selectByPrimaryKey(id);
            return Result.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(ErrorEnum.COMMON_0002);
        }
    }
}
