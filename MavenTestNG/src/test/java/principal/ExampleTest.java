package principal;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Logs;

public class ExampleTest {
    @BeforeMethod
    public void setUp() {
        Logs.info("Precondicion");
    }

    @Test
    public void primerTest() {
        Logs.info("Soy el test que solo muestra los logs");
    }

    @Test
    public void segundoTest() {
        Logs.info("Soy el test 2 que solo muestra los logs");
    }

    @AfterMethod
    public void tearDown() {
        Logs.info("Postcondicion");
    }
}
