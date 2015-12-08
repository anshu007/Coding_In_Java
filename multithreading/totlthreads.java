package com.multithreading;

public class totlthreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Thread.activeCount());
		try {
			Thread.sleep(300000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
