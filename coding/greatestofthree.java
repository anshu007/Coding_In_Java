package com.coding;
import java.util.Scanner;


public class greatestofthree {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter 2nd number");
		int b=scan.nextInt();
		System.out.println("enter 3rd number");
		int c=scan.nextInt();
		int big = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
		
		System.out.println("biggest among all is " + big);
		
	}

}
