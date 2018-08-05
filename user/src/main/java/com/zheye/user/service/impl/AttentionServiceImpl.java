package com.zheye.user.service.impl;

import com.zheye.common.mapper.AttentionMapper;
import com.zheye.common.pojo.Attention;
import com.zheye.common.pojo.AttentionExample;
import com.zheye.common.pojo.User;
import com.zheye.user.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhongqiuwu
 * @desciption
 * @date /06/21 10:40
 **/
@Service
public class AttentionServiceImpl implements AttentionService {

    @Autowired
    private AttentionMapper attentionMapper;

    @Override
    public List<Attention> getAttentionList(User user) {
        AttentionExample example = new AttentionExample();
        example.createCriteria().andAttentionUserIdEqualTo(user.getId());
        List<Attention> attentions = attentionMapper.selectByExample(example);
        return attentions;
    }
}
