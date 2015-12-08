package com.multithreading;

/* class methods{
	 
	  synchronized void add(){
		  System.out.println("addmin");
		  mul();
		 
	 }
	  
	 synchronized void mul(){
		  System.out.println("mul");
	  }
	
}*/
public class deadlock_between_threads {
	String str1="anshu";
	String str2="ji";
	/*methods m=new methods();*/
	Thread m1=new Thread("1"){
		public void run(){
			synchronized(str1){
				try {
					System.out.println("inside syncronised");
					//Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(str2){
					System.out.println("byee1");
					
				
			}
				
				}
		}
	};
	Thread m2=new Thread("2"){
		public void run(){
		synchronized(str2){
				try {
					//Thread.sleep(10);
					System.out.println("indie 2");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(str1){
					System.out.println("byee2");
					
				
			}
		}}
		};
		
	public static void main(String[] args){
		deadlock_between_threads d1=new deadlock_between_threads();
	d1.m1.start();
	d1.m2.start();
	
	
	}
}
