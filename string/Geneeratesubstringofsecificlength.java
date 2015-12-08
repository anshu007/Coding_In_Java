package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//how to genertae substrings of specific given length
//HackerRank https://www.hackerrank.com/challenges/java-strings
public class Geneeratesubstringofsecificlength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.next();
		int number = in.nextInt();
		generateSubstring(line, number);
	}

	private static void generateSubstring(String line, int number) {
		int count = 0;
		String smaller = "";
		String larger = "";
		for (int i = 0; i < line.length(); i++) {
			if (count <= line.length() && number <= line.length()) {
				String sub = line.substring(count, number);
				// System.out.println(sub);
				if (sub.compareTo(smaller) < 0 || i == 0) {
					smaller = sub;
				}
				if (sub.compareTo(larger) > 0 || i == 0) {
					larger = sub;
				}
				count = count + 1;
				number = number + 1;
			}
		}
		System.out.println(smaller);
		System.out.println(larger);
	}
}
