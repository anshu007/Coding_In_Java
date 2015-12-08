package com.string;

public class removeAdjacentPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "ABBBDDDA";
		// TODO Auto-generated method stub
		System.out.println(removeAdjacentPairs(str.toCharArray()));

	}

	private static String removeAdjacentPairs(char[] str) {
		int j = 0;
		int count = 0;
		for (int i = 1; i < str.length; i++) {
			while (i < str.length && j >= 0 && str[i] == str[j]) {
				i++;
				count--;
			}
			if (count < 0) {
				j = count;
				count = 0;
			}
			if (i < str.length)
				str[++j] = str[i];
		}
		return new String(str, 0, j + 1);
	}

}
