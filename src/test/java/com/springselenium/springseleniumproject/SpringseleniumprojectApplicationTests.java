package com.springselenium.springseleniumproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("/application-test.properties")
class SpringseleniumprojectApplicationTests {
	@Value("${welcome.message}")
	private String welcomeMessage;

	@Test
	void contextLoads() {
		System.out.println(welcomeMessage);
	}

}
