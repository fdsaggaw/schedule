package com.su.dao;

import com.su.model.bo.JobLogBO;
import com.su.model.po.JobLog;
import com.su.model.query.JobLogQuery;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface JobLogMapper extends Mapper<JobLog> {

    /**
     * 查找任务运行日志
     * @param jobLogQuery
     * @return
     */
    List<JobLogBO> selectJobLog(@Param(value = "query") JobLogQuery jobLogQuery);

}