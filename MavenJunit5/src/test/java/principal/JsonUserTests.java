package principal;

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
    public void primerTest() {
        Assertions.assertTrue(user.getId() > 0);
    }

    @Test
    public void segundoTest() {
        Assertions.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);
    }

    @Test
    public void tercerTest() {
        Assertions.assertTrue(user.getCompany().getBs().length() > 10);
    }

    @Test
    public void cuartoTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(user.getName(), "Mrs. Dennis Schulist"),
                () -> Assertions.assertEquals(user.getId(), 6),
                () -> Assertions.assertEquals(user.getUsername(), "Leopoldo_Corkery"),
                () -> Assertions.assertEquals(user.getWebsite(), "ola.org")
        );
    }
}
