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

	@Test
	public void testTheEnd() {
		assertEquals("H", obj.theEnd("Hello", true));
		assertEquals("o", obj.theEnd("Hello", false));
		assertEquals("o", obj.theEnd("oh", true));
	}

	@Test
	public void testWithoutEnd2() {
		assertEquals("ell", obj.withoutEnd2("Hello"));
		assertEquals("b", obj.withoutEnd2("abc"));
		assertEquals("", obj.withoutEnd2("ab"));
	}

	@Test
	public void testMiddleTwo() {
		assertEquals("ri", obj.middleTwo("string"));
		assertEquals("od", obj.middleTwo("code"));
		assertEquals("ct", obj.middleTwo("Practice"));
	}

	@Test
	public void testEndsLy() {
		assertTrue(obj.endsLy("oddly"));
		assertFalse(obj.endsLy("y"));
		assertFalse(obj.endsLy("oddy"));
	}

	@Test
	public void testNTwice() {
		assertEquals("Helo", obj.nTwice("Hello", 2));
		assertEquals("Choate", obj.nTwice("Chocolate", 3));
		assertEquals("Ce", obj.nTwice("Chocolate", 1));
	}

	@Test
	public void testTwoChar() {
		assertEquals("ja", obj.twoChar("java", 0));
		assertEquals("va", obj.twoChar("java", 2));
		assertEquals("ja", obj.twoChar("java", 3));
	}

	@Test
	public void testMiddleThree() {
		assertEquals("and", obj.middleThree("Candy"));
		assertEquals("and", obj.middleThree("and"));
		assertEquals("lvi", obj.middleThree("solving"));
	}

	@Test
	public void testHasBad() {
		assertTrue(obj.hasBad("badxx"));
		assertTrue(obj.hasBad("xbadxx"));
		assertFalse(obj.hasBad("xxbadxx"));
	}

	@Test
	public void testAtFirst() {
		assertEquals("he", obj.atFirst("hello"));
		assertEquals("hi", obj.atFirst("hi"));
		assertEquals("h@", obj.atFirst("h"));
	}

	@Test
	public void testLastChars() {
		assertEquals("ls", obj.lastChars("last", "chars"));
		assertEquals("ya", obj.lastChars("yo", "java"));
		assertEquals("h@", obj.lastChars("hi", ""));
	}

	@Test
	public void testConCat() {
		assertEquals("abcat", obj.conCat("abc", "cat"));
		assertEquals("dogcat", obj.conCat("dog", "cat"));
		assertEquals("abc", obj.conCat("abc", ""));
	}

	@Test
	public void testLastTwo() {
		assertEquals("codign", obj.lastTwo("coding"));
		assertEquals("cta", obj.lastTwo("cat"));
		assertEquals("ba", obj.lastTwo("ab"));
	}

	@Test
	public void testSeeColor() {
		assertEquals("red", obj.seeColor("redxx"));
		assertEquals("", obj.seeColor("xxred"));
		assertEquals("blue", obj.seeColor("blueTimes"));
	}

	@Test
	public void testFrontAgain() {
		assertTrue(obj.frontAgain("edited"));
		assertFalse(obj.frontAgain("edit"));
		assertTrue(obj.frontAgain("ed"));
	}

	@Test
	public void testMinCat() {
		assertEquals("loHi", obj.minCat("Hello", "Hi"));
		assertEquals("ellojava", obj.minCat("Hello", "java"));
		assertEquals("javaello", obj.minCat("java", "Hello"));
	}

	@Test
	public void testExtraFront() {
		assertEquals("HeHeHe", obj.extraFront("Hello"));
		assertEquals("ababab", obj.extraFront("ab"));
		assertEquals("HHH", obj.extraFront("H"));
	}
}