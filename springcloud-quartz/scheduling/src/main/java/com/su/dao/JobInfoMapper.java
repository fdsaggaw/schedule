package com.su.dao;

import com.su.model.bo.JobInfoBO;
import com.su.model.po.JobInfo;
import com.su.model.query.JobInfoQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@Repository
public interface JobInfoMapper extends Mapper<JobInfo> {

    /**
     * 查询jobInfo
     * @param query
     * @return
     */
    List<JobInfoBO> selectJobInfo(@Param(value = "query") JobInfoQuery query);

}