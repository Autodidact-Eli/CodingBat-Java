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
}