package com.coding;

public class Demo {
	
	public static void main(String[] args){
		
		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		String[] splits = assetClasses.split(":");

		System.out.println("splits.size: " + splits.length);

		for(String asset: splits){
		System.out.println(asset);
		System.out.println(assetClasses);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}

}
