package automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class TutorialsPointTest extends BaseTest {
    @Test
    public void pestanaTest() {
        Logs.info("Navegando a la página");
        driver.get("https://www.tutorialspoint.com/selenium/browser-windows.php");

        Logs.debug("Obteniendo el id de la pestana actual para reconocerlo posteriormente");
        final var tabId = driver.getWindowHandle();
        Logs.debug("tabId: %s", tabId);

        Logs.info("Haciendo click en el boton new tab");
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();

        final var windowHandlesSet = driver.getWindowHandles();
        Logs.debug("Window handles set: %s", windowHandlesSet);

        Logs.debug("Nos posicionamos en la nueva pestana");
        for (var windowHandle : windowHandlesSet) {
            if (!windowHandle.equals(tabId)) {
                driver.switchTo().window(windowHandle);
            }
        }

        Logs.info("Verificando el texto");
        Assert.assertTrue(
                driver.findElement(By.xpath("//h1[text()='New Tab']")).isDisplayed()
        );
        Logs.info("Cerrando la pestana actual");
        driver.close();

        Logs.debug("Regresando el focus a la ventana original");
        driver.switchTo().window(tabId);

        Logs.info("Verificando que se regreso a la ventana original");
        Assert.assertTrue(
                driver.findElement()
                        .isDisplayed()
        );
    }
}
