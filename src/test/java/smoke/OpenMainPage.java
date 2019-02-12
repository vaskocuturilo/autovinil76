package smoke;

import driver.BaseTest;
import org.testng.annotations.Test;
import pages.LandingPage;

public class OpenMainPage extends BaseTest {

    @Test(description = "Navigate to main page > check information on main page")
    public void openAndCheck() {
        new LandingPage()
                .navigateToMainPage()
                .doCheckButtonsOnMainPage()
                .doCheckHeaderMenu();
    }
}
