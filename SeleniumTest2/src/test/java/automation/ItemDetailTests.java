package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ItemDetailsPage;
import pages.LoginPage;
import pages.ShoppingPage;
import utilities.BaseTest;
import utilities.Logs;

public class ItemDetailTests extends BaseTest {
    private final ShoppingPage shoppingPage = new ShoppingPage();
    private final ItemDetailsPage itemDetailPage = new ItemDetailsPage();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToItemDetail("Sauce Labs Fleece Jacket");
    }

    @Test(groups = {regression, smoke})
    public void verifyPageTest() {
        itemDetailPage.verifyPage();
    }

    @Test(groups = {regression})
    public void backToProductsTest() {
        itemDetailPage.clickBackToProducts();
        shoppingPage.waitPageToLoad();
        shoppingPage.verifyPage();
    }
}
