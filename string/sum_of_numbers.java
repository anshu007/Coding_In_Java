package com.string;

public class sum_of_numbers {
	public static void main(String[] args) {
		int su = sumNumbers("aa11b33");
		System.out.println(su);
	}

	public static int sumNumbers(String str) {
		String a = null;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			a = "";
			if (Character.isDigit(str.charAt(i))) {
				a = Character.toString(str.charAt(i));
				if (i < str.length() - 1) {
					int j = i;
					j++;
					while (Character.isDigit(str.charAt(j))) {
						a = a + Character.toString(str.charAt(j));
						j++;
						i = j;
						if (j == str.length()) {
							break;
						}
					}
				}
				sum = sum + Integer.parseInt(a);
			}
		}
		return sum;
	}

}
