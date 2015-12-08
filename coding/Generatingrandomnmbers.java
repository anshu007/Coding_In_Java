package com.coding;

import java.util.Random;

public class Generatingrandomnmbers {
	static Random random1 = new Random();
	
	public static void main(String[] args) {
		
		System.out.println(random1.nextInt(10));
		generateRandomNumeric(8);
	}

	    public  static void generateRandomNumeric( int length ) {
	        String allowedChars = "0123456789";
	        char[] password = new char[length];

	        for ( int i = 0; i < password.length; i++ ) {
	            password[i] = allowedChars.charAt( random1.nextInt( allowedChars.length() ) );
	        }
	        String s=new String(password);
	        System.out.println(password);
	    }

}
