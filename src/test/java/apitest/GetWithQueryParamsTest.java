package apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWithQueryParamsTest {

    @Test
    public void testGetWithQueryParams() {
        // Send GET request with query parameters
        Response response = RestAssured.given()
                .queryParam("userId", 1)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts");

        // Assert status code
        Assert.assertEquals(response.statusCode(), 200);

        // Assert the response body contains a userId
        Assert.assertTrue(response.body().asString().contains("\"userId\": 1"));
    }
}