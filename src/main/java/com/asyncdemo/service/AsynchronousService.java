package com.asyncdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Log
@Service
public class AsynchronousService {
 
 
    @Async("asyncTaskExecutor")
    public void processData(int i) throws InterruptedException
    {
    	
        log.info("Start processing : "+i);
    	int result = doIt();
        log.info("Done! : "+i+" and result is "+result);
    }
    
    public int doIt() throws InterruptedException {
    	TimeUnit.SECONDS.sleep(30);
    	return 1;
    }
}