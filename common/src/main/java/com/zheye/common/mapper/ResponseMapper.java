package com.zheye.common.mapper;


import com.zheye.common.pojo.Response;
import com.zheye.common.pojo.ResponseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
@Mapper
public interface ResponseMapper {
    long countByExample(ResponseExample example);

    int deleteByExample(ResponseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Response record);

    int insertSelective(Response record);

    List<Response> selectByExampleWithRowbounds(ResponseExample example, RowBounds rowBounds);

    List<Response> selectByExample(ResponseExample example);

    Response selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByExample(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByPrimaryKeySelective(Response record);

    int updateByPrimaryKey(Response record);
}