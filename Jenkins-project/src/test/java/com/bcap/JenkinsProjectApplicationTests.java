package com.bcap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectApplicationTests {
	

	private static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplication.class);

	@Test
	public contextLoads() {
		logger.info("Executing test cases...");
		assertEquals(true, true);
	}

}
