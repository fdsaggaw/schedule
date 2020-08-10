package com.su.feign;

import com.su.model.bo.JobInfoBO;
import com.su.model.query.JobInfoQuery;
import com.su.model.query.JobLogQuery;
import com.su.model.vo.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "schedul")
public interface SchedulFeign {

    @RequestMapping("/addJob")
    public ResultVO addJob(JobInfoBO jobInfoBO);

    /**
     * 编辑任务
     * @param jobInfoBO
     * @return
     */
    @RequestMapping("/editJob")
    public ResultVO editJob(JobInfoBO jobInfoBO);

    /**
     * 暂停一个http定时任务
     * @return
     * @throws
     */
    @RequestMapping("/pauseJob")
    public ResultVO pauseJob(@RequestParam(name = "jobInfoId") Integer jobInfoId);

    /**
     * 恢复一个http定时任务
     * @param jobInfoId
     * @return
     */
    @RequestMapping("/restoreJob")
    public ResultVO restoreJob(@RequestParam(name = "jobInfoId") Integer jobInfoId);

    /**
     * 删除一个http定时任务
     * @param jobInfoId
     * @return
     */
    @RequestMapping("/removeJob")
    public ResultVO removeJob(@RequestParam(name = "jobInfoId") Integer jobInfoId);
    /**
     * 触发执行一次任务
     * @param jobInfoId
     * @return
     */
    @RequestMapping("/executeJob")
    public ResultVO executeJob(@RequestParam(name = "jobInfoId") Integer jobInfoId);

    /**
     * 分页获取http任务列表
     * @param jobInfoQuery
     * @return
     */
    @RequestMapping("/pageJob")
    public ResultVO pageJob(JobInfoQuery jobInfoQuery);

    /**
     * 分页查询指定任务的执行日志
     * @param jobLogQuery
     * @return
     */
    @RequestMapping("/pageJobLog")
    public ResultVO pageJobLog(JobLogQuery jobLogQuery);

    /**
     * 获取任务执行数据统计
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping("/getReportStatistic")
    public ResultVO getReportStatistic(String startTime, String endTime);

}
