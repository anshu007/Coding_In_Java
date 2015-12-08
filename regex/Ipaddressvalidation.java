package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipaddressvalidation {

	public static void main(String[] args) {

		ipaddress ipp = new ipaddress();
		ipp.calculateIp("255@255.255.255");

	}

}

class ipaddress {

	public Pattern p;
	public Matcher m;
	public static final String ipAddress = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\@"
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	void calculateIp(String ip) {
		m = p.matcher(ip);
		boolean a = m.matches();
		System.out.println(a);

	}

	public ipaddress() {
		p = Pattern.compile(ipAddress);
	}

}