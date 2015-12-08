package com.coding;

public class ProgressBar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printProgBar(80);

	}



public static void printProgBar(int percent){
	
    StringBuilder bar = new StringBuilder("[");

    for(int i = 0; i < 50; i++){
        if( i < (percent/2)){
            bar.append("=");
        }else if( i == (percent/2)){
            bar.append(">");
        }else{
            bar.append(" ");
        }
    }

    bar.append("]   " + percent + "%");
    System.out.print("\r" + bar.toString());
} 

}
