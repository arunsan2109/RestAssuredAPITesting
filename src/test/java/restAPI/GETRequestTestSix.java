package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETRequestTestSix {
	
	// To read different header types from HTTP Response.
	
	@Test
	public void getDetails(){
		
		//Create a reference for Response interface
		Response response;
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
		response = RestAssured.get("https://www.postman.com/");
		
		// Reader header is passed with exact header name as argument.
		// In the below line,we will get header named "Content-Type"
		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);
		
		// Reader header is passed with exact header name as argument.
		// In the below line,we will get header named "Server"
		String serverType = response.header("Server");
		System.out.println("Server Type: " +serverType);
		
		// Reader header is passed with exact header name as argument.
		// In the below line,we will get header named "Date"
		String date = response.header("Date");
		System.out.println("Date value: " + date);
	}

}
