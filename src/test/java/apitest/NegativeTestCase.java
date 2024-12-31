package apitest;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTestCase {

    @Test
    public void testNotFound() {
        // Send GET request to a non-existing resource
        int statusCode = RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/999999")
                .getStatusCode();

        // Assert that status code is 404
        Assert.assertEquals(statusCode, 404);
    }
}