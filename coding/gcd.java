package com.coding;
import java.util.Scanner;


public class gcd {
	static boolean ans;
	static int i=017;
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter 2nd number");
		int b=scan.nextInt();
		int g=gcd(a,b);
		System.out.println("gcd of two numbers " +g);
		System.out.println(ans);
		System.out.println(i);
		
	}

	public static int gcd(int p, int q) {
		// TODO Auto-generated method stub
		
	        if (p % q == 0)
	            return q;
	        return gcd(q, p % q);
	    
	}

}
