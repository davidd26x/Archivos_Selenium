package principal;

import modelos.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.JsonReader;
import utilities.BaseTest;

public class JsonUsertTests extends BaseTest {
    private User user;

    @BeforeMethod
    public void setUp() {
        user = JsonReader.leerUsuarioJson();
    }

    @Test
    public void primerTest() {
        Assert.assertTrue(user.getId() > 0);
    }

    @Test
    public void segundoTest() {
        Assert.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);
    }

    @Test
    public void tercerTest() {
        Assert.assertTrue(user.getCompany().getBs().length() > 10);
    }
}
