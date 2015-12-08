package com.coding;

public class pascal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
			  for (int line = 1; line <= 9; line++)
			  {
			    int C = 1;  // used to represent C(line, i)
			    for (int i = 1; i <= line; i++)
			    {
			      System.out.print(C + " "); 
			      // The first value in a line is always 1
			      C = C * (line - i) / i;  
			    }
			   System.out.println();
			  }
			
		// TODO Auto-generated method stub

	}

}
