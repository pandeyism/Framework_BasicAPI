package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseDataValidationUsingJsonPath {
	
	public static void ResponseData(String ExpectedData,Response res, String jsonPath)
	{
		String ActualData=res.jsonPath().getString(jsonPath);
		Assert.assertEquals(ActualData,ExpectedData,"Data is not matching");
	}

}
