package com.mukul.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@RefreshScope
public class EurekaServerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EurekaServerApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("The Eureka Server is running ............");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
