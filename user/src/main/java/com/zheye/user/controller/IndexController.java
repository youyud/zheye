package com.zheye.user.controller;

import com.zheye.common.result.Result;
import com.zheye.user.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhongqiuwu
 * @desciption 首页控制器
 * @date /06/14 16:41
 **/
@RestController
@RequestMapping("/index")
public class IndexController extends BaseController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * @Description 首页接口
     * @Param
     * @return
     * @Author zhongqiuwu
     * @Date 2018/6/21
     */
    @GetMapping("")
    public Result index(String token){
        Result result = userService.getUserInfo(token);
        if (result.getFlag()){


        }
        return null;
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date today = sdf.parse(sdf.format(new Date()));
            System.out.println(today);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
