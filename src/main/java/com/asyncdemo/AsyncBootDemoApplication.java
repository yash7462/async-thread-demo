package com.asyncdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class AsyncBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncBootDemoApplication.class, args);
	}

}
