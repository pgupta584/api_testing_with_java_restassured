package apitest;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAndExtractDataTest {

    @Test
    public void testGetAndExtractData() {
        // Send GET request
        String userId = RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .extract()
                .jsonPath()
                .getString("userId");

        // Assert extracted userId
        Assert.assertEquals(userId, "1");
    }
}