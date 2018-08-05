package com.zheye.user.controller;

import com.zheye.common.enums.ErrorEnum;
import com.zheye.common.pojo.User;
import com.zheye.common.result.Result;
import com.zheye.common.utils.CommonUtil;
import com.zheye.user.base.BaseController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/8 17:33
 * @Description:
 */
@Controller
public class UserLoginController extends BaseController {

    @ApiOperation(value = "用户登录",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",required = true,dataType = "String"),
            @ApiImplicitParam(name = "password",value = "用户密码",required = true,dataType = "String"),
    })
    @GetMapping("/v1/login")
    public Result login(HttpServletRequest request,User user){
        if (CommonUtil.isEmpty(user.getUsername())||
                CommonUtil.isEmpty(user.getPassword())){
            return Result.fail(ErrorEnum.COMMON_0001);
        }
        String ip = CommonUtil.getIpAddr(request);
        user.setLoginIp(ip);
        return userService.login(user);
    }
}
