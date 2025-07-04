package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverManager {
    private final boolean runServer = System.getenv("JOB_NAME") != null;

    public void buildDriver() {
        if (runServer) {
            buildRemoteDriver();
        } else {
            buildLocalDriver();
        }
    }

    public void killDriver() {
        Logs.debug("Matando el driver");
        new WebdriverProvider().get().quit();
    }

    private void buildLocalDriver() {
        final var headlessMode = System.getProperty("headless") != null;
        var browserProperty = System.getProperty("browser");

        if (browserProperty == null) {
            Logs.debug("Asignando default driver a Chrome");
            browserProperty = "CHROME";
        }

        final var browser = Browser.valueOf(browserProperty.toUpperCase());

        Logs.debug("Inicializando driver: %s", browser);
        Logs.debug("Headless mode? %b", headlessMode);

        final var driver = switch (browser) {
            case CHROME -> {
                final var chromeOptions = new ChromeOptions();
                if (headlessMode) {
                    chromeOptions.addArguments("--headless=new");
                }
                yield new ChromeDriver(chromeOptions);
            }
            case EDGE -> {
                final var edgeOptions = new EdgeOptions();
                if (headlessMode) {
                    edgeOptions.addArguments("--headless=new");
                }
                yield new EdgeDriver(edgeOptions);
            }
            case FIREFOX -> {
                final var firefoxOptions = new FirefoxOptions();
                if (headlessMode) {
                    firefoxOptions.addArguments("--headless=new");
                }
                yield new FirefoxDriver(firefoxOptions);
            }
            case SAFARI -> new SafariDriver();
        };


        Logs.debug("Maximizando la pantalla");
        driver.manage().window().maximize();

        Logs.debug("Borrando cookies");
        driver.manage().deleteAllCookies();

        Logs.debug("Seteando implicit wait de 5 segundos");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Logs.debug("Asignando driver al webdriver provider");
        new WebdriverProvider().set(driver);
    }

    private void buildRemoteDriver() {

    }

    private enum Browser {
        CHROME,
        FIREFOX,
        EDGE,
        SAFARI
    }
}
