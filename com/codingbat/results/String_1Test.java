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
	
	@Test
	public void testMakeAbba() {
		assertEquals("HiByeByeHi", obj.makeAbba("Hi", "Bye"));
		assertEquals("YoAliceAliceYo", obj.makeAbba("Yo", "Alice"));
		assertEquals("WhatUpUpWhat", obj.makeAbba("What", "Up"));
	}
	
	@Test
	public void testMakeTags() {
		assertEquals("<i>Yay</i>", obj.makeTags("i", "Yay"));
		assertEquals("<i>Hello</i>", obj.makeTags("i", "Hello"));
		assertEquals("<cite>Yay</cite>", obj.makeTags("cite", "Yay"));
	}
}
