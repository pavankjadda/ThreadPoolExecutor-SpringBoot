package com.pj.springdatademo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

@Component
public class ThreadPoolExecutorUtil
{
    private ThreadPoolExecutor threadPoolExecutor;

    public ThreadPoolExecutorUtil()
    {
        this.threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        this.threadPoolExecutor.setCorePoolSize(1);
        this.threadPoolExecutor.setMaximumPoolSize(10);
    }

    void executeTask(Task task)
    {
        Future<?> future=threadPoolExecutor.submit(task);

        if(future.isDone())
        {
            try
            {
                future.get();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }


}
