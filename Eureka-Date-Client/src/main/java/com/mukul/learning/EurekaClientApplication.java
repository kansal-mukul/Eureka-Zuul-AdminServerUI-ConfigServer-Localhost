package com.mukul.learning;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class EurekaClientApplication {
	
	@Value("${welcome.heading}")
	 private String welcomeHeading;
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	@RequestMapping("/date")
    public String greeting() {
        return welcomeHeading +" : "+ new Date() + "";
    }
	

}


