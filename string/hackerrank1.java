package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class hackerrank1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String an = "anshu";
		Long a = Long.parseLong(an);
		// System.out.println(a);
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for (int i = 0; i < number; i++) {
			String ist1 = in.next();
			String ist2 = in.next();
			for (int j = 0; j < ist2.length(); j++) {
				if (ist1.indexOf(ist2.charAt(j)) != -1) {
					h.put(i, 1);
				} else {
					h.put(i, 0);
				}

			}
		}
		for (int k = 0; k < number; k++) {
			if (h.get(k) == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
