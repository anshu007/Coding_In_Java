package com.basic;

public class intfloat {
	
	void a(){
		System.out.println("leleo");
	}

	static void b(){
		System.out.println("dedo");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="1";
		double d = Double.parseDouble(a);
		if(d<=0){
			System.out.println("hi");
		}
		else
			System.out.println(d);
		intfloat.b();
		intfloat aa=new intfloat();
		aa.b();
	}
	

}
