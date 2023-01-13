package atul.com;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matcher.*;

import io.restassured.RestAssured;

public class Allcalls {
	public static void POSTCALL(String URL, String querykey, String queryvalue, String headerkey, String headervalue,
			String body) {
		given().queryParam(querykey, queryvalue).header(headerkey, headervalue).body(body).when().post().then().log()
				.all().assertThat().statusCode(200);
	}

	public static void GETCALL(String URL) {
		given().when().get(URL).then().log().all().assertThat().statusCode(200);
	}
}
