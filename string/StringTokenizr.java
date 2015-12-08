package com.string;

//by default on basis of space

import java.util.StringTokenizer;

public class StringTokenizr {

	public static void main(String[] args) {

		String anshu = "hi my name\\ is anshu and ,i like yogita;but i think she hates me";
		StringTokenizer st = new StringTokenizer(anshu, "\\,;");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

	}

}
