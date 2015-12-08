package com.readingwritingtopropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;


public class Reading {
	
	public static void main(String args[])
	{
		Properties prop=new Properties();
		try {
			
			String a="mahajan";
			InputStream inp=new FileInputStream("C://property.txt");
			prop.load(inp);
			//Map m=(Map) prop.propertyNames();
			Enumeration<?> e=prop.propertyNames();
			while(e.hasMoreElements())
			{
				String key=(String) e.nextElement();
				String info=prop.getProperty(key);
				if(info.equals(a))
				System.out.println("info is"+info);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
