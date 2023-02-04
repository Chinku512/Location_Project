package com.example.Location;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LocationApplicationTests {

	@Test
	public String showRegisterPage() {
		return "register";
	}
}
