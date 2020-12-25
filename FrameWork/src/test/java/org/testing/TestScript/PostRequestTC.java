package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;


import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPmethods;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class PostRequestTC {
	
	public static void main(String[] args) throws IOException 
	{
		Properties p=PropertiesFileLoad.PropertiesLoad("../FrameWork/URIs.properties");
		String body=JsonFileLoad.jsondata("../FrameWork/src/test/java/org/testing/Resources/BodyData.json");
		HTTPmethods http=new HTTPmethods(p);
		Response res=http.PostRequest(body,"QA_URI");
		ResponseStatusCodeValidate.ResponseStatusValidate(201, res);
		
	}

}
