package com.coding;

import java.util.Arrays;
import java.util.Comparator;

public class sortinglistofstrings {


	public static void main(String[] args) {
		
		String[] strings = {"Here", "are", "some", "sample", "strings", "to", "be", "sorted"};

		Arrays.sort(strings, new string_Compare());
		

		for (String s: strings)
		  System.out.print(s + " ");
		  }
}

class string_Compare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		 int c = s1.length() - s2.length();
		    if (c == 0)
		      c = s1.compareToIgnoreCase(s2);
		    return c;
	}
	
	
}
