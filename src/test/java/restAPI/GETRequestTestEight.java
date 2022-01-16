package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GETRequestTestEight {
	
	// Assertions
	
	@Test
	public void getDetails(){
		//Create a reference for Response interface
		Response response;
		
		// Make a request to the server by specifying the method Type and the method URL
		// This will return the Response from the server. Store the response in a reference variable created above.
		response = RestAssured.get("http://www.google.com");
		
		//Validating STATUS CODE from response
		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);
		
		String contentType = response.contentType();
		Assert.assertEquals("text/html; charset=ISO-8859-1", contentType);
		
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains("Introduction"), false);		
		
	}

}
