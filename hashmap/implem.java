package com.hashmap;

public class implem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Hashmap<String,Integer> h=new Hashmap<String,Integer>(16);
		h.put("yogi", 3);
		h.put("yogi", 4);
		h.display();
		

	}

}
