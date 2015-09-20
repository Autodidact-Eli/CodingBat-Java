package com.codingbat.results;

import static org.junit.Assert.*;

import org.junit.Test;

public class Warmup_1Test {

	Warmup_1 obj = new Warmup_1();

	@Test
	public void testSleepIn() {
		assertTrue(obj.sleepIn(false, false));
		assertFalse(obj.sleepIn(true, false));
		assertTrue(obj.sleepIn(false, true));
	}

	@Test
	public void testMonkeyTrouble() {
		assertTrue(obj.monkeyTrouble(true, true));
		assertTrue(obj.monkeyTrouble(false, false));
		assertFalse(obj.monkeyTrouble(true, false));
	}

	@Test
	public void testSumDouble() {
		assertEquals(3, obj.sumDouble(1, 2));
		assertEquals(5, obj.sumDouble(3, 2));
		assertEquals(8, obj.sumDouble(2, 2));
	}

	@Test
	public void testdiff21() {
		assertEquals(2, obj.diff21(19));
		assertEquals(11, obj.diff21(10));
		assertEquals(0, obj.diff21(21));
	}

	@Test
	public void testParrotTrouble() {
		assertTrue(obj.parrotTrouble(true, 6));
		assertFalse(obj.parrotTrouble(true, 7));
		assertFalse(obj.parrotTrouble(false, 6));
	}

	@Test
	public void testMakes10() {
		assertTrue(obj.makes10(9, 10));
		assertFalse(obj.makes10(9, 9));
		assertTrue(obj.makes10(1, 9));
	}

	@Test
	public void testNearHundred() {
		assertTrue(obj.nearHundred(93));
		assertTrue(obj.nearHundred(90));
		assertFalse(obj.nearHundred(89));
	}

	@Test
	public void testPosNeg() {
		assertTrue(obj.posNeg(1, -1, false));
		assertTrue(obj.posNeg(-1, 1, false));
		assertTrue(obj.posNeg(-4, -5, true));
	}
	
	@Test
	public void testNotString() {
		assertEquals("not candy", obj.notString("candy"));
		assertEquals("not x", obj.notString("x"));
		assertEquals("not bad", obj.notString("not bad"));
	}
	
	@Test
	public void testMissingChar() {
		assertEquals("ktten", obj.missingChar("kitten", 1));
		assertEquals("itten", obj.missingChar("kitten", 0));
		assertEquals("kittn", obj.missingChar("kitten", 4));
	}
	
	@Test
	public void testFrontBack() {
		assertEquals("eodc", obj.frontBack("code"));
		assertEquals("a", obj.frontBack("a"));
		assertEquals("ab", obj.frontBack("ba"));
	}
	
	@Test
	public void testFront3() {
		assertEquals("JavJavJav", obj.front3("Java"));
		assertEquals("ChoChoCho", obj.front3("Chocolate"));
		assertEquals("abcabcabc", obj.front3("abc"));
	}
}















