package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

/**
 * The type Select browser.
 */
public final class SelectBrowser {

    /**
     * Default Constructor.
     */
    private SelectBrowser() {
    }

    /**
     * Select browser.
     *
     * @param browser the browser
     */
    public static void selectBrowser(final String browser) {

        switch (browser) {
            case "Firefox":
                Configuration.browser = "Firefox";
                FirefoxDriverManager.firefoxdriver().setup();
                break;
            case "Chrome":
                Configuration.browser = "Chrome";
                ChromeDriverManager.chromedriver().setup();
                break;
            default:
                throw new IllegalStateException("Browser " + browser + " not supported in smoke");
        }
    }
}
