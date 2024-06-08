package com.simplilearn;

import java.util.concurrent.TimeUnit;

public class WebServiceClient {
	
	public String fetchUserData() throws InterruptedException{
		//simulate network delay
		TimeUnit.SECONDS.sleep(2); // simulated delay of 2 seconds
		return "User Data";
	}

}
