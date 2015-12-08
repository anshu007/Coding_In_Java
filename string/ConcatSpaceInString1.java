package com.string;

import java.util.Arrays;

public class ConcatSpaceInString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String con = "need to concatenate";
		String rep = "";
		int i = 0;
		while (i != con.length()) {
			char c = con.charAt(i++);
			if (c != ' ') {
				rep = rep + c;
			}
		}
		System.out.println(rep);
		System.out.println(ConcatSpaceInString1.class.getSimpleName());
		// ConcatSpaceInString1.class.getResourceAsStream(name)

		String[] arr = { "ansh", "ji", "me" };
		// Arrays.deepToString(arr);
		System.out.println(Arrays.deepToString(arr));
	}

}
