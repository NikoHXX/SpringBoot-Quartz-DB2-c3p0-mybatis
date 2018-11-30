package com.hxxzt.quartz.task;

import com.hxxzt.service.IQuartzService;
import org.apache.log4j.Logger;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Component
public class CheckStatusTask implements Job {
    private Logger log = Logger.getLogger(CheckStatusTask.class);

    @Autowired
    private IQuartzService quartzService;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("===============定时刷新z_check_evaluate里的checkStatus 开始==============");
        int result = quartzService.printTask();
        if (result > 0)
            log.info("===============定时刷新z_check_evaluate里的checkStatus 成功==============个数："+result);
    }



}