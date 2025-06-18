package principal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Logs;

public class ExampleTests {
    @BeforeEach
    public void setUp() {

    }

    @Test
    public void primerTest() {
        Logs.info("Soy el test que solo muestra los logs");
    }

    @AfterEach
    public void tearDown() {
        Logs.info("Soy el test 2 que solo muestra los logs");
    }
}
