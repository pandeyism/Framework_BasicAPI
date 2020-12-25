package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

//PostRequest -------method requires body data and URI

public class HTTPmethods {
	
	Properties pr;
	
	public HTTPmethods(Properties pr)
	{
		this.pr=pr;
	}
	
	
	public Response PostRequest(String bodyData, String URIName)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(URIName));
		return res;
	}

}
