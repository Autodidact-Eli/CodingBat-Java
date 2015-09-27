package com.codingbat.results;

public class String_1 {

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2);
	}

	public String extraEnd(String str) {
		String end = str.substring(str.length()-2);
		return end + end + end;
	}

	public String firstTwo(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.length() < 2) {
			return str;
		} else {
			String first = str.substring(0,2);
			return first;
		}
	}

	public String firstHalf(String str) {
		String half = str.substring(0, str.length()/2);
		return half;
	}

	public String withoutEnd(String str) {
		return str.substring(1, str.length()-1);
	}

	public String comboString(String a, String b) {
		if (a.length() < b.length()) {
			return a + b + a;
		} else {
			return b + a + b;
		}
	}

	public String nonStart(String a, String b) {
		if (a.length() == 1 && b.length() == 1) return "";
		if (a.length() == 1 && b.length() != 1) return b.substring(1);
		if (a.length() != 1 && b.length() == 1) return a.substring(1);
		return a.substring(1) + b.substring(1);
	}

	public String left2(String str) {
		if (str.length() == 2) return str;
		String first2 = str.substring(0, 2);
		String body = str.substring(first2.length());
		return body + first2;
	}

	// TODO: This function deserves comments for clarity
	public String right2(String str) {
		if (str.length() == 2) return str;
		String last2 = str.substring(str.length()-2);
		String body = str.substring(0, str.length()-last2.length());
		return last2 + body;
	}

	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length()-1);
		}
	}
	
	public String withoutEnd2(String str) {
		if (str.length() <= 2) return "";
		return str.substring(1, str.length()-1);
	}

	public String middleTwo(String str) {
		if (str.length() == 2) return str;
		return str.substring((str.length()/2)-1, str.length()/2+1);
	}

	public boolean endsLy(String str) {
		// Solution 1
		if (str.length() < 2) return false; // string can't end with "ly"
		return str.substring(str.length()-2).equals("ly");

		// Solution 2 
		//if (str.length() < 2) return false;
		//return str.endsWith("ly");
	}

	public String nTwice(String str, int n) {
		return str.substring(0,n) + str.substring(str.length()-n);
	}
	
	// The three if-statements could be combined into one large conditional
	public String twoChar(String str, int index) {
		// Index can't be negative
		if (index < 0) return str.substring(0,2);
		
		// Index can't be larger than the string length
		if (index > str.length()) return str.substring(0,2);
		
		// If we didn't have this check, there would be a
		// StringIndexOutOfBoundsException
		if (str.length() - index < 2) return str.substring(0,2);
		
		return str.substring(index, index+2);
	}

	public String middleThree(String str) {
		if (str.length() == 3) return str;
		return str.substring((str.length()/2)-1,(str.length()/2)+2);
	}

	public boolean hasBad(String str) {
		// String can't contain "bad"
		if (str.length() < 3) return false;
		
		// str is "xba"
		if (str.length() == 3 && !str.equals("bad")) return false;
		
		// str is "badxx"
		if (str.length() >= 3 && str.substring(0,3).equals("bad")) return true;
		
		// str is "xbadxx"
		if (str.length() >= 3 && str.substring(1,4).equals("bad")) return true;
		
		return false;
	}
	
	public String atFirst(String str) {
		// str is ""
		if (str.equals("")) return "@@";
		
		// str is "h"
		if (str.length() < 2) return str + "@";
		
		// str is "hi"
		if (str.length() == 2) return str;

		return str.substring(0,2);
	}

	// a.isEmpty() can replace a.equals("")
	public String lastChars(String a, String b) {
		// a and b are ""
		if (a.equals("") && b.equals("")) return "@@";

		// a is ""
		if (a.equals("") && !b.equals("")) return "@" + b.substring(b.length()-1);

		// b is ""
		if (!a.equals("") && b.equals("")) return a.substring(0,1) + "@";
		
		// return first char of a, and last char of b
		return a.substring(0, 1) + b.substring(b.length()-1);
	}
	
	public String conCat(String a, String b) {
		// a and b are ""
		if (a.equals("") && b.equals("")) return "";
		
		// a is ""
		if (a.equals("") && !b.equals("")) return b;
		
		// b is ""
		if (!a.equals("") && b.equals("")) return a;
		
		// if concatenation creates a double-char
		if (a.substring(a.length()-1).equals(b.substring(0,1))) {
			return a + b.substring(1);
		}
		
		// return concatenated strings
		return a + b;
	}

	public String lastTwo(String str) {
		if (str.equals("")) return "";

		// lastTwo("a") --> "a"
		if (str.length() == 1) return str;

		// lastTwo("ab") --> "ba"
		if (str.length() == 2)
			return str.substring(str.length()-1) + str.substring(0,1);

		char last = str.charAt(str.length()-1);
		char oneBeforeLast = str.charAt(str.length()-2);
		String body = str.substring(0, str.length()-2);
		return body + last + oneBeforeLast;
	}
	
	public String seeColor(String str) {
		if (str.length() >= 3 && str.startsWith("red")) return "red";
		if (str.length() >= 4 && str.startsWith("blue")) return "blue";
		return "";
	}
	
	public boolean frontAgain(String str) {
		if (str.length() < 2) return false;
		if (str.length() == 2) return true;
		
		String firstTwo = str.substring(0,2);
		String lastTwo = str.substring(str.length()-2);
		return firstTwo.equals(lastTwo);
		
		// Another solution
		//return str.startsWith(lastTwo) && str.endsWith(firstTwo);
	}


}

























