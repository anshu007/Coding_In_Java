package com.string;

import java.util.Scanner;

public class numberofwordsinstring {
	static int j;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		int i = numberofwords(word);
		System.out.println("number of words" + i);
	}

	private static int numberofwords(String s) {
		int c = 0;
		char ch[] = new char[s.length()]; // in string especially we have to
											// mention the () after length
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' '))
					|| ((ch[0] != ' ') && (i == 0))) {
				c++;
			}
		}
		return c;
	}

}
