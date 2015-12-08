package com.basic;

public class env_variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		       
		            String value = System.getenv("JAVA_HOME");
		            String a="C:/Program Files/Java/jdk1.7.0";
		            System.setProperty("JAVA_HOME",a);
		            if (value != null) {
		                System.out.println(value);
		        }
		}

		// TODO Auto-generated method stub

	

}
