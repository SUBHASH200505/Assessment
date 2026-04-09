package dummyRestApi;

import io.restassured.RestAssured;

public class CreateEmployee {

	public static void main(String[] args) {
		RestAssured.given()
		.contentType("application/json")
		.body("{\"name\":\"admin\",\"salary\":\"50000\",\"age\":\"11\"}")
		
		.when()
			.post("https://dummy.restapiexample.com/api/v1/create")
	
		.then()
			.log().all();
	}

}
