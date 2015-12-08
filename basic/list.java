package com.basic;
import java.util.ArrayList;
import java.util.List;


public class list {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(23);
		List a=l;
		a.add("anshu");
		
		for(Object k:a)
			System.out.println(k);
		
		// TODO Auto-generated method stub

	}

}
