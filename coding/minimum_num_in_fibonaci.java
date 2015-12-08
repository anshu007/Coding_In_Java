package com.coding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Print fibonaci series upto a given num
public class minimum_num_in_fibonaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0;
		int j=0;
		System.out.println("enter numbers");
		Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        /*list.add(1);
        list.add(1);*/
        while(i<num){
        int numm=fib(i);
        list.add(numm);
        i++;
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }
        
        
	}

	private static int fib(int num) {
		if(num==1){
			return 1;
		}
		else if(num==0){
			return 0;
		}
		// TODO Auto-generated method stub
		else 
			return(fib(num-1)+fib(num-2));
	}

}
