package com.string;

public class Replacewithspace {

	/**
	 * @param args
	 */

	// code to remove $#$ from string
	public static void main(String[] args) {

		String a = "anshu$#$loves$#$yogitha$#$mahadasu$#";
		String replaced = replaceWithSpace(a);
		System.out.println(replaced);

	}

	private static String replaceWithSpace(String a) {
		char[] str = a.toCharArray();
		int length = str.length;
		for (int i = 0; i < length; i++) {
			if (i < (length - 2) && str[i] == '$' && str[i + 1] == '#'
					&& str[i + 2] == '$') {
				str[i] = ' ';
				int aa = i + 1;
				while (aa < (length - 2)) {
					str[aa] = str[aa + 2];
					aa++;
				}
				length = length - 2;
			}

		}

		String ret = new String(str, 0, length);
		return ret;

	}

}
