package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testApp() {
        Assert.assertEquals("Hello, Maven!", "Hello, Maven!");
    }
}
