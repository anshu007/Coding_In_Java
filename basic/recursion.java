package com.basic;

public class recursion {

	static int k=0;
	public static void main(String[] args) {
		recurse(5);
	}
	
	public static int recurse(int l){
		if(l==2)
			return 2;
		if(l==1)
			return 1;
		while(l>0)
		{
			 k=recurse(--l);	
			 System.out.println(k);
		}
		return 0;
	}

}
