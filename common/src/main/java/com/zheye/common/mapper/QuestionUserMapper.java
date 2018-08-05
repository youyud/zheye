package com.zheye.common.mapper;


import com.zheye.common.pojo.QuestionUser;
import com.zheye.common.pojo.QuestionUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
@Mapper
public interface QuestionUserMapper {
    long countByExample(QuestionUserExample example);

    int deleteByExample(QuestionUserExample example);

    int deleteByPrimaryKey(@Param("questionId") Long questionId, @Param("userId") Long userId);

    int insert(QuestionUser record);

    int insertSelective(QuestionUser record);

    List<QuestionUser> selectByExampleWithRowbounds(QuestionUserExample example, RowBounds rowBounds);

    List<QuestionUser> selectByExample(QuestionUserExample example);

    int updateByExampleSelective(@Param("record") QuestionUser record, @Param("example") QuestionUserExample example);

    int updateByExample(@Param("record") QuestionUser record, @Param("example") QuestionUserExample example);
}