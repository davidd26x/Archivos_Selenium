package utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected Faker faker;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void masterSetUp() {
        Logs.info("Setup del padre");
        faker = new Faker();
        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void masterTearDown() {
        Logs.info("Teardown del padre");
    }
}
