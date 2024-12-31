package apitest;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest {

    @Test
    public void testBasicAuth() {
        // Send GET request with Basic Authentication
        RestAssured.given()
                .auth()
                .basic("username", "password")
                .when()
                .get("https://example.com/protected-resource")
                .then()
                .statusCode(404);
    }
}