package com.spring.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskJob {

    @Scheduled(cron = "*/5 * * * * ?")
    public void job2(){
        System.out.println("任务2进行中....");
    }

    public void job1(){
        System.out.println("任务进行中....");
    }
}
