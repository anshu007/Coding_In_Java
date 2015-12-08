package com.coding;

public class duplicatenumberinanarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n= 565688044;
		// TODO Auto-generated method stub
       int count=0;
		
	//	String a=String.valueOf(n);
		
		
		while(n>0){
			int j=n%10;
			if(j==6){
				count++;
			}
			
			n=n/10;
			
		}
		System.out.println(count);
	}

}
