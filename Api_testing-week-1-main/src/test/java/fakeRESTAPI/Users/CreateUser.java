package fakeRESTAPI.Users;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class CreateUser {
	@Test
	public void createuser() {
		
		String str = """
            {
                "id": 1,
                "userName": "subhash",
                "password": "subhash@2005"
             }
                    """;
		RestAssured.given()
		.contentType("application/json")
			.body(str)
	
		// HTTP METHOD
			.when()
				.post("https://fakerestapi.azurewebsites.net/api/v1/Users")

			// RESPONSE
			.then()
				.log().all()
				.assertThat()
					  .statusCode(200)
					  .statusLine(Matchers.containsString("HTTP"))
					  .time(Matchers.lessThan(5000l));
	}
}
