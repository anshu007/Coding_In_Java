package com.singleton;


 
public class Singletonclass {
 
    private static Singletonclass myObj=null;
    //private static Singletonclass myobj1;
     
    private Singletonclass(){
     
    }
     
    public static Singletonclass getInstance(){
        if(myObj==null){
        	synchronized(Singletonclass.class){
        	if(myObj==null)
            	
            	myObj=new Singletonclass();
        	}
        }
		return myObj;
    }
    
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        Singletonclass ms = getInstance();
        ms.testMe();
        System.out.println(ms);
    }
}