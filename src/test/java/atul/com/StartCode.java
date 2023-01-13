package atul.com;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matcher.*;

public class StartCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BaseURL = "";
//		RestAssured.baseURI="https://gorest.co.in";
//		baseURI = "https://gorest.co.in";
//		Allcalls.GETCALL("/public/v2/posts");
//		given().when().get("/public/v2/posts").then().log().all().assertThat().statusCode(200);
//				Given().when().get("https://gorest.co.in/public/v2/posts");
		gorestCo("https://gorest.co.in");
		
	}
//	public static void POSTCALL(String URL) {
//		given().when().post(URL).then().log().all().assertThat().statusCode(200);
//	}
//	public static void GETCALL(String URL){
//		RestAssured.given().when().get(URL).then().log().all().assertThat().statusCode(200);
//	}
	
	public static void gorestCo(String URL){
		RestAssured.baseURI=URL;
		Allcalls.GETCALL("/public/v2/posts");
	}
}
