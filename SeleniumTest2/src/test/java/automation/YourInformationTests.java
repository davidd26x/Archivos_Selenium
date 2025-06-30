package automation;

import data.CustomDataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.YourInformationPage;
import utilities.BaseTest;

public class YourInformationTests extends BaseTest {
    private final YourInformationPage yourInformationPage = new YourInformationPage();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToYourInformationPage();
    }

    @Test(
            groups = {regression},
            dataProviderClass = CustomDataProviders.class,
            dataProvider = CustomDataProviders.DP_MENSAJES_ERROR
    )
    public void errorMessagesTest(
            String name,
            String lastname,
            String zipcode,
            String errorMessage
    ){
        yourInformationPage.fillData(name, lastname, zipcode);
        yourInformationPage.verifyErrorMessage(errorMessage);
    }
}
