package com.coding;

public class GarbageCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rc=Runtime.getRuntime();
		
		System.out.println(rc.totalMemory());
		System.out.println(rc.freeMemory());
		rc.gc();
		System.out.println(rc.freeMemory());
		
		

	}

}
