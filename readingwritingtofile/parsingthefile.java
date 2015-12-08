package com.readingwritingtofile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class parsingthefile {

	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader br=new BufferedReader(new FileReader("C:/jiji.log"));
			String in=null;
			while((in=br.readLine())!=null){
				StringTokenizer st=new StringTokenizer(in,";,/'\"");
				System.out.println(st.nextToken());
				while(st.hasMoreTokens()){
					if(st.nextToken().equalsIgnoreCase("aok"))
					System.out.println("true");
				}
				//System.out.println(in);
				
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
