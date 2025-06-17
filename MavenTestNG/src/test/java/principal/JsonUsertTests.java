package principal;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import modelos.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.JsonReader;
import utilities.BaseTest;

public class JsonUsertTests extends BaseTest {
    private User user;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        user = JsonReader.leerUsuarioJson();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando que el id sea positivo")
    @Severity(SeverityLevel.CRITICAL)
    public void primerTest() {
        Assert.assertTrue(user.getId() > 0);
    }

    @Test(groups = {regression})
    @Description("Verificando el valor correcto de lng")
    @Severity(SeverityLevel.TRIVIAL)
    public void segundoTest() {
        Assert.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);
    }

    @Test(groups = {regression})
    @Description("Verificando que la longitud de company bs sea correcta")
    @Severity(SeverityLevel.CRITICAL)
    public void tercerTest() {
        Assert.assertTrue(user.getCompany().getBs().length() > 10);
    }

    @Test(groups = {regression})
    @Description("Verificando la información del usuario")
    @Severity(SeverityLevel.BLOCKER)
    public void cuartoTest(){
        softAssert.assertEquals(user.getName(), "Mrs. Dennis Schulist");
        softAssert.assertEquals(user.getId(), 6);
        softAssert.assertEquals(user.getUsername(), "Leopoldo_Corkery");
        softAssert.assertEquals(user.getWebsite(), "ola.org");
        softAssert.assertAll();
    }
}
