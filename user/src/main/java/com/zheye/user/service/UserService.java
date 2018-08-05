package com.zheye.user.service;


import com.zheye.common.pojo.User;
import com.zheye.common.result.Result;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/8 16:50
 * @Description:
 */
public interface UserService {
    Result login(User user);

    /**
     *
     * 功能描述:注册用户
     *
     * @param
     * @return:
     * @auther: zhongqiuwu
     * @date: 2018/6/12 14:31
     */
    Result register(User user);

    /**
     *
     * 功能描述:判断用户名是否存在
     *
     * @param
     * @return:
     * @auther: zhongqiuwu
     * @date: 2018/6/13 10:52
     */
    Result usernameIsExist(String username);

    /** 
     * @Description 获取用户信息 
     * @Param  
     * @return  
     * @Author zhongqiuwu 
     * @Date 2018/6/13 
     */ 
    Result getUserInfo(String token);
    
}
