package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class sortt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[]={23};
		int b=0;
		List<comp> l=new ArrayList<comp>();
		for(int i=0;i<a.length;i++){
			b=countOne(a[i]);
			l.add(new comp(a[i],b));
		}
		Collections.sort(l, new cl());		
		for(Iterator<comp> it=l.iterator();it.hasNext();){
			System.out.println(it.next().num);
		}
	}

	private static int countOne(int i) {
		int count=0;
		
		while(i>0){
			if(i%2==1){
				count++;
			}
			i=i/2;
		}
		System.out.println(count);
		return count;
	}
}

class comp{
	
	int num;
	int count;
	
	comp(int num,int count){
		this.num=num;
		this.count=count;
	}
	
}

class cl implements Comparator<comp>{

	@Override
	public int compare(comp o1, comp o2) {
		return o2.count-o1.count;
	}
	
}