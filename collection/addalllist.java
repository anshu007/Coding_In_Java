package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class addalllist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.addAll(a);
		b.set(1,4);
		
		for(Integer c:a){
			System.out.println(c);
		}
		
		for(Integer d:b){
			System.out.println(d);
		}

	}

}
