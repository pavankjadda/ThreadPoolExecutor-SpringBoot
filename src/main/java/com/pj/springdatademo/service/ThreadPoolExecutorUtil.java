package com.pj.springdatademo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class ThreadPoolExecutorUtil
{
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
                System.out.println("Exception occurred while adding task, Waiting for some time");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            threadPoolExecutor.execute(r);
        });
    }

    void executeTask(Task task)
    {
        Future<?> future=threadPoolExecutor.submit(task);
        System.out.println("Number of Active Threads: "+threadPoolExecutor.getActiveCount());

        //while (!future.isDone())
        //{
            try
            {
                future.get();
                System.out.println("task.categories: "+task.categories.toString());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        //}
    }
}
