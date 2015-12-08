package com.coding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class convertingstringtodate {

	public static void main(String[] args){
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String a="01/10/2013";
		Date date1;
		try {
			date1 = formatter.parse(a);
			System.out.println(date1);
			System.out.println(formatter.format(date1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
