package com.jvm;

public class crashjvm {

	
	    public static void main(String[] args) {
	        Object[] o = null;
	        while (true) {
	            o = new Object[] {o};
	            //System.exit(0);
	            
	        
	    }
	}
}
