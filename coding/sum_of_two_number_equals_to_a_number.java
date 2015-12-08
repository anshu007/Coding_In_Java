package com.coding;
import java.util.Scanner;


public class sum_of_two_number_equals_to_a_number {
	
	public static void main(String[] args){
	
	int num;
	int a[]={5,7,9,12,34,45,67};
	System.out.println("enter number");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	int b=sum(a,num);
	if(b==1){
		System.out.println("sum exists");
	}
	else{
		System.out.println("sum doesnt exists");
	}
	
	}

	private static int sum(int[] a, int num) {
		
		 int i=0;
		 int j=a.length-1;
		while(i!=j){
		if(a[i]+a[j]<num){
			i++;}
			else if(a[i]+a[j]>num){
			j--;}
			else if(a[i]+a[j]==num){
				return 1;
			}
		}
		
			return 0;
		
    
		
	}

}
