package com.basic;

public class removeduplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={2,1,2,1,4,4,4};
		int end=a.length;
		for (int i=0;i<end;i++){
			for(int j=i+1;j<end;j++){
				if(a[i]==a[j]){
					int flag=j;
					for(int k=j+1;k<end;k++,flag++){
						a[flag]=a[k];}
					end--;
					j--;
				}
			}
		}
	for(int i=0;i<end;i++){
		System.out.println(a[i]);
	}
	}

}
