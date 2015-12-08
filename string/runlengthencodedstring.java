package com.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class runlengthencodedstring {

	public static void main(String[] args) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String an = in.nextLine();
		String str1 = "";
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < an.length(); i++) {
			String a = Character.toString(an.charAt(i));
			// char a=an.charAt(i);
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				count = 1;
				map.put(a, count);
			}

		}
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry pairs = it.next();
			String key = (String) pairs.getKey();
			String Value = String.valueOf(pairs.getValue());
			str1 = str1 + key + (Value.equals("1") ? "" : Value);

		}

		System.out.println(str1);

	}

}
