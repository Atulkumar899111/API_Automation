package atul.com;

import io.restassured.RestAssured;

public class seturl {
	
	public void setUrl(String Url) {
		RestAssured.baseURI=Url; 
	}
	

}
