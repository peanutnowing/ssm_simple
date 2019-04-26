package com.ssm.simple.task;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定时任务
 *
 * @Author peanutnowing
 * @Date 2019/4/26
 */
public class QuartzDemoTaskScheduler {
    private static final Logger logger = LoggerFactory.getLogger(QuartzDemoTaskScheduler.class);

    public static void startTask() {
        //通过schedulerFactory获取一个调度器
        SchedulerFactory schedulerfactory = new StdSchedulerFactory();
        Scheduler scheduler=null;
        try{
            // 通过schedulerFactory获取一个调度器
            scheduler = schedulerfactory.getScheduler();
            // 创建jobDetail实例，绑定Job实现类  指明job的名称，所在组的名称，以及绑定job类
            JobDetail demoJob = JobBuilder.newJob(QuartzDemoTask.class).withIdentity("demoJob", "demoGroup").build();
            //  corn表达式
            Trigger demoTrigger= TriggerBuilder.newTrigger().withIdentity("demoJob", "demoTrigger")
                    .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))//每5秒执行1次
                    .startNow().build();

            // 把作业和触发器注册到任务调度中
            scheduler.scheduleJob(demoJob, demoTrigger);
            // 启动调度
            scheduler.start();
        }catch(SchedulerException e){
            logger.error("QuartzDemoTaskScheduler run task error:{}",e);
        }catch(Exception e){
            logger.error("exception:{}",e);
        }
    }

    public static void main(String[] args) {
        QuartzDemoTaskScheduler.startTask();
    }
}
