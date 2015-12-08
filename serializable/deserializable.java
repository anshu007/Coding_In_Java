package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserializable {
	public static void main(String[] args) {
		 Student stu = null;
		 
		   try{
			   FileInputStream fin = new FileInputStream("c:\\anshu.ser");
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   stu = (Student) ois.readObject();
			   ois.close();
			   System.out.println(stu);
		   }catch(Exception ex){
			   ex.printStackTrace(); 
		   } 

	}

}
