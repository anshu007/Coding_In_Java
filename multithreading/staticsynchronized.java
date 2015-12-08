package com.multithreading;

class adda{
	
	 static int i=0;
	
	static synchronized int add(){
		return i++;
	}
	
}


public class staticsynchronized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      adda a=new adda();
      adda b=new adda();
      adda c=new adda();
		Thread t1=new Thread(new anew(a));
		Thread t2=new Thread(new anew(b));
		Thread t3=new Thread(new anew(c));
		t1.start();
		t2.start();
		t3.start();
		System.out.println(a.getClass().getCanonicalName());
		

	}

}

class anew implements Runnable{
    adda a;
	anew(adda a){
		this.a=a;
	}
	@Override
	public void run() {
		
		System.out.println(a.add());
		
	}
	
	
}
