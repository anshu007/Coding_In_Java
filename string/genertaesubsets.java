package com.string;

public class genertaesubsets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "abcde";
		GenerateSubsets(a);
		// TODO Auto-generated method stub

	}

	private static String GenerateSubsets(String a) {

		if (a.length() == 1) {
			System.out.println(a);
		} else {
			System.out.println(a);
			GenerateSubsets(a.substring(0, (a.length() - 1)));
			GenerateSubsets(a.substring(1, (a.length())));
		}
		return null;

		// TODO Auto-generated method stub

	}

}
