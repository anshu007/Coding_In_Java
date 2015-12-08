package com.coding;

import org.apache.commons.codec.binary.Base64;;

public class Base64encodingdecoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="anshu is good boy";
		byte[] encode=Base64.encodeBase64(a.getBytes());
		System.out.println(new String(encode));
		
		byte[] decode=Base64.decodeBase64(encode);
		
		System.out.println(new String(decode));
 
	}

}
