package com.jenkins.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsSpringDemoApplicationTests {
	public static final Logger logger=LoggerFactory.getLogger(JenkinsSpringDemoApplication.class);
	@Test
	void contextLoads() {
		logger.info("Its a test class");
		assertEquals(true,true);
	}
	

}
