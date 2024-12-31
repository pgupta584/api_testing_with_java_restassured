package apitest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequestTest {

    @Test
    public void testPostRequest() {
        // Define request body in JSON format
        String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}";

        // Send POST request
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");

        // Assert status code
        Assert.assertEquals(response.statusCode(), 201);

        // Assert the response body contains expected values
        Assert.assertTrue(response.body().asString().contains("foo"));
    }
}