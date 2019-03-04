package com.example.demo;

import static io.restassured.RestAssured.when;

import org.junit.jupiter.api.Test;

public class exampletestapi extends ElastestBase{
	@Test
	public void testPageUp() {
		String appHost = System.getenv("ET_SUT_HOST");
		
		when().
			get("https://" + appHost + ":8443/").
		then().
			statusCode(200);
	}
}
