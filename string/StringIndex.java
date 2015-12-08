package com.string;

import java.io.UnsupportedEncodingException;

public class StringIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String anshu="the anshu is anshu";
		System.out.println(anshu.lastIndexOf("a"));
		System.out.println(anshu.getBytes());
		byte[] a;
		try {
			a = anshu.getBytes("UTF-8");
			System.out.println(a);
			String an=new String(a,"UTF-8");
			System.out.println(an);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}
