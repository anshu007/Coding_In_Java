package com.string;

import java.util.Stack;

public class removeAdjacentPairsStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "AAABBBBDDCC";
		// TODO Auto-generated method stub
		removeAdjacentPairs(str.toCharArray());

	}

	private static void removeAdjacentPairs(char[] a) {

		Stack<Character> s = new Stack<Character>();
		s.push(a[0]);
		int count = 0;
		for (int i = 1; i < a.length; i++) {
			while (i < a.length && (!s.empty()) && a[i] == s.peek()) {
				i++;
				count++;
			}
			if (count > 0) {
				s.pop();
				count = 0;
			}
			if (i < a.length)
				s.push(a[i]);
		}
		for (char c : s) {
			System.out.println(c);
		}
	}

}
