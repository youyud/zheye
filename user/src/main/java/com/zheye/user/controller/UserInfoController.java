package com.zheye.user.controller;

import com.zheye.common.result.Result;
import com.zheye.user.base.BaseController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongqiuwu
 * @desciption 用户信息控制器
 * @date /06/13 15:40
 **/
@RestController
@RequestMapping("/user")
public class UserInfoController extends BaseController {

    @ApiOperation(value = "获取用户信息",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long",paramType = "path"),
    })
    @GetMapping("/{id}")
    public Result getUserInfo(@PathVariable String id){
        return userService.getUserInfo(id);
    }
}
