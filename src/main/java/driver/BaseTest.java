package driver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.PropertiesReader;
import utils.SelectBrowser;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

/**
 * Class Base Test.
 */
public class BaseTest {

    /**
     * Default constructor.
     */
    public BaseTest() {
        return;
        //empty

    }

    /**
     * Method Setup.
     */
    @BeforeTest(alwaysRun = true)
    public void start() {
        SelectBrowser.selectBrowser(PropertiesReader.getProperty("BROWSER"));
    }

    /**
     * Method stop.
     */
    @AfterTest(alwaysRun = true)
    public void stop() {
        closeWebDriver();
        clearBrowserCache();
    }
}
