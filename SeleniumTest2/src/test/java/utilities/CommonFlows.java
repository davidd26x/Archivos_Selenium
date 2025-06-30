package utilities;

import data.DataGiver;
import org.openqa.selenium.WebDriver;
import pages.ItemDetailsPage;
import pages.LoginPage;
import pages.MenuBurger;
import pages.ShoppingPage;
import pages.TopBar;
import pages.YourCartPage;
import pages.YourInformationPage;

public class CommonFlows {
    private WebDriver getDriver() {
        return new WebdriverProvider().get();
    }

    public void goToLoginPage() {
        Logs.info("Navegando a la url");
        getDriver().get("https://www.saucedemo.com");

        new LoginPage().waitPageToLoad();
    }

    public void goToShoppingPage() {
        goToLoginPage();

        final var credencialesValidas = DataGiver.getValidCredentials();
        new LoginPage().fillLogin(
                credencialesValidas.getUsername(),
                credencialesValidas.getPassword());
        new ShoppingPage().waitPageToLoad();
    }

    public void openBurgerMenu() {
        goToShoppingPage();

        new TopBar().openMenuBurger();
        new MenuBurger().waitPageToLoad();
    }

    public void goToItemDetail(String itemName) {
        goToShoppingPage();
        new ShoppingPage().goToItemDetail(itemName);
        new ItemDetailsPage().waitPageToLoad();
    }

    public void goToYourCartPage() {
        goToShoppingPage();
        new TopBar().clickShoppingCart();
        new YourCartPage().waitPageToLoad();
    }

    public void goToYourInformationPage() {
        goToYourCartPage();
        new YourCartPage().clickCheckout();
        new YourInformationPage().waitPageToLoad();
    }
}
