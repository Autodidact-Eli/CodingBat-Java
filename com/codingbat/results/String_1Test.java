package com.codingbat.results;

import static org.junit.Assert.*;

import org.junit.Test;

public class String_1Test {

	String_1 obj = new String_1();
	
	@Test
	public void testHelloName() {
		assertEquals("Hello Bob!", obj.helloName("Bob"));
		assertEquals("Hello Alice!", obj.helloName("Alice"));
		assertEquals("Hello X!", obj.helloName("X"));
	}

}
