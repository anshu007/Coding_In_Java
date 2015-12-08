 package com.basic;
/*equals will compare the memory reference only,in case of string and integer it is overrided thats why compare contents*/
class anshu1{
	
	int i;
	 anshu1(){
		System.out.println("truu");
	}
	
	anshu1(int a){
		this.i=a;
	}
	boolean equals(anshu1 obj){
		if(this.i==obj.i)
		return true;
		return false;
		
		
	}
}

public class equals_and_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		anshu1 a=new anshu1(6);
		anshu1 a1=new anshu1(6);
		if(a.equals(a1)){
			System.out.println("tre");
		}
		
	
	

	}

}
