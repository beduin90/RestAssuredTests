package com.rest.assured.test;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class HelloWorldRestAssured{

    @Test
    public void makeSureThatGoogleUp(){
        given().when().get("http://www.google.com").then().statusCode(200);

    }

}