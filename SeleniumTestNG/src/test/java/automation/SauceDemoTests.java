package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class SauceDemoTests extends BaseTest {
    @Test(groups = {regression, smoke})
    public void usuarioInvalidoTest() {
        rellenarFormularioLogin("locked_out_user", "secret_sauce");

        Logs.info("Verificando mensaje de error");
        final var errorLabel = driver.findElement(By.cssSelector("h3[data-test='error']"));

        softAssert.assertTrue(errorLabel.isDisplayed());
        softAssert.assertEquals(errorLabel.getText(),
                "Epic sadface: Sorry, this user has been locked out.");
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    public void usuarioValidoTest() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        final var inventoryList = driver.findElement(By.className("inventory_list"));

        Logs.info("Verificando que el inventory list esté visible");
        Assert.assertTrue(inventoryList.isDisplayed());
    }

    @Test(groups = {regression})
    public void detalleProductoTest() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        final var imageList = driver.findElements(By.cssSelector("img[class='inventory_item_img']"));

        Logs.info("Haciendo click en el primer elemento de la lista");
        imageList.get(0).click();

        //Logs.info("Esperando que cargue el detalle del producto");
        //sleep(1000);

        Logs.info("Verificando detalle del producto");
        softAssert.assertTrue(driver.findElement(By.className("inventory_details_name")).isDisplayed());
        softAssert.assertTrue(driver.findElement(By.className("inventory_details_desc")).isDisplayed());
        softAssert.assertTrue(driver.findElement(By.className("inventory_details_price")).isDisplayed());
        softAssert.assertTrue(driver.findElement(By.xpath("//button[text()='Add to cart']")).isDisplayed());
        softAssert.assertTrue(driver.findElement(By.className("inventory_details_img")).isDisplayed());
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    public void select1Test() {
        rellenarFormularioLogin("standard_user", "secret_sauce");
        final var selectWebElement = driver.findElement(By.cssSelector("select[data-test='product-sort-container']"));

        final var select = new Select(selectWebElement);

        Logs.info("Seleccionamos los items de manera alfabética: Z - A");
        select.selectByValue("za");

        final var itemList = driver.findElements(By.className("inventory_item_name"));

        Logs.info("Obteniendo primer elemento");
        final var primerElemento = itemList.get(0).getText();

        Logs.info("Obteniendo el ultimo elemento");
        final var ultimoElemento = itemList.get(itemList.size() - 1).getText();

        Logs.info("Verificando los nombres");
        softAssert.assertEquals(primerElemento, "Test.allTheThings() T-Shirt (Red)");
        softAssert.assertEquals(ultimoElemento, "Sauce Labs Backpack");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    public void select2Test() {
        rellenarFormularioLogin("standard_user", "secret_sauce");
        final var selectWebElement = driver.findElement(By.cssSelector("select[data-test='product-sort-container']"));

        final var select = new Select(selectWebElement);

        Logs.info("Seleccionamos los precios de menor a mayor");
        select.selectByValue("lohi");

        final var priceList = driver.findElements(By.className("inventory_item_price"));

        Logs.info("Obteniendo el primer elemento");
        final var primerPrecio = Double.parseDouble(priceList.get(0).getText().replace("$", ""));

        Logs.info("Obteniendo el último precio");
        final var ultimoPrecio = Double.parseDouble(priceList.get(priceList.size() - 1).getText().replace("$", ""));

        Logs.info("Verificando los precios");
        softAssert.assertEquals(primerPrecio, 7.99);
        softAssert.assertEquals(ultimoPrecio, 49.99);
    }

    @Test(groups = {regression})
    public void link1Test() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        final var facebookLabel = driver.findElement(By.xpath("//a[text()='Facebook']"));

        Logs.info("Verificando que el hipervínculo este correcto");
        softAssert.assertTrue(facebookLabel.isDisplayed());
        softAssert.assertTrue(facebookLabel.isEnabled());
        softAssert.assertEquals(facebookLabel.getAttribute("href"), "https://www.facebook.com/saucelabs");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    public void link2Test() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        final var linkedInLabel = driver.findElement(By.xpath("//a[text()='LinkedIn']"));

        Logs.info("Verificando que el hipervínculo este correcto");
        softAssert.assertTrue(linkedInLabel.isDisplayed());
        softAssert.assertTrue(linkedInLabel.isEnabled());
        softAssert.assertEquals(linkedInLabel.getAttribute("href"), "https://www.linkedin.com/company/sauce-labs/");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    public void link3Test() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        Logs.info("Abriendo menú burger");
        driver.findElement(By.id("react-burger-menu-btn")).click();

        Logs.info("Esperando que abra el menú");
        sleep(2000);

        final var aboutClick = driver.findElement(By.id("about_sidebar_link"));

        Logs.info("Verificando el vinculo de about");
        softAssert.assertTrue(aboutClick.isDisplayed());
        softAssert.assertTrue(aboutClick.isEnabled());
        softAssert.assertEquals(aboutClick.getAttribute("href"), "https://saucelabs.com/");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    public void logOutTest() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        Logs.info("Abriendo menú burger");
        driver.findElement(By.id("react-burger-menu-btn")).click();

        Logs.info("Esperando que abra el menú");
        sleep(2000);

        final var logOutClick = driver.findElement(By.id("logout_sidebar_link"));

        logOutClick.click();

        Logs.info("Esperando que llegue a la página inicial");
        sleep(2000);

        Logs.info("Verificando un elemento de la página principal");
        Assert.assertTrue(driver.findElement(By.id("user-name")).isDisplayed());
    }

    private void rellenarFormularioLogin(String username, String password) {
        Logs.info("Navegando a la página");
        driver.get("https://www.saucedemo.com/");

        //sleep(3000);

        Logs.info("Escribiendo el username");
        driver.findElement(By.id("user-name")).sendKeys(username);

        Logs.info("Escribiendo el password");
        driver.findElement(By.id("password")).sendKeys(password);

        Logs.info("Haciendo click en el botón de Login");
        driver.findElement(By.id("login-button")).click();

        //sleep(2000);
    }
}
