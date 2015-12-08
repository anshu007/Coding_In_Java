
package com.coding;

public class convertingnumbertobinary {
	
public static void main(String[] args){
	StringBuffer sb=new StringBuffer();
	sb.append("a");
	System.out.println(sb);
		int number=25;
		while(number>0){
			sb=sb.append(number%2);
			number=number/2;
		}
		System.out.println(sb.reverse());
	}


}
