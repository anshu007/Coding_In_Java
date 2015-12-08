package com.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class frequency_of_words {
	int i = 1;

	public static void main(String[] args) {
		String a = "anshu is a good good boy aanshu aanshu is is ghumta";
		countoccurence(a);
	}

	private static void countoccurence(String a) {
		String[] and = a.split(" ");
		for (String values : and) {
			System.out.println(values);
		}
		Map<String, Integer> map1 = new ConcurrentHashMap<String, Integer>();
		List<String> list = Arrays.asList(a.split(" ")); // to split a string
		System.out.println(list);
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String an : list) {
			// System.out.println(map.values());
			Integer m = map.get(an);
			m = (m == null) ? 1 : ++m;
			map.put(an, m);
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println("Character " + m.getKey() + " occurs "
					+ m.getValue() + " times ");
			countvowels((String) m.getKey());
		}
	}

	private static void countvowels(String v) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		int lengh = v.length();
		for (int j = 0; j < lengh; j++) {
			if (v.charAt(j) == 'a')
				a++;
			if (v.charAt(j) == 'e')
				e++;
			if (v.charAt(j) == 'i')
				i++;
			if (v.charAt(j) == 'o')
				o++;
			if (v.charAt(j) == 'u')
				u++;
		}
		System.out.println("a:" + a);
		System.out.println("e:" + e);
		System.out.println("i:" + i);
		System.out.println("o:" + o);
		System.out.println("u:" + u);
	}
}
