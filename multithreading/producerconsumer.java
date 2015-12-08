package com.multithreading;



public class producerconsumer {
	public static void main(String[] args) {
		prco po=new prco();
		Runnable r=new producer(po);
		Thread p=new Thread(r);
		Runnable r1=new consumer(po);
		Thread p1=new Thread(r1);
		p.start();
		p1.start();
	}
}

class producer implements Runnable{
	 prco pc;
	public producer(prco pc1){
		this.pc=pc1;
	}	
	public void run(){
	for(int i=0;i<5;i++){
		pc.put(i);
		//System.out.println("producer put "+ i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}}

class consumer implements Runnable{
	 prco pc;
		public consumer(prco pc1){
			this.pc=pc1;
		}
		public void run(){
		for(int i=0;i<5;i++){
			int con=pc.get();
			//System.out.println("consumer get " +con);
		}}
}

class prco{
	int content;
	boolean available=false;
	synchronized int get(){
		System.out.println("get start");
		if(!available){
			try{
				wait();
			}catch (Exception e){
				
			}}
		available=false;
		notify();
		System.out.println("get finish");
		return content;
	}
	
synchronized void put(int i){
	System.out.println("put stat");
	if(available){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	content=i;
	available=true;
	notify();
	System.out.println("put finish");
	}
}
