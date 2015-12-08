package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThraedPool {

	/**
	 * @param args
	 */
	//int a[10];
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new thread11("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService 
           // executor.submit(new thread11("" + i))
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  	

	}

}

class thread11 implements Runnable{
	
	String msg;
	
	thread11(String msg){
		this.msg=msg;
	}

	@Override
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName() + " start " + msg);
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " end ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
