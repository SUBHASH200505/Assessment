package ninjaHRM;

import io.restassured.RestAssured;

public class SignUp {
	public static void main(String[] args) {
			
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/json")
        .body("{\r\n"
        		+ "  \"address\": \"admin1\",\r\n"
        		+ "  \"contact\": \"1111111111\",\r\n"
        		+ "  \"email\": \"rockkk@gmail.com\",\r\n"
        		+ "  \"gender\": \"male\",\r\n"
        		+ "  \"name\": \"rock\",\r\n"
        		+ "  \"password\": \"admin\",\r\n"
        		+ "  \"role\": \"prof\",\r\n"
        		+ "  \"username\": \"rock\"\r\n"
        		+ "}")
        
		// HTTP METHOD
			.when()
				.post("49.249.28.218:8091/signup")
			
		// RESPONSE
			.then()
				.log().all();
			}
	}
