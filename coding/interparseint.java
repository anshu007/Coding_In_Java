package com.coding;

 class a {
	 
	 static boolean an;
	 
	 
	 static void override(){
		 System.out.println(an);
		 System.out.println("anshu");
		 
	 }
	
	
}

class b extends a{
	
	static void override(){
		System.out.println("ji");
		
	}
	
	
}

 class d{
	
	public static void main(String[] args) {
	a aa=new b();
	//b bb =new b();
        aa.override();
    //    bb.override();
	}
}


