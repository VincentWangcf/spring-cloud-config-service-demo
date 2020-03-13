package com.vincent.springcloudconfigservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServiceDemoApplication.class, args);
	}

}
