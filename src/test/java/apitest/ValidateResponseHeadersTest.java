package apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateResponseHeadersTest {

    @Test
    public void testValidateHeaders() {
        // Send GET request
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");

        // Validate Content-Type header
        String contentType = response.getHeader("Content-Type");
        Assert.assertTrue(contentType.contains("application/json"), "Content-Type is not application/json");

        // Validate the response time is within the acceptable range
        long responseTime = response.getTime();
        Assert.assertTrue(responseTime < 2000, "Response time is greater than expected");
    }
}