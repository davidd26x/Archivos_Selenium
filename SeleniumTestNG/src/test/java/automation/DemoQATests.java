package automation;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class DemoQATests extends BaseTest {
    @Test
    public void keyboard1Test() {
        Logs.info("Navegando a la página");
        driver.get("https://demoqa.com/text-box");

        final var faker = new Faker();
        final var fullName = faker.name().fullName();
        Logs.debug("fullname: %s", fullName);

        final var usernameInput = driver.findElement(By.id("userName"));
        Logs.info("Haciendo click para dar focus");
        usernameInput.click();

        Logs.info("Presionando SHIFT y escribiendo en mayúsculas");
        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys(fullName)
                .keyUp(Keys.SHIFT)
                .perform();

        Logs.info("Verirficando que el input esté en mayúsculas");
        Assert.assertEquals(
                usernameInput.getAttribute("value"),
                fullName.toUpperCase()
        );
    }

    @Test
    public void keyboard2Test() {
        Logs.info("Navegando a la página");
        driver.get("https://demoqa.com/text-box");

        final var faker = new Faker();
        final var address = faker.address().fullAddress();
        Logs.debug("Address: %s", address);

        final var currentAddressInput = driver.findElement(By.id("currentAddress"));

        Logs.info("Escribiendo la dirección y dando focus");
        currentAddressInput.sendKeys(address);
        currentAddressInput.click();

        Logs.info("Seleccionando y copiando el contenido");
        new Actions(driver)
                .keyDown(Keys.CONTROL) //presionar Ctrl
                .sendKeys("a") //ctrl + a selecciona contenido
                .sendKeys("c") //ctrl + c copia contenido
                .keyUp(Keys.CONTROL) //suelta ctrl
                .perform(); //realiza acciones

        final var permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        Logs.info("Doy focus al click");
        permanentAddressInput.click();

        Logs.info("Pegando el contenido");
        new Actions(driver)
                .keyDown(Keys.CONTROL) //presiona ctrl
                .sendKeys("v") //ctrl + v pega el contenido
                .keyUp(Keys.CONTROL) //suelta ctrl
                .perform(); //realiza acciones

        Logs.info("Verificando que ambos input tengan el mismo texto");
        Assert.assertEquals(
                permanentAddressInput.getAttribute("value"),
                currentAddressInput.getAttribute("value")
        );
    }
}
