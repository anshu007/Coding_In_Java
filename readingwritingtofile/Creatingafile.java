package com.readingwritingtofile;

import java.io.File;
import java.io.IOException;

public class Creatingafile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file=new File("C:"+File.separator+"file1"+File.separator+"anshu.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParentFile());
		System.out.println(file.getPath());
		// TODO Auto-generated method stub

	}

}
