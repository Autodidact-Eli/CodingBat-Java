package com.codingbat.results;

/**
 *	/workspace/Codingbat/src
 *
 *	After making changes
 *	git add .
 *	git commit -m [comments here]
 *	git push -u origin master
 */

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

	public String backAround(String str) {
		return str.substring(str.length()-1) + str + str.substring(str.length()-1);
	}
	
	public boolean or35(int n) {
		return n % 5 == 0 || n % 3 == 0;
	}

	public String front22(String str) {
		String firstTwo;
		if (str.length() < 2) {
			firstTwo = str;
		} else {
			firstTwo = str.substring(0, 2);
		}
		return firstTwo + str + firstTwo;
	}
	
	public boolean startHi(String str) {
		return str.length() >= 2 && str.substring(0,2).equals("hi");
	}

	public boolean icyHot(int temp1, int temp2) {
		return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
	}
	
	public boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
	}
	
	public boolean hasTeen(int a, int b, int c) {
		return (a >= 13 && a <= 19) ||
			   (b >= 13 && b <= 19) ||
			   (c >= 13 && c <= 19);
	}
	
	public boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) { // both are teens
			return false;
		}
		return (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
	}
	
	public String delDel(String str) {
		if (str.length() > 3 && str.substring(1,4).equals("del")) {
			return str.substring(0,1) + str.substring(4);
		}
		return str;
	}
	
	public boolean mixStart(String str) {
		return str.length() >= 3 && str.substring(1,3).equals("ix");
	}
}