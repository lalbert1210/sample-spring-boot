package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public  void myTest() {
		assertTrue(true);
	}

	@Test
	public void additionner_should_give_a_number_with_two_integers() throws Exception {
		if (DemoApplication.additionner(1,2) == 3) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

}
