package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.Map.Entry;

public class Sorting_map_based_on_value {

	public static void main(String[] args) {

		HashMap<String, Integer> m1 = new LinkedHashMap<String, Integer>();
		m1.put("anshu", 1);
		m1.put("anshuu", 34);
		m1.put("ansrhu", 3);
		HashMap<String, Integer> h11 = sorthashmap(m1);

		/*
		 * for (Map.Entry<String, Integer> m22 : h11.entrySet()) {
		 * System.out.println(m22.getKey() + " " + m22.getValue()); }
		 */

		for (String keyy : h11.keySet()) {
			System.out.println(keyy + " " + h11.get(keyy));
		}
	}

	private static HashMap<String, Integer> sorthashmap(
			HashMap<String, Integer> m1) {
		List<Entry<String, Integer>> li = new ArrayList<Entry<String, Integer>>(
				m1.entrySet());
		Collections.sort(li, new compared());
		System.out.println(li);
		HashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (Iterator<Entry<String, Integer>> it = li.iterator(); it.hasNext();) {
			Map.Entry<String, Integer> mv = (Entry<String, Integer>) it.next();
			m.put(mv.getKey(), mv.getValue());
		}
		return m;
	}

}

class compared implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Map.Entry<String, Integer> m1,
			Map.Entry<String, Integer> m2) {
		// TODO Auto-generated method stub
		return (m1.getValue().compareTo(m2.getValue()));
	}

}
