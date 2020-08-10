package com.su.model.query;

import com.su.model.vo.PageVO;
import lombok.Data;


@Data
public class JobLogQuery extends PageVO {

    /**
     * http任务id
     */
    private Integer jobInfoId;

}
