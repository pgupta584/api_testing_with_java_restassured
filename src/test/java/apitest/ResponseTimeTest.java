package apitest;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResponseTimeTest {

    @Test
    public void testResponseTime() {
        // Send GET request and measure response time
        long responseTime = RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .getTime();

        // Assert response time is less than 1000 ms
        Assert.assertTrue(responseTime < 1000, "Response time is too slow");
    }
}
