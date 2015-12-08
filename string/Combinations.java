package com.string;

public class Combinations {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		String str = "ba";
		Comb("", str);

	}

	private static void Comb(String prefix, String str) {
		System.out.println(prefix);
		/*
		 * if(isPalindrome(prefix) && prefix.length()>length){
		 * length=prefix.length(); palindrome=prefix; }
		 */
		for (int i = 0; i < str.length(); i++) {
			Comb(prefix + str.charAt(i), str.substring(i + 1));
		}

		// TODO Auto-generated method stub

	}

}
