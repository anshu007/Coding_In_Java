package com.customiterator;

import java.util.Iterator;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    // create an array of type Integer
		    Integer[] numbers = new Integer[]{1,2};

		    // create your list and hold the values.
		    Iterator7<Integer> stackOverflowList = new Iterator7<Integer>(numbers);

		    // Since our class Iterator7 is an instance of Iterable, then we can use it on a foreach loop
		   /* for(Integer num : stackOverflowList) {
		        System.out.print(num);
		    }*/
		    for(Iterator<Integer> it=stackOverflowList.iterator();it.hasNext();){
		    	System.out.println(it.next());
		    }

		    // creating an array of Strings
		    String[] languages = new String[]{"C", "C++", "Java", "Python", "Scala"};

		    // create your list and hold the values using the same list implementation.
		    Iterator7<String> languagesList = new Iterator7<String>(languages);

		    System.out.println("");
		    try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    for(Iterator<String> it1=languagesList.iterator();it1.hasNext();){
		    	System.out.println(it1.next());
		    	
		    
		}
		    
	}
}
		   
		    

	//}


