package com.basic;

public class construct {
	static String anshu;
	 private  construct(String anshu){
		this.anshu=anshu;
	}
	 static void show(){
		 System.out.println(anshu);
	 }
	 
	 static{
		 construct c=new construct("ansu");
		 c.show();
		 construct c2=new construct("ji");
		 c2.show();
	 }
	
	public static void main(String[] args){
		
		
	}

	

}




