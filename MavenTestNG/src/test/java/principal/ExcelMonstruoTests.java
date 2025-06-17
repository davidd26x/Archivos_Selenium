package principal;

import data.CustomData;
import jdk.jfr.Description;
import modelos.Monstruo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.ExcelReader;
import utilities.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import java.util.List;

public class ExcelMonstruoTests extends BaseTest {
    private List<Monstruo> listaMonstruo;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        listaMonstruo = ExcelReader.obtenerListaMonstruo();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando nombre 1er elemento")
    @Severity(SeverityLevel.BLOCKER)
    public void primerTest() {
        final var primerMonstruo = listaMonstruo.get(0);
        Assert.assertEquals(primerMonstruo.getNombre(), "TOLOSA", "1er nombre no hace match");
    }

    @Test(groups = {regression})
    @Description("Verificando longitud de la lista")
    @Severity(SeverityLevel.CRITICAL)
    public void segundoTest() {
        final var n = listaMonstruo.size();
        Assert.assertEquals(n, 14, "longitud incorrecta");
    }

    @Test(groups = {regression})
    @Description("Verificando nivel 3er elemento")
    @Severity(SeverityLevel.MINOR)
    public void tercerTest() {
        final var tercerMonstruo = listaMonstruo.get(2);
        Assert.assertEquals(tercerMonstruo.getNivel(), 22, "3er nivel no hace match");
    }

    @Test(groups = {regression})
    @Description("Verificando toda la info del ultimo elemento")
    @Severity(SeverityLevel.NORMAL)
    public void cuartoTest() {
        final var ultimoMonstruo = listaMonstruo.get(listaMonstruo.size() - 1);

        softAssert.assertEquals(ultimoMonstruo.getNombre(), "LUCENA");
        softAssert.assertEquals(ultimoMonstruo.getEdad(), 3);
        softAssert.assertEquals(ultimoMonstruo.getPeso(), 8.57);
        softAssert.assertEquals(ultimoMonstruo.getGenero(), "MACHO");
        softAssert.assertEquals(ultimoMonstruo.getNivel(), 36);

        softAssert.assertAll();

    }

    @Test(dataProvider = CustomData.DP_NAME, dataProviderClass = CustomData.class, groups = {regression})
    @Description("Verificando las edades y niveles de todos")
    @Severity(SeverityLevel.TRIVIAL)
    public void quintoTest(Monstruo monstruo) {
        softAssert.assertTrue(monstruo.getEdad() > 0);
        softAssert.assertTrue(monstruo.getNivel() < 100);
        softAssert.assertAll();
    }
}