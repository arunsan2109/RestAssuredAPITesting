package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GETRequestTestSeven {
	
	// Restful services with JSON
	
	@Test
	public void getDetails(){
		//Create a reference for Response interface
		Response response;
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
		response = RestAssured.get("https://www.postman.com/");
		
		// First get the JsonPath object instance from the Response interface
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		String contentType = jsonPathEvaluator.get("Content-Type").toString();
		System.out.println("Content Type: " +contentType);
	}

}
