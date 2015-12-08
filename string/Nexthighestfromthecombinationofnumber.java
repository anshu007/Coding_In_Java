package com.string;

import java.util.Arrays;
import java.util.Scanner;

// approach
/*
 * Start from last number and compare it with previous,if previous is greator then continue,else find the index of the number
 * greater than prvious and swap previous with that,and finaly sort all the numbers next to previous
 * 
 * 
 */
public class Nexthighestfromthecombinationofnumber {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s = new Scanner(System.in);
		int first = s.nextInt();
		nexthighest(first);
		Nexthighestfromthecombinationofnumber a = new Nexthighestfromthecombinationofnumber();
		// System.out.println("next highest num is "+ nexthighest);
	}

	private static void nexthighest(int first) {

		String an = String.valueOf(first);// converting integer to string
		char[] ab = an.toCharArray();
		for (int i = ab.length - 1; i >= 0; i--) {
			if (ab[i - 1] >= ab[i]) {
				continue;
			} else {
				int index = find_index(ab, ab[i - 1]);
				char temp = ab[index];
				ab[index] = ab[i - 1];
				ab[i - 1] = temp;
				Arrays.sort(ab, i, ab.length);
				break;
			}

		}
		print(ab);
	}

	private static void print(char[] ab) {
		for (int m = 0; m < ab.length; m++) {
			System.out.print(ab[m]);
		}
		// TODO Auto-generated method stub

	}

	private static int find_index(char[] ab, int c) {
		int j;
		for (j = ab.length - 1; j >= 0; j--)
			if (ab[j] > c) {
				break;
			}
		return j;
		// TODO Auto-generated method stub

	}

}
