package com.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

class dog1 {
	int size;

	public dog1(int i) {
		this.size = i;
		// TODO Auto-generated constructor stub
	}
}

class comparator1 implements Comparator<dog1> {

	@Override
	public int compare(dog1 o1, dog1 o2) {
		return o1.size - o2.size;
	}

}

public class treewithcomparator {

	public static void main(String[] args) {

		TreeSet<dog1> ts1 = new TreeSet<dog1>(new comparator1());
		ts1.add(new dog1(3));
		ts1.add(new dog1(2));
		Iterator<dog1> itt = ts1.iterator();
		while (itt.hasNext()) {
			dog1 c = itt.next();
			System.out.println(c.size);
		}

	}

}
