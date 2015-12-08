package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ist");
		String ist = in.nextLine();
		System.out.println("enter 2nd string");
		String nd = in.nextLine();
		if (isAnagrams(ist, nd)) {
			System.out.println("They are anagrams");
		} else {
			System.out.println("Not anagrams");
		}

	}

	private static boolean isAnagrams(String ist, String nd) {
		if (ist.length() != nd.length()) {
			return false;
		}
		ist = sortChars(ist);
		nd = sortChars(nd);
		if (ist.equalsIgnoreCase(nd)) {
			return true;
		}
		return false;
	}

	private static String sortChars(String ist) {

		char[] sortt = ist.toLowerCase().toCharArray();
		Arrays.sort(sortt);
		return String.valueOf(sortt);
	}

}
