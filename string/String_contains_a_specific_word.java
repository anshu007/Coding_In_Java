package com.string;

public class String_contains_a_specific_word {

	public static void main(String[] args) {
		String[] ansh = { "anshu", "yogita", "bhalla" };
		String rec = "anshu bhal hu";
		System.out.println(rec.indexOf('n'));
		for (String a : ansh) {
			if (rec.indexOf(a) != -1) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}
}
