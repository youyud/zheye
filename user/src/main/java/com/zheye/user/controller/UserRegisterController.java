package com.zheye.user.controller;

import com.zheye.common.pojo.User;
import com.zheye.common.result.Result;
import com.zheye.user.base.BaseController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/8 16:27
 * @Description:
 */
@RestController
public class UserRegisterController extends BaseController {

    @ApiOperation(value = "注册用户",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",required = true,dataType = "String"),
            @ApiImplicitParam(name = "password",value = "密码",required = true,dataType = "String")
    })
    @PostMapping("/v1/register")
    public Result register(@Validated User user){
        System.out.println(user.getEmail());
        return userService.register(user);
    }

    @ApiOperation(value = "判断用户名是否存在",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",required = true,dataType = "String",paramType = "path"),

    })
    @GetMapping("/username/{username}")
    public Result usernameIsExist(@PathVariable String username){
        return userService.usernameIsExist(username);
    }
}
