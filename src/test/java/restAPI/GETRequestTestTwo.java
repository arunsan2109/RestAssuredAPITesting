package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETRequestTestTwo {
	
	// REST API Test using REST Assured
	
	@Test
	public void getDetails(){
		
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://www.google.com/";
		
		// Get the RequestSpecification of the request that you want to sent to the server
		//The server is specified by the BaseURI that we have specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/search?q=up");
		
		//print the message body of the response received from the server
		String responseBody = response.getBody().toString();
		System.out.println("Response Body is Two=> " +responseBody);
	}

}
