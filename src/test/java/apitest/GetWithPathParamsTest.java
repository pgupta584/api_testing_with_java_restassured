package apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWithPathParamsTest {

    @Test
    public void testGetWithPathParams() {
        // Send GET request with path parameters
        Response response = RestAssured.given()
                .pathParam("id", 1)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/{id}");

        // Assert the status code
        Assert.assertEquals(response.statusCode(), 200);

        // Assert that the response contains the correct post ID
        Assert.assertTrue(response.body().asString().contains("\"id\": 1"));
    }
}