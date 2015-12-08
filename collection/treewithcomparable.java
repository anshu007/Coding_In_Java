package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class dog implements Comparable<dog> {

	int size;

	public dog(int i) {
		this.size = i;
	}

	@Override
	public int compareTo(dog o) {
		return (this.size - o.size);
	}
}

public class treewithcomparable {
	public static void main(String[] args) {
		TreeSet<dog> ts = new TreeSet<dog>();
		ts.add(new dog(3));
		ts.add(new dog(2));
		HashSet<dog> intSet = new HashSet<dog>();
		intSet.add(new dog(3));
		intSet.add(new dog(2));
		for (Iterator<dog> it = intSet.iterator(); it.hasNext();) {
			System.out.println(it.next().size);
		}
		Iterator<dog> itt = ts.iterator();
		while (itt.hasNext()) {
			dog c = itt.next();
			// System.out.println(c.size);
		}
	}
}
