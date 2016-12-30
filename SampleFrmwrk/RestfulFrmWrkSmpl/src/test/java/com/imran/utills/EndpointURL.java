package com.imran.utills;

public enum EndpointURL {
	
	GET_EVENT("/59"),
	UPDATECFEVENT("/id"),
	UPDATEVFEVENT("/id");
	
	String resourcePath;
	
	EndpointURL(String resourcePath){
		this.resourcePath=resourcePath;
	}
	
	public String getResourcePath(){
		return this.resourcePath;
	}
	public String getResourcePath(String data){
		return this.resourcePath+data;
	}

}
