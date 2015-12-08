package com.readingwritingtofile;

//Reading a file in terms of bytes rather than a single byte
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Usingbytes {
	
	public static void main(String[] args){
		File f=new File("C:\\AMDS\\anshu.txt");
		try {
			InputStream is=new FileInputStream(f);
			byte[] data=new byte[(int) f.length()];
			is.read(data);
			String a=new String(data);
			System.out.println(a);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
