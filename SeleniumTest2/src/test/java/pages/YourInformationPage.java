package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class YourInformationPage extends BasePage {
    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By zipcodeInput = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By errorLabel = By.cssSelector("h3[data-test='error']");

    @Override
    @Step("Esperando que la pagina de your information cargue")
    public void waitPageToLoad() {
        waitPage(firstNameInput, this.getClass().getSimpleName());
    }

    @Override
    @Step("Verificando la pagina de your information")
    public void verifyPage() {
        Logs.info("Verificando la pagina de your information");
        softAssert.assertTrue(find(firstNameInput).isDisplayed());
        softAssert.assertTrue(find(lastNameInput).isDisplayed());
        softAssert.assertTrue(find(zipcodeInput).isDisplayed());
        softAssert.assertTrue(find(continueButton).isDisplayed());
        softAssert.assertAll();
    }

    @Step("Rellenando el formulario")
    public void fillData(String name, String lastName, String zipCode){
        if(!name.isEmpty()){
            Logs.info("Escribiendo el firstname");
            find(firstNameInput).sendKeys(name);
        }

        if(!lastName.isEmpty()){
            Logs.info("Escribiendo el lastname");
            find(lastNameInput).sendKeys(lastName);
        }

        if(!zipCode.isEmpty()){
            Logs.info("Escribiendo el zipCode");
            find(zipcodeInput).sendKeys(zipCode);
        }

        Logs.info("Haciendo click en continue");
        find(continueButton).click();
    }

    @Step("Verificando mensaje de error")
    public void verifyErrorMessage(String errorMessage){
        Logs.info("Verificando mensaje de error");
        final var errorLabelElement = find(errorLabel);

        softAssert.assertTrue(errorLabelElement.isDisplayed());
        softAssert.assertEquals(errorLabelElement.getText(), errorMessage);
        softAssert.assertAll();
    }
}
