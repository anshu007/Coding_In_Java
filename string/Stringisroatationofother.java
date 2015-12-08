package com.string;

public class Stringisroatationofother {

	/**
	 * @param args
	 */
	
	//Program to check whether a string is rotated version of other string
	
	
	public static void main(String[] args) {
		
		String ist="anshu";
		String second1="uansj";
		
		if(ist.length()==second1.length() && (ist+ist).indexOf(second1)!=-1){
			System.out.println("Strings are rotated");
		}
		else
			System.out.println("Not rotated");

	}

}
