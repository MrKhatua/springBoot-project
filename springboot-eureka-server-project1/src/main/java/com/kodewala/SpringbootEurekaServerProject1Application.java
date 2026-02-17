package com.kodewala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaServerProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaServerProject1Application.class, args);
	}

}
