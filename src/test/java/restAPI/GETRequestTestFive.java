package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GETRequestTestFive {
	
	// Use of getHeaders() method to print all the Headers from HTTP Response
	
	@Test
	public void getDetails(){
		
		//Create a reference for Response interface
		Response response;
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
		response = RestAssured.get("https://learning.postman.com/docs/getting-started/introduction/");
		
		// Get all the headers, return value is of type Headers.
		Headers allHeaders = response.getHeaders();
		
		// Headers class implements Iterable interface.
		// Iterate over all the Headers using an advance for loop as shown in the code below
		for(Header header: allHeaders){
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
		
	}

}
