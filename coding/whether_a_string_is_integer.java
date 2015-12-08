package com.coding;

/*program to tell whether a string is integer without using parseint*/


public class whether_a_string_is_integer {
	public static void main(String[] args) {
		
		String check="123g";
		char[] c=check.toCharArray();
		char a='0';
		char b='9';
		for(char ne:c){
			if(ne<a || ne>b)
				System.out.println("false");
		}
		
		
		

	}

}
