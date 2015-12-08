package com.string;

public class revstr {

	public static void main(String[] args) {

		String a = "  anshu  is  good ";
		// System.out.println(a.substring(0,4));
		revstr re = new revstr();
		String b = re.reverse(a);
		System.out.println(b);
		String re1 = re.rev1(b);
		System.out.println(re1);
	}

	private String rev1(String b) {
		String st = "";
		int i = 0;
		for (int j = 0; j < b.length(); j++) {
			if (b.charAt(j) == ' ' || j == b.length() - 1) {
				String val = j == b.length() - 1 ? revstr.reverse(b.substring(
						i, j + 1)) : revstr.reverse(b.substring(i, j)) + ' ';
				st = st + val;
				i = j + 1;
			}
		}
		return st;
	}

	public static String reverse(String a) {
		// TODO Auto-generated method stub
		String rev = "";
		/*
		 * if(a.length()==1){ return a;} else
		 */if (a.length() > 0) {
			rev = rev + a.charAt(a.length() - 1)
					+ reverse(a.substring(0, a.length() - 1));
		}
		return rev;
	}
}
