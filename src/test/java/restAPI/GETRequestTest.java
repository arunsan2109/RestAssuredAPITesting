package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETRequestTest {

	//  Communicate with web service
	
	@Test
	public void getDetails() {

		try {
			// Create a reference for Response interface
			Response response;
			
			// Make a request to the server by specifying the method Type and the
			// method URL.
			// This will return the Response from the server. Store the response in
			// a reference variable created above.
			
			response = RestAssured.get("https://www.google.com/");
			// print the message body of the response received from the server
			
			String responseBody = response.getBody().toString();
			System.out.println("Response Body is One =>  " + responseBody);
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
