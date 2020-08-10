package com.su.model.bo;

import com.su.model.po.JobLog;
import lombok.Data;


@Data
public class JobLogBO extends JobLog {

    /**
     * 分组名
     */
    public String jobGroupName;

    /**
     * 任务标题
     */
    public String title;

}
