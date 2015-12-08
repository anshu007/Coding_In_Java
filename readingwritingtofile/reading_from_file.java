package com.readingwritingtofile;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*Given a file with the following entry 

ID EMp_Name Manager_ID 
1 "ABC" 2 
2 "PRW" Null 
3 "DEF" 2 
4 "PRE" 3 
5 "DKF" 4 

Print the Respective Manager hierarchy in the below format 

PRW | ABC | 
| DEF | PRE | DKF 

The Employe Manager table can be extended to Hold N entry*/

public class reading_from_file {
	
	public static void main(String[] args){
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		List<String> li;
		try {
			li = Files.readAllLines(Paths.get("C:/myfile/myfile.txt"), Charset.defaultCharset());
			for(String an:li){
				String[] split1=an.split("\\s+");
				for(String a:split1){
					System.out.println(a);
				}
				String an1=split1[1].substring(1,split1[1].lastIndexOf('"')) ;
				Integer numb=Integer.parseInt(split1[2]);
				tm.put(numb, an1);
			}
			 for (Map.Entry<Integer, String> mm : tm.entrySet()) { 
					//System.out.println(mm.getKey());
					System.out.println(mm.getValue());
				}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
	

}
