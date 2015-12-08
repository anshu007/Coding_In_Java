package com.coding;
import java.util.Scanner;


public class multiplytwonumbersusingadditionwithrecursion {
	static int count=0;
	public static void main(String[] args){
		System.out.println("enter frst");
		Scanner s=new Scanner(System.in);
		int first=s.nextInt();
		System.out.println("enter 2nd");
		int second=s.nextInt();
		int result=mul(first,second);
		System.out.println(result);
	}

	private static int mul(int first, int second) {
		
		if(second==0){
			return 0;
		}
		return count=first+mul(first,second-1);
	}

}
