package com.coding;

public class superclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ss="anshu";
		Class an=ss.getClass();
		System.out.println(an.getSuperclass());
		
		Object a=new Object();
		
		Class ab=a.getClass();
		System.out.println(ab.toString());
		System.out.println(ab.getSuperclass());
		// TODO Auto-generated method stub
		Class av=ab.getClass();
		System.out.println(av.getSuperclass());
		

	}

}
