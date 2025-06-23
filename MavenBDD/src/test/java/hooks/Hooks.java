package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utilities.Logs;

public class Hooks {
    @BeforeAll
    public static void beforeAll() {
        Logs.info("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        Logs.info("afterAll");
    }

    @Before
    public static void before(Scenario scenario) {
        Logs.info("before: %s", scenario.getName());
    }

    @After
    public static void after(Scenario scenario) {
        Logs.info("after: %s, status: %s", scenario.getName(), scenario.getStatus());
    }
}