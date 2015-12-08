package com.serializable;

import java.io.Serializable;  
  

import java.io.*;  
class serializable{
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi",22);  
  
  FileOutputStream f=new FileOutputStream("c://anshu.ser");  
  ObjectOutputStream out=new ObjectOutputStream(f);  
  out.writeObject(s1);
  out.flush();  
  
  System.out.println("success");  
 }  
} 


class Student implements Serializable{  
	private static final long serialVersionUID = 2L;
	 static int id;  
	 static String name;  
	 transient int age;//Now it will not be serialized  
	 public Student(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }  
	 public String toString(){
		 return new StringBuffer(" id ").append(this.id).append(" name ").append(this.name).append(" age ").append(this.age).toString();
	 }
	}  



