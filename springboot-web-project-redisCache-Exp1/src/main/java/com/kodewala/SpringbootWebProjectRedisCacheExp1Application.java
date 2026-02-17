package com.kodewala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootWebProjectRedisCacheExp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebProjectRedisCacheExp1Application.class, args);
	}

}
