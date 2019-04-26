package com.ssm.simple.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务
 *
 * @Author peanutnowing
 * @Date 2019/4/26
 */
public class DemoTask implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("demoTask start...");
    }
}
