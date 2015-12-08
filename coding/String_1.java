package com.coding;

public class String_1 {

	/**
	 * @param args
	 */
	static String change="123456787654321768978902345";
	public static void main(String[] args) {
		
		String changed=add();
		System.out.println(changed);

	}

	private static String add() {
		int a =Integer.parseInt(String_1.change);
		a=a+1;
		String changed=String.valueOf(a);
		return changed;
		
	}

}
