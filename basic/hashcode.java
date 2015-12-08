package com.basic;

class hashcode1{
	void call(){
		System.out.println("an");
	}
}
public class hashcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		hashcode1 h=new hashcode1();
	//	hashcode1 h1=new hashcode1();
	//	hashcode1 h2=new hashcode1();
		for(int i=0;i<4001;i++)
		System.out.println(h.hashCode());
	//	System.out.println(h1.hashCode());
	//	System.out.println(h2.hashCode());
		// TODO Auto-generated method stub

	}

}
