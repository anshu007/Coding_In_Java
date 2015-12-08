package com.readingwritingtofile;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class Reading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\anshufile.txt"));
			/*Reader reader = new InputStreamReader( new FileInputStream( "C://anshull.txt" ),
					       "UTF-8" // most likely that the encoding of the file
*/					  /* );*/
			int i;
			char c;
			String an=null;
			while((an=br.readLine())!=null)
	         {
	           // c=(char)i;
	            System.out.println("Character Read: "+an );
	         }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub

	}

}
