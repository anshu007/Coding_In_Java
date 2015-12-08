package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class firstnonrepeatedchar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter the input string");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		firstnonrepeated(s);
		// System.out.println("First non repeated char is "+c);

	}

	private static void firstnonrepeated(String s) {
		char c = 0;
		HashMap<Character, Integer> ha = new HashMap<Character, Integer>();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			c = s.charAt(i);
			if (ha.containsKey(c)) {
				ha.put(c, ha.get(c) + 1);
			} else {
				ha.put(c, 1);
			}

		}
		for (int j = 0; j < length; j++) {
			c = s.charAt(j);
			if (ha.get(c) == 1) {
				System.out.println("first non repeated char is " + c);
				break;
			}
			if (j == length - 1 && ha.get(c) != 1) {
				System.out.println("no non repeated char");
			}

		}
	}

}