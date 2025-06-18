package principal;

import annotations.Regression;
import annotations.Smoke;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import modelos.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reader.JsonReader;
import utilities.BaseTest;

public class JsonUserTests extends BaseTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = JsonReader.leerUsuarioJson();

    }

    @Test
    @Regression
    @Smoke
    @Description("Probando el id sea positivo")
    @Severity(SeverityLevel.TRIVIAL)
    public void primerTest() {
        Assertions.assertTrue(user.getId() > 0);
    }

    @Test
    @Regression
    @Smoke
    @Description("Probando el valor correcto del Lng")
    @Severity(SeverityLevel.MINOR)
    public void segundoTest() {
        Assertions.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);
    }

    @Test
    @Regression
    @Smoke
    @Description("Probando la longitud de company bs sea correcta")
    @Severity(SeverityLevel.CRITICAL)
    public void tercerTest() {
        Assertions.assertTrue(user.getCompany().getBs().length() > 10);
    }

    @Test
    @Regression
    @Smoke
    @Description("Probando la informacion del user")
    @Severity(SeverityLevel.BLOCKER)
    public void cuartoTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(user.getName(), "Mrs. Dennis Schulist"),
                () -> Assertions.assertEquals(user.getId(), 6),
                () -> Assertions.assertEquals(user.getUsername(), "Leopoldo_Corkery"),
                () -> Assertions.assertEquals(user.getWebsite(), "ola.org")
        );
    }
}
