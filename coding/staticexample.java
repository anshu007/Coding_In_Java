package com.coding;



public class staticexample {

static int a=6; 
int b=8; 
public static void main(String[] args) {

staticexample obj1=new staticexample(); 
staticexample obj2=new staticexample();

obj1.a=10; 
obj2.a=12;

obj1.b=24; 
obj2.b=36;

System.out.println("Static a"+obj1.a); //12 
System.out.println("Static a"+obj2.a); //12 
System.out.println("Static a"+a); //12

System.out.println("Static b"+obj1.b); //24 
System.out.println("Static b"+obj2.b); //36

}

}
