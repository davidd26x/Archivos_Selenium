package utilities;

import com.github.javafaker.Faker;
import listeners.ResultListeners;
import listeners.TestListeners;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

@ExtendWith({ResultListeners.class, TestListeners.class})
public class BaseTest {

    protected Faker faker;
    protected final String regression = "regression";
    protected final String smoke = "smoke";
    protected SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void masterSetUp() {
        Logs.info("Setup del padre");
        faker = new Faker();
        softAssert = new SoftAssert();
    }

    @AfterMethod(alwaysRun = true)
    public void masterTearDown() {
        Logs.info("Teardown del padre");
    }
}
