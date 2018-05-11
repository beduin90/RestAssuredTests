package com.rest.assured.test;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class PingTest  extends FuncionalTest{
    @Test
    public void basicPingTest()
    {
        given().when().get("/posts").then().statusCode(200);
    }

    @Test
    public void verifyBodyContainsString() {

        given().when().get("/profile").then()
                .body(containsString("aaa"));
    }


}
