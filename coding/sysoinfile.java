package com.coding;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//printing the output to  file instead of console
public class sysoinfile {
	
	public static void main(String[] args) {
		
		try {
			System.setOut(new PrintStream(new FileOutputStream("C:/anshuu")));
			System.setErr(new PrintStream(new FileOutputStream("C:/anshuu")));
			System.out.println("haha");
			System.err.println("jajaja");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
