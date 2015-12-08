package com.basic;

/*Dyanamic mathod dispatch wont work in case of static overrdiding every tym base class is called*/


//todo


public class staticoverriding {
	
	public static void main(String[] args){
		
		B a = (B) new A();
		//A a = b;
   
		//b.func(); // calls B.func()
		for(int i=0;i<=50;i++){
		a.func(); }
	}

}

class A {
    static void func() {System.out.println("anshu");}
}

class B extends A {
    static void func() {System.out.println("mahaan");}
}

