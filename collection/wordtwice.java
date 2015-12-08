package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*in one string array{'Good',''word','good','woRd'...} 

 how can i print like Good--2 
 Word-2 times appeared in the array.even Good and good are different in case sensitive.*/
public class wordtwice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] an = new String[] { "good", "bad", "GooD", "Bad" };
		/*
		 * ArrayList<String> li=new ArrayList<String>(); for(String a:an){
		 * li.add(a); }
		 */
		Map<String, Integer> h = new HashMap<String, Integer>();
		for (String a : an) {
			String neww = a.toLowerCase();
			if (h.containsKey(neww)) {
				h.put(neww, h.get(neww) + 1);
			} else {
				h.put(neww, 1);
			}

		}

		for (Map.Entry<String, Integer> m : h.entrySet()) {
			System.out.println(m.getKey() + "-- " + m.getValue());
		}

	}

}
