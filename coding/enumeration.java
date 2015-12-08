package com.coding;

public class enumeration {
	
	public  enum AUTH{AID,AOTP,JSAOTP	
	}
	
	public static void main(String[] args) {	
		for(AUTH an:AUTH.values()){
			System.out.println(an);
		}
	}

}
