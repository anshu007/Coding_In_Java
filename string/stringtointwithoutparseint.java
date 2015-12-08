package com.string;

public class stringtointwithoutparseint {
	public static void main(String args[]) {
		String convertingString = "123";
		System.out.println("String Before Conversion :  " + convertingString);
		int output = stringToint(convertingString);
		System.out.println("");
		System.out.println("");
		System.out.println("int value as output " + output);
		System.out.println("");
	}

	public static int stringToint(String str) {
		int i = 0, number = 0;
		boolean isNegative = false;
		int len = str.length();
		if (str.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		while (i < len) {
			number *= 10;
			// char aa=str.charAt(i++);

			int a = str.charAt(i++) - '0';
			// int aa=str.charAt(i);
			number += a;
		}
		if (isNegative)
			number = -number;
		return number;
	}
}