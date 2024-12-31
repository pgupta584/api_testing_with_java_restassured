package apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleGetTest {

    @Test
    public void testGetRequest() {
        // Send GET request
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");

        // Assert response status code
        Assert.assertEquals(response.statusCode(), 200, "Status Code is not 200");

        // Assert response body contains expected data
        Assert.assertTrue(response.body().asString().contains("userId"), "Response body does not contain userId");
    }
}
