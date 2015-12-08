package com.basic;

class im{
	private final String s;
	
	im(String s){
		this.s=s;
		
	}
	public String getvalue(){
		return "base"+s;
	}
	 }

class ime extends im{
     String inh;
	ime(String s) {
		super(s);
		inh=s;
		// TODO Auto-generated constructor stub
	}
	void setvalue(String inh){
	
		this.inh=inh;
	}
	public String getvalue(){
		return "inherited"+inh;
	}
	
}

public class immutableclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	im i=new im("anshu");
		ime i1=new ime("inherited");
	System.out.println(i1.getvalue());
	
	    
		
		
		// TODO Auto-generated method stub

	}

}
