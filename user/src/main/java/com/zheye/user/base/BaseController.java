package com.zheye.user.base;

import com.zheye.user.service.AttentionService;
import com.zheye.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/8 16:49
 * @Description:统一注入需要使用的实体类,不会有任何影响,这些bean已经在spring容器中被构建出来,这里只是做一个注入
 */
public class BaseController {
    @Autowired
    protected UserService userService;

    @Autowired
    protected AttentionService attentionService;
}
