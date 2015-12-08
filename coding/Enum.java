package com.coding;



public class Enum {
	

	public static enum MessageDeliveryKeys {
		AMDS_MAIL_URL("email.amds.url"), AMDS_MAIL_PROFILE_NAME(
				"email.amds.profile.name"), AMDS_MAIL_PROFILE_PASSWORD(
				"email.amds.profile.password"), AMDS_MAIL_SERVICE_PROVIDER(
				"email.amds.provider");
		
		MessageDeliveryKeys(String key){
			this.key=key;
		}
		String key;
		
		public String getKey() {
			return key;
		}
		
		
		public String toString(){
			return key;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(MessageDeliveryKeys.AMDS_MAIL_PROFILE_NAME);
		// TODO Auto-generated method stub
		
		System.out.println(MessageDeliveryKeys.AMDS_MAIL_PROFILE_NAME.getKey());
		
		//System.out.println(MessageDeliveryKeys.AMDS_MAIL_PROFILE_NAME.setKey("a"));

	}

}
