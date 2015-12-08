package com.string;

public class addAlltheInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		String str = "  abc  2  de 3 4 juk  45 8 -2";
		String[] split = str.split("\\s+");
		for (String value : split) {

			if (isInt(value)) {

				sum = sum + Integer.parseInt(value);
			}
		}

		System.out.println(sum);

	}

	private static boolean isInt(String value) {
		return value.matches("(\\+|\\-)?[0-9]+");
	}

}
