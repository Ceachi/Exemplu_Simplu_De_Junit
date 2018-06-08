package com.testare.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.testare.config.ProjectConfig;

// Vreau sa fac un test care sa esueaze dupa un anumit numar de repeaturi


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProjectConfig.class)
public class RepeatTest {
	int x;
	
	@Test
	@Repeat(10)
	public void repeatTest() {
		x++;
		Assert.isTrue(x < 5, "X nu este mai mic decat 5");
		//Assert.isTrue(x < 11, "X nu este mai mic decat 5");
	}
	
	// vreau sa pice daca dureaza mai mult de 1000
	@Test
	@Timed(millis = 1000)
	public void timedText() {
		try {
			Thread.sleep(1500);
		}catch(Exception e) {
			
		}
	}
}
