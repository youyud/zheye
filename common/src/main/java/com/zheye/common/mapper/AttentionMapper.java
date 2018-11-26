package com.zheye.common.mapper;


import com.zheye.common.pojo.Attention;
import com.zheye.common.pojo.AttentionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AttentionMapper {
    long countByExample(AttentionExample example);

    int deleteByExample(AttentionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Attention record);

    int insertSelective(Attention record);

    List<Attention> selectByExampleWithRowbounds(AttentionExample example, RowBounds rowBounds);

    List<Attention> selectByExample(AttentionExample example);

    Attention selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByExample(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}