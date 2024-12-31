package apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class APITest {
    private Response response;

    // Base URI for the API
    @Test
    public void testGetAccount() {
        // Base URI for RestAssured
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Sending DELETE request to delete post with ID 1 and asserting the response
        given()
                .when()
                .delete("/posts/1") // DELETE request to delete post with ID 1
                .then()
                .statusCode(200); // Assert status code is 200 (OK)
    }
}
