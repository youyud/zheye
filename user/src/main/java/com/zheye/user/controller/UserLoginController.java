package com.zheye.user.controller;

import com.zheye.common.enums.ErrorEnum;
import com.zheye.common.pojo.User;
import com.zheye.common.result.Result;
import com.zheye.common.utils.CommonUtil;
import com.zheye.user.base.BaseController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Size;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/8 17:33
 * @Description:
 */
@RestController
public class UserLoginController extends BaseController {

    @ApiOperation(value = "用户登录", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String"),
    })
    @GetMapping("/v1/login")
    public Result login(HttpServletRequest request, User user, @RequestParam @Size(max = 5) String aaaaa) {
        if (CommonUtil.isEmpty(user.getUsername()) ||
                CommonUtil.isEmpty(user.getPassword())) {
            return Result.fail(ErrorEnum.COMMON_0001);
        }
        System.out.println(aaaaa);
        String ip = CommonUtil.getIpAddr(request);
        user.setLoginIp(ip);
        return userService.login(user);
    }
}
