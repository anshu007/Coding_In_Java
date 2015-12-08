package com.basic;

import java.util.ArrayList;
import java.util.List;

public class runtimememory {
	
	public static void main(String[] args){
		List<class_list> li=new ArrayList<class_list>();
		for(int i=0;i<100;i++){
			li.add(new class_list("anhsu","ji"));
		}
		//Runtime.getRuntime().gc();
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		long memory=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println(memory);
	}

}

class class_list{
	String a;
	String b;
	class_list(String a,String b){
		this.a=a;
		this.b=b;
		
	}
}
