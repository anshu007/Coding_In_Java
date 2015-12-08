package com.readingwritingtopropertyfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class Writing {
	
	public static void main(String args[])
	{
		
		Properties prop =new Properties();
		OutputStream fop=null;
		try {
			fop=new FileOutputStream("C://property.txt");
			Map<String,String> map=new HashMap<String,String>();
			map.put("anshu", "mahajan");
			map.put("rahul", "arg");
			for(String key : map.keySet())
			{
				prop.setProperty(key, map.get(key));
			}
			
			prop.store(fop, "USEROTP");

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fop.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
