package com.readingwritingtofile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*if we want to write java primitives to the file we have to use DataOutputStream*/

public class DataOutputStream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream fs=new FileOutputStream("C:\\anji.txt");
		//	DataOutputStream do =new DataOutputStream(fs);
			String an="anshu";
			//do.write(an);
			DataOutputStream output = new DataOutputStream(fs);
			try {
				output.writeBytes(an);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
