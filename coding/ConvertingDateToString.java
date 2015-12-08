package com.coding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertingDateToString {
	public static void main(String[] args){
		
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat s=new SimpleDateFormat("ddMMyyyy");
		String a=s.format(date);
		System.out.println(a);
		String av="10-01-2015";
		Date date1;
		try {
			date1 = s.parse(av);
			System.out.println(date1);
			System.out.println(s.format(date1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
