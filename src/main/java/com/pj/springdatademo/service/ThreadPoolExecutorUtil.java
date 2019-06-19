package com.pj.springdatademo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class ThreadPoolExecutorUtil
{
    private Logger logger= LoggerFactory.getLogger(ThreadPoolExecutorUtil.class);

    private ThreadPoolExecutor threadPoolExecutor;

    public ThreadPoolExecutorUtil()
    {
        //Handle 10000 tasks at a time
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(10000);
        threadPoolExecutor = new ThreadPoolExecutor(2, 10, 20, TimeUnit.SECONDS, blockingQueue);
        threadPoolExecutor.setRejectedExecutionHandler((r, executor) ->
        {
            try
            {
                Thread.sleep(1000);
                logger.error("Exception occurred while adding task, Waiting for some time");
            }
            catch (InterruptedException e)
            {
                logger.error("Thread interrupted:  ()",e.getCause());
                Thread.currentThread().interrupt();
            }
            threadPoolExecutor.execute(r);
        });
    }

    void executeTask(TaskThread taskThread)
    {
        Future<?> future=threadPoolExecutor.submit(taskThread);
        logger.info("Number of Active Threads: {}",threadPoolExecutor.getActiveCount());

        while (!future.isDone())
        {
            try
            {
                future.get();
                logger.info("task.employees: {}",taskThread.employees.toString());
            }
            catch (Exception e)
            {
                logger.error("Thread interrupted:  ()",e.getCause());
            }
        }
    }
}
