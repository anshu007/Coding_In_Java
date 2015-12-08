package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

class anshu{
	
}
public class comparator_treeset {
	public static void main(String[] args){
	
	int n[]={2,1,6,5,1,2};
	TreeSet<Integer> t=new TreeSet<Integer>();
	for(int n1:n){
		t.add(n1);
	}
//	for(Integer an:t)
	System.out.println(t);
	
	}
	
	
	
}
class SizComparator implements Comparator<Object> {
	public int compare(Integer tv1, Integer tv2) {
		
		if (tv1 > tv2) {
			return 1;
		} else if (tv1 < tv2) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
