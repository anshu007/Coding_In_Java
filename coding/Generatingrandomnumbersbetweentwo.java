package com.coding;

import java.util.Random;

public class Generatingrandomnumbersbetweentwo {

	/**
	 * @param args
	 */
	int arr[]=new int[10];
	
	//generate random number between 50 and 60
	public static void main(String[] args) {
		
		
		Random rand=new Random();
		int low=50;
		int high=60;
		int value=rand.nextInt((high-low)+1)+low;
		System.out.println(value);

	}

}
