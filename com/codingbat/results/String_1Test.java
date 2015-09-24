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

	@Test
	public void testMakeOutWord() {
		assertEquals("<<Yay>>", obj.makeOutWord("<<>>", "Yay"));
		assertEquals("<<WooHoo>>", obj.makeOutWord("<<>>", "WooHoo"));
		assertEquals("[[word]]", obj.makeOutWord("[[]]", "word"));
	}

	@Test
	public void testExtraEnd() {
		assertEquals("lololo", obj.extraEnd("Hello"));
		assertEquals("ababab", obj.extraEnd("ab"));
		assertEquals("HiHiHi", obj.extraEnd("Hi"));
	}

	@Test
	public void testFirstTwo() {
		assertEquals("He", obj.firstTwo("He"));
		assertEquals("ab", obj.firstTwo("abcdefg"));
		assertEquals("ab", obj.firstTwo("ab"));
	}

	@Test
	public void testFirstHalf() {
		assertEquals("Woo", obj.firstHalf("WooHoo"));
		assertEquals("Hello", obj.firstHalf("HelloThere"));
		assertEquals("abc", obj.firstHalf("abcdef"));
	}

	@Test
	public void testWithoutEnd() {
		assertEquals("ell", obj.withoutEnd("Hello"));
		assertEquals("av", obj.withoutEnd("java"));
		assertEquals("odin", obj.withoutEnd("coding"));
	}

	@Test
	public void testComboString() {
		assertEquals("hiHellohi", obj.comboString("Hello", "hi"));
		assertEquals("hiHellohi", obj.comboString("hi", "Hello"));
		assertEquals("baaab", obj.comboString("aaa", "b"));
	}

	@Test
	public void testNonStart() {
		assertEquals("ellohere", obj.nonStart("Hello", "There"));
		assertEquals("avaode", obj.nonStart("java", "code"));
		assertEquals("hotlava", obj.nonStart("shotl", "java"));
	}

	@Test
	public void testLeft2() {
		assertEquals("lloHe", obj.left2("Hello"));
		assertEquals("vaja", obj.left2("java"));
		assertEquals("Hi", obj.left2("Hi"));
	}

	@Test
	public void testRight2() {
		assertEquals("loHel", obj.right2("Hello"));
		assertEquals("vaja", obj.right2("java"));
		assertEquals("Hi", obj.right2("Hi"));
	}
}