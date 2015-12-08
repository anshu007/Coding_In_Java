package com.collection;

import java.util.HashMap;
import java.util.Map;

public class sortOnFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int[] arr = { 1, 4, 6, 8, 9 };
		print(arr);
		/*
		 * for(int i:arr){ System.out.println(i); }
		 */

	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stu
		for (int i : arr) {
			System.out.println(i);
		}
		arr[1] = 10;

	}

}
