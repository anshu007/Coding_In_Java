package com.multithreading;
import java.util.ArrayList;
import java.util.List;



 class queue1 {
		  queues a1=new queues();
		Thread t1=new Thread(){
			public void run(){	
				a1.insert("yoyo");
			//	a1.display();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				a1.delete(0);
			}
		};
	

}
 
 public class queue{
	 public static void main(String[] args){
	 queue1 q=new queue1();
	 q.t2.start();
	 q.t1.start();
	 queue1 q2=new queue1();
	// q2.t1.start();
	// q2.t1.start();
	 
 }}

 class queues{
	private List<String> list=new ArrayList<String>();
	 public boolean isempty() {
		if(list.isEmpty()){
			return true;
		}
		return false;
	}

	public boolean isfull() {
		if(list.size()==2){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return true;
		}
		return false;
	}

	 synchronized  void insert(String str){
		 System.out.println("adding");
		list.add(str);
		System.out.println("notifying");
		notify();
	}
	 synchronized  void delete(int i) 
	{
		 if(isempty()){try {
			 System.out.println("waiting");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		 System.out.println("removing");
		list.remove(i);
		if(list.isEmpty()){
			System.out.println("list is empty");
		}
		//notify();
	}
	public void display(){
		for(int i=0;i<list.size();i++){
			System.out.println("element is" +list.get(i) + "at" +i);
		}
	}
	
	
}
