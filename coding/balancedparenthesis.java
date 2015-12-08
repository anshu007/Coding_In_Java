package com.coding;
import java.util.Scanner;
import java.util.Stack;


public class balancedparenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      System.out.println("entr the string");
	      Scanner in=new Scanner(System.in);
	      String par=in.nextLine();
	      boolean b=balanced(par);
	      if(b)
	    	  System.out.println("balanced");
	      else
	    	  System.out.println("nt balanced");

	}

	private static boolean balanced(String par) {
		if(par.isEmpty())
			return true;
		Stack<Character> an=new Stack<Character>();
		for(int i=0;i<par.length();i++){
			char a=par.charAt(i);
			if(a=='(' || a=='{' || a=='['){
				an.push(a);
			}
			if(a==')' || a == '}' || a==']'){
				if (an.isEmpty()){
					return false;}
				char last=an.peek();
				if(a==')'&&last=='(' || a=='}'&&last=='{' ||  a==']'&&last=='[' )
				{
					an.pop();	
				}
				else
					return false;
			
		}
		
	}
		return an.isEmpty();
	}
	
}


