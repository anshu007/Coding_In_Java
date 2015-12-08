package com.coding;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*How do you write a ping routine in Java*/

public class pingaroutine {

	
	public static void main(String[] args) {
		
		        String host = "192.168.1.5" ;//IP address 
				int timeOut = 3000; // 3 seconds at least 
				boolean status;
				try {
					status = InetAddress.getByName(host).isReachable(timeOut);
					System.out.println(status);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		

	}

}
