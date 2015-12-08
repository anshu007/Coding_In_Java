package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("anshu", 1);
		m1.put("anshuu", 34);
		m1.put("ansrhu", 3);
	    change(m1);
	    m1=null;
	    System.out.println(m1);

	}

	private static void change(HashMap<String, Integer> m1) {
		
		m1=null;
		//m1.clear();
		
	}

}
