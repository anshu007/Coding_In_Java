package com.string;

public class CountingNumberOfwordsinString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String word = "       anshu    is a good guy  ";

		String[] arr = word.split("\\s+");

		if (word.charAt(0) == ' ') {
			System.out.println((word.split("\\s+").length) - 1);
		} else {
			System.out.println(word.split("\\s+").length);
		}

	}

}
