package com.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Blockingqueue {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		BlockingQueue  sq=new LinkedBlockingDeque();
		// TODO Auto-generated method stub
		
		Thread a=new Thread(new Producer1(sq));
		
		Thread b=new Thread(new Consumer1(sq));
		
		a.start();
		
		b.start();

	}

}

class Producer1 implements Runnable{

	BlockingQueue<Integer> sq;
	
	Producer1(BlockingQueue sq){
		this.sq=sq;
		
	}
	@Override
	public void run() {
    
		for(int i=0;i<10;i++){
			System.out.println("Producer produces " + i);
			try {
				sq.put(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer1 implements Runnable{

   BlockingQueue sq;
	
	Consumer1(BlockingQueue sq){
		this.sq=sq;
		
	}
	@Override
	public void run() {
		
		//while (true){
			for(int i=0;i<10;i++){	
			try {
				System.out.println("Consumer consumes " + sq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub
		
	}
	
}
