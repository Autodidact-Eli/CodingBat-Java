package com.codingbat.results;

public class Warmup_1 {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return (!weekday || vacation); 
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile) || (!aSmile && !bSmile);
	}

	public int sumDouble(int a, int b) {
		if (a == b) {
			return (a + b)*2; // double sum
		}
		return a + b;
	}

	public int diff21(int n) {
		if (n > 21) {
			return Math.abs(n-21)*2;
		}
		return Math.abs(21-n);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking && (hour < 7 || hour > 20)) {
			return true;
		}
		return false;
	}

	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || (a+b) == 10;
	}

	public boolean nearHundred(int n) {
		if (Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10) {
			return true;
		}
		return false;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		}
		return (a > 0 && b < 0) || (a < 0 && b > 0);
	}
	
	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}
		return "not " + str;
	}

	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(n+1);
	}

	public String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String first, mid, last;
		first = str.substring(0,1);
		last = str.substring(str.length()-1);
		mid = str.substring(1,str.length()-1);
		
		return last + mid + first;
	}
	
	public String front3(String str) {
		String front;
		if (str.length() < 3) {
			front = str;
		} else {
			front = str.substring(0, 3);
		}
		return front + front + front;
	}


}
















