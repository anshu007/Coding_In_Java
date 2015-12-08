package com.regex;

import java.util.regex.*;

public class patternmatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean a=m.matches();
		
		boolean b=Pattern.compile("[[01]?[0-9]?[0-9]?|[2]?[0-5]?[0-5]?]{1,3}").matcher("555").matches();
		
		boolean c=Pattern.matches("[01]?[0-9]?[0-9]?|[2]?[0-5]?[0-5]?[.][01]?[0-9]?[0-9]?|[2]?[0-5]?[0-5]?[.][01]?[0-9]?[0-9]?|[2]?[0-5]?[0-5]?[.][01]?[0-9]?[0-9]?|[2]?[0-5]?[0-5]?", "255.255.255.255");
		
		System.out.println(a + " " + b + " " + c);

	}

}
