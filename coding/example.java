package com.coding;

 class ag{
	int king;
	void king1(){
		System.out.println("haha");
	}
}

 class bg extends ag{
	int queen;
}

public class example {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ag obj1=new ag();
       bg obj2=new bg();
       obj2.king1();
       pass(obj2);
       obj1=obj2;
       obj2=(bg) obj1;
       
		

	}

	private static void pass(ag obj2) {
		// TODO Auto-generated method stub
		
	}

}
