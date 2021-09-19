package com.asyncdemo.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import lombok.extern.java.Log;
@Log
@Configuration
@EnableAsync
public class AsynchronousConfiguration {
 
    @Bean(name = "asyncTaskExecutor")
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(1000);
        executor.setThreadNamePrefix("AsynchTaskThread-");
        executor.initialize();
        //log.warning("count : "+executor.getActiveCount());
        return executor;
    }
}
