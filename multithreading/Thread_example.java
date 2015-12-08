package com.multithreading;
class anshu{
	 int i;
	
}

class thread1 extends Thread{
	
	thread1(anshu an){
	add();
	}
	int i=0;
	Thread th=new Thread(){
	public void run()
	{
	add();	 
	}
	};
	private synchronized void add() {
		       System.out.println("into add1");
		       try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		show(++i);
		
	}
	
	private void show(int j) {
		System.out.println(j);
		// TODO Auto-generated method stub
		
	}

	Thread th2=new Thread(){
		public void run(){
			add();
		}
	};
	
}
public class Thread_example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		anshu a=new anshu();
		thread1 t1=new thread1(a);
	//	t1.th.start();
		t1.start();
	/*	thread1 t2=new thread1(a);
		t2.th2.start();*/
	//	t1.th2.start();
		//thread1 t2=new thread1();
		//t2.th.start();

	}

}
