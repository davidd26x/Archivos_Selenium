package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuBurger;
import pages.ShoppingPage;
import pages.TopBar;
import utilities.BaseTest;
import utilities.Logs;

public class BurgerMenuTests extends BaseTest {
    private final LoginPage loginPage = new LoginPage();
    private final MenuBurger menuBurger = new MenuBurger();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.openBurgerMenu();
    }

    @Test(groups = {regression, smoke})
    public void logoutTest() {
        menuBurger.clickLogout();
        loginPage.waitPageToLoad();
        loginPage.verifyPage();
    }

    @Test(groups = {regression})
    public void aboutLinkTest() {
        menuBurger.verifyAboutLink("https://saucelabs.com");
    }
}
