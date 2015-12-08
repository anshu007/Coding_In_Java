package com.coding;

public class pascal1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = null;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if(j != 1 && j != i && i > 2)
					a[i*j] = a[(i-1)*j] + a[(i-1)*(j-1)];
				else
					a[i*j] = 1;
				System.out.println(a[i*j]);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
