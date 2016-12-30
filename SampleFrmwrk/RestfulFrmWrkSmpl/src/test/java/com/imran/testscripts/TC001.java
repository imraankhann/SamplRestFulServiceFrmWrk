package com.imran.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.imran.utills.EndpointURL;
import com.imran.utills.URL;
import com.imran.webservices.methods.Webservices;
import com.jayway.restassured.response.Response;

public class TC001 {
	
	Response response;
	
	@BeforeClass
	public void setUp(){
		
	}
	
	@Test
	
	public void verifyGetEvents(){
		String url=URL.fixURL+EndpointURL.GET_EVENT.getResourcePath();
		response=Webservices.Get(url);
		System.out.println("Response is : .. > "+response.getBody().asString());
	}

}
