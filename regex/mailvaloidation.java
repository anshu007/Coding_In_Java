package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mailvaloidation {

	public static void main(String[] args) {

		mail ma = new mail();
		mail.calculateMail("mahan07@ca.com.e");
	}

}

class mail {

	public static Pattern p;
	public static Matcher m;
	public static final String mail = "^([A-Za-z0-9]+\\@[A-Za-z0-9]+[\\.A-Za-z0-9]*\\.[A-Za-z]{2,})$";

	static void calculateMail(String mail) {
		m = p.matcher(mail);
		boolean a = m.matches();
		System.out.println(a);

	}

	public mail() {
		p = Pattern.compile(mail);
	}

}