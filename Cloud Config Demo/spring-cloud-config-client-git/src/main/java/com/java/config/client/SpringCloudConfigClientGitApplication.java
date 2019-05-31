package com.java.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringCloudConfigClientGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientGitApplication.class, args);
	}

}
