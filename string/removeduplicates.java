package com.string;

import java.util.HashMap;
import java.util.Hashtable;

public class removeduplicates {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 8, 5, 9, 5, 6, 8, 9 };

		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		for (int a : arr) {
			if (hp.containsKey(a)) {
				continue;
			} else {
				hp.put(a, 1);
			}

		}
		for (Integer key : hp.keySet()) {
			System.out.println(key);
		}
		for (Integer values : hp.values()) {
			System.out.println(values);
		}

	}

}
