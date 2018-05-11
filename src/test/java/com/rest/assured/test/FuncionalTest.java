package com.rest.assured.test;

import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;

public class FuncionalTest {
@BeforeClass
    public static void setup() {
    String port =System.getProperty("server.port");
   // RestAssured.useRelaxedHTTPSValidation();
    if (port == null){
        RestAssured.port=Integer.valueOf(8080);
    }else
    {
        RestAssured.port=Integer.valueOf(port);
    }

    String basePath= System.getProperty("server.base");
    if (basePath==null)
    {
        basePath="/typicode/demo/";
    }

       RestAssured.basePath=basePath;

    String baseHost=System.getProperty("server.host");
    if (baseHost==null)
    {
        baseHost="https://my-json-server.typicode.com";

    }
    RestAssured.baseURI=baseHost;

}
}
