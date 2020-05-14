package com.wx.web.mapper;

import com.wx.web.bean.WorkAndModule;
import com.wx.web.bean.WorkAndModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkAndModuleMapper {
    long countByExample(WorkAndModuleExample example);

    int deleteByExample(WorkAndModuleExample example);

    int deleteByPrimaryKey(Integer wdid);

    int insert(WorkAndModule record);

    int insertSelective(WorkAndModule record);

    List<WorkAndModule> selectByExample(WorkAndModuleExample example);

    WorkAndModule selectByPrimaryKey(Integer wdid);

    int updateByExampleSelective(@Param("record") WorkAndModule record, @Param("example") WorkAndModuleExample example);

    int updateByExample(@Param("record") WorkAndModule record, @Param("example") WorkAndModuleExample example);

    int updateByPrimaryKeySelective(WorkAndModule record);

    int updateByPrimaryKey(WorkAndModule record);
}