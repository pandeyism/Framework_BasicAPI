package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate {

	public static void ResponseStatusValidate(int ExpectedStatusCode , Response res)
	{
		Assert.assertEquals(ExpectedStatusCode,res.statusCode(),"status code is not matching");
	}
}
