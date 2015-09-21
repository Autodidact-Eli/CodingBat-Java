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

	@Test
	public void testBackAround() {
		assertEquals("tcatt", obj.backAround("cat"));
		assertEquals("oHelloo", obj.backAround("Hello"));
		assertEquals("aaa", obj.backAround("a"));
	}
	
	@Test
	public void testOr35() {
		assertTrue(obj.or35(3));
		assertTrue(obj.or35(10));
		assertFalse(obj.or35(8));
	}
	
	@Test
	public void testFront22() {
		assertEquals("kikittenki", obj.front22("kitten"));
		assertEquals("HaHaHa", obj.front22("Ha"));
		assertEquals("ababcab", obj.front22("abc"));
	}
	
	@Test
	public void testStartHi() {
		assertTrue(obj.startHi("hi there"));
		assertTrue(obj.startHi("hi"));
		assertFalse(obj.startHi("hello hi"));
	}
	
	@Test
	public void testIcyHot() {
		assertTrue(obj.icyHot(120, -1));
		assertTrue(obj.icyHot(-1, 120));
		assertFalse(obj.icyHot(2, 120));
	}
	
	@Test
	public void testIn1020() {
		assertTrue(obj.in1020(12, 99));
		assertTrue(obj.in1020(21, 12));
		assertFalse(obj.in1020(8, 99));
	}
	
	@Test
	public void testHasTeen() {
		assertTrue(obj.hasTeen(13, 20, 10));
		assertTrue(obj.hasTeen(20, 19, 10));
		assertTrue(obj.hasTeen(20, 10, 13));
	}

	@Test
	public void testLoneTeen() {
		assertTrue(obj.loneTeen(13, 99));
		assertTrue(obj.loneTeen(21, 19));
		assertFalse(obj.loneTeen(13, 13));
	}
	
	@Test
	public void testDelDel() {
		assertEquals("abc", obj.delDel("adelbc"));
		assertEquals("aHello", obj.delDel("adelHello"));
		assertEquals("adedbc", obj.delDel("adedbc"));
	}
	
	@Test
	public void testMixStart() {
		assertTrue(obj.mixStart("mix snacks"));
		assertTrue(obj.mixStart("pix snacks"));
		assertFalse(obj.mixStart("piz snacks"));
	}
	
	@Test
	public void testStartOz() {
		assertEquals("oz", obj.startOz("ozymandias"));
		assertEquals("z", obj.startOz("bzoo"));
		assertEquals("o", obj.startOz("oxx"));
	}
	
	@Test
	public void testIntMax() {
		assertEquals(3, obj.intMax(1, 2, 3));
		assertEquals(3, obj.intMax(1, 3, 2));
		assertEquals(3, obj.intMax(3, 2, 1));
	}
	
	@Test
	public void testClose10() {
		assertEquals(8, obj.close10(8, 13));
		assertEquals(8, obj.close10(13, 8));
		assertEquals(0, obj.close10(13, 7));
	}
	
	@Test
	public void testIn3050() {
		assertTrue(obj.in3050(30, 31));
		assertFalse(obj.in3050(30, 41));
		assertTrue(obj.in3050(40, 50));
	}
	
	@Test
	public void testMax1020() {
		assertEquals(19, obj.max1020(11, 19));
		assertEquals(19, obj.max1020(19, 11));
		assertEquals(11, obj.max1020(11, 9));
	}
	
	@Test
	public void testStringE() {
		assertTrue(obj.stringE("Hello"));
		assertTrue(obj.stringE("Heelle"));
		assertFalse(obj.stringE("Heelele"));
	}
	
	@Test
	public void testLastDigit() {
		assertTrue(obj.lastDigit(7, 17));
		assertFalse(obj.lastDigit(6, 17));
		assertTrue(obj.lastDigit(3, 113));
	}
	
	@Test
	public void testEndUp() {
		assertEquals("HeLLO", obj.endUp("Hello"));
		assertEquals("hi thERE", obj.endUp("hi there"));
		assertEquals("HI", obj.endUp("hi"));
	}
	
	@Test
	public void testEveryNth() {
		assertEquals("Mrce", obj.everyNth("Miracle", 2));
		assertEquals("aceg", obj.everyNth("abcdefg", 2));
		assertEquals("adg", obj.everyNth("abcdefg", 3));		
	}
}