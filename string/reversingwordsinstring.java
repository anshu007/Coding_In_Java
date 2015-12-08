package com.string;

public class reversingwordsinstring {

	/**
	 * @param args
	 */

	// program to reverse words in string

	public static void main(String[] args) {

		String mainn = "anshu loves yogitha";
		String[] splitt = mainn.split(" ");
		String sentence = "";

		for (int i = splitt.length - 1; i >= 0; i--) {
			sentence += i == 0 ? splitt[i] : splitt[i] + " ";
		}

		System.out.println(sentence);

	}

}
