package com.collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> map=new HashMap<String,String>();
		Map <String,Integer> map1=new TreeMap<String, Integer>();
		map1.put("12", 11);
		map1.put("13", 1);
		map1.put("11", 1);
		//map.put("null",1);
		
	//	Collections.sort(map1);
		
		/*for(String key : map.keySet())
		{
			
			System.out.println("value is " + map.get(key));
		}*/
		for(Map.Entry<String,Integer> m:map1.entrySet()){
			//System.out.println(m.getKey()+" " +m.getValue());
			System.out.println(m);
		}

	}

}
