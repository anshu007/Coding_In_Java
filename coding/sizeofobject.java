package com.coding;

import java.lang.instrument.Instrumentation;

 class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}

public class sizeofobject {

	private int x;
	private int y;
	
	sizeofobject(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ObjectSizeFetcher.getObjectSize(new sizeofobject(1,2)));
		// TODO Auto-generated method stub

	}

}
