package com.collection;
import java.util.ArrayList;
import java.util.Collections;




public class List {
	
	public static void main(String args[]){
		
		ArrayList<Integer> var=new ArrayList<Integer>();
		var.add(3);
		var.add(2);
		var.add(5);
		Collections.sort(var);
		for(Integer s:var)
		{
			System.out.println(s);
		}
		
	}

}
