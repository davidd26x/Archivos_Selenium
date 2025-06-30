package automation;

import data.ExcelReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ShoppingPage;
import utilities.BaseTest;
import utilities.Logs;

public class ShoppingTests extends BaseTest {
    private final ShoppingPage shoppingPage = new ShoppingPage();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToShoppingPage();
    }

    @Test(groups = {regression, smoke})
    public void verifyPageTest() {
        shoppingPage.verifyPage();
    }

    @Test(groups = {regression})
    public void productListPriceTest() {
        final var listaItems = ExcelReader.leerListaProductoExcel();
        shoppingPage.verifyProductsPrice(listaItems);
    }
}
