package com.wipro.apple.poc.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringMSServiceTest {

	@Autowired
	private StringMSService msService;

	@Test
	public void testReverseString() {
		String result = msService.reverseString("Ravisankar");
		assertNotNull(result);
		assertEquals("raknasivaR", result);
	}

	@Test(expected = NullPointerException.class)
	public void testReverseStringForNull() {
		msService.reverseString(null);
	}

	@Test
	public void testStringLength() {
		int result = msService.stringLength("Ravisankar");
		assertEquals(10, result);
	}

	@Test(expected = NullPointerException.class)
	public void testStringLengthForNull() {
		msService.stringLength(null);
	}

}
