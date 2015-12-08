package com.readingwritingtofile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.StringTokenizer;


//program is to read a text file and print unique words//

public class ReadTextFileandprintuniquewords {

	/**
	 * @param args
	 */
	static HashSet<String> hs=new LinkedHashSet<String>();
	public static void main(String[] args) {	
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:/anshu1.txt"));
			String lineread;
			while((lineread=br.readLine())!=null){
				//StringTokenizer st=new StringTokenizer(lineread," ");
				String [] an=lineread.split(" ");
				/*while(st.hasMoreTokens()){
					hs.add(st.nextToken());
			}*/
				for(String put:an){
					hs.add(put);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(String element:hs){
			System.out.println(element);
		}
	}

}
