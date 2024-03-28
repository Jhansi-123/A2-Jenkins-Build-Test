package com.jenkins.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class JenkinsSpringDemoApplication implements CommandLineRunner {
	
	public static final Logger logger=LoggerFactory.getLogger(JenkinsSpringDemoApplication.class);
	public static void main(String[] args) {
		logger.info("Its Jenkins Pipeline Job");
		SpringApplication.run(JenkinsSpringDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Status : Running");
		logger.info("Latest Commit trigger")
	}
	

}




