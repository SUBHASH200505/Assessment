package ninjaHRM;

import io.restassured.RestAssured;

public class AddProject {
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/xml")
        .body("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
        		+ "<Project>\r\n"
        		+ "	<createdBy>rockstar</createdBy>\r\n"
        		+ "	<projectName>admin</projectName>\r\n"
        		+ "	<status>Completed</status>\r\n"
        		+ "	<teamSize>1</teamSize>\r\n"
        		+ "</Project>")
        
		// HTTP METHOD
			.when()
				.post("http://49.249.28.218:8091/addProject")
			
		// RESPONSE
			.then()
				.log().all();
		}
}
