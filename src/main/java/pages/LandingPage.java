package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.PropertiesReader;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class Landing page.
 */
public class LandingPage {

    /**
     * Constant EXPECTED_HEADER.
     */
    private static final String[] EXPECTED_HEADER = {"Главная", "Услуги", "Товары", "Цены", "Акции", "Статьи", "Портфолио", "О нас", "Контакты"};

    /**
     * Selenide elements.
     */
    private final static List<SelenideElement>
            SOCIAL_BUTTONS = $$("div.social li"),
            NEWS_BUTTONS = $$("div.bl1 div.menu li"),
            HEADER_MENU = $$("div.right div.menu li");

    /**
     * Default constructor.
     */
    public LandingPage() {
        return;
        //empty
    }

    /**
     * Navigate to main page landing page.
     *
     * @return the landing page
     */
    public LandingPage navigateToMainPage() {
        open(PropertiesReader.getProperty("URL"));
        return this;
    }

    /**
     * Method do social buttons.
     *
     * @return elements.
     */
    public ElementsCollection doCheckSizeSocialButtons() {
        return $$(SOCIAL_BUTTONS).shouldHaveSize(4);
    }

    /**
     * Method do menu buttons.
     *
     * @return elements.
     */
    public ElementsCollection doCheckSizeMenuButtons() {

        return $$(NEWS_BUTTONS).shouldHaveSize(8);
    }

    /**
     * Method do menu buttons.
     *
     * @return elements.
     */
    public ElementsCollection doCheckSizeHeaderMenu() {

        return $$(HEADER_MENU).shouldHaveSize(9);
    }


    /**
     * Method do check buttons on main page.
     *
     * @return elements.
     */
    public LandingPage doCheckButtonsOnMainPage() {
        doCheckSizeSocialButtons();
        doCheckSizeMenuButtons();
        doCheckSizeHeaderMenu();
        return this;
    }

    /**
     * Method do check header menu.
     *
     * @return this.
     */
    public LandingPage doCheckHeaderMenu() {
        if (EXPECTED_HEADER.length != HEADER_MENU.size()) {
            System.out.println("Not all headers were found on the page");
        }
        for (int i = 0; i < HEADER_MENU.toArray().length; i++) {
            HEADER_MENU.get(i).click();
            final String headerName = HEADER_MENU.get(i).getText();
            if (headerName.equals(EXPECTED_HEADER[i])) {
                // exit
            } else {
                //  exit
            }
        }
        return this;
    }

}
