package com.basic;

class An { 
int i, j; 
} 
class Bn { 
int i, j; 
} 
class C extends An { 
int k; 
} 
class D extends An { 
int k; 
} 
class instance_of { 
public static void main(String args[]) { 
An An = new An(); 
Bn Bn = new Bn(); 
C c = new C(); 
D d = new D(); 
// compare types of derived types 
An ob; 
ob = d; // An reference to d 
System.out.println("ob now refers to d"); 
if(ob instanceof D) 
System.out.println("ob is instance of D"); 
System.out.println(); 
ob = c; // An reference to c 
System.out.println("ob now refers to c"); 
if(ob instanceof D) 
System.out.println("ob can be cast to D"); 
else 
System.out.println("ob cannot be cast to D"); 
if(ob instanceof An) 
System.out.println("ob can be cast to An"); 

} 
}
