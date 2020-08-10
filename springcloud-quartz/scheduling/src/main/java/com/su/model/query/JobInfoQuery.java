package com.su.model.query;

import com.su.model.vo.PageVO;
import lombok.Data;


@Data
public class JobInfoQuery extends PageVO {

    /**
     * http任务标题
     */
    private String title;

    /**
     * http任务状态
     */
    private Integer status;

    /**
     * http任务分组id
     */
    private Integer jobGroupId;

}
