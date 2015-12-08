package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class movietheatre {

	/**
	 * @param args
	 */
   static ArrayList<String> theatres=new ArrayList<String>();
   
	
   static Map<zip,ArrayList<String>> m=new HashMap<zip,ArrayList<String>>();
   
   
   
	public static void main(String[] args) {
	
	theatres.add("Shakuntala");
	zip z=new zip(100084,"brothers");
    m.put(z,theatres);
    //theatres.clear();
    theatres.add("Shakuntala1");
    m.put(z,theatres);
    
    		for(String s:m.get(z)){
    			System.out.println(s);
    		}
    //theatres.clear();
    
    zip z1=new zip(10084,"brothers");
   // m.put(z1,theatres);
    theatres.clear();
    theatres.add("hari");
    m.put(z1,theatres);
    
    		for(String s:m.get(z1)){
    			System.out.println(s);
    		}
		
		System.out.println(m.entrySet());

	}

}


class zip{
	
	int pincode;
	String movieName;
	
	zip(int pincode, String movieName){
		this.pincode=pincode;
		this.movieName=movieName;
	}
	
	@Override
	public String toString(){
		return pincode +" " + movieName;
		
	}
	
}

/*class movies{
	
	String theatreName;
	
	
	
	
	
}
*/