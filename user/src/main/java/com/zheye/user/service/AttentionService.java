package com.zheye.user.service;


import com.zheye.common.pojo.Attention;
import com.zheye.common.pojo.User;

import java.util.List;

public interface AttentionService {
    /**
     * @Description 查询关注者列表
     * @Param
     * @return
     * @Author zhongqiuwu
     * @Date 2018/6/21
     */
    List<Attention> getAttentionList(User user);
}
