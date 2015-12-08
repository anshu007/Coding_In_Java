package com.coding;

public class greatestand2ndinarray {
	public static void main(String[] args){
		int a[]={23,4,676,998,87};
		greatest(a);
	}

	public static void greatest(int a[]) {
		int max1=0;
		int max2=0;
		for(int num:a)
		{
			if(num>max1)
			{
				max2=max1;
				max1=num;
			}
			else if(num>max2)
			{
				max2=num;
			}
		}
		System.out.println("first largest is " +max1);
		System.out.println("2nd largest is " +max2);
		
	}

}
