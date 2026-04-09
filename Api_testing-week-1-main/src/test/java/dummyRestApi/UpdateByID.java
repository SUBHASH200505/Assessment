package dummyRestApi;

import io.restassured.RestAssured;

public class UpdateByID {

	public static void main(String[] args) {
		RestAssured.given()
		.contentType("application/json")
		.body("{\"name\":\"admin2\",\"salary\":\"100000\",\"age\":\"80\"}")
		
		.when()
			.put("https://dummy.restapiexample.com/api/v1/update/7")
	
		.then()
			.log().all();

	}

}
