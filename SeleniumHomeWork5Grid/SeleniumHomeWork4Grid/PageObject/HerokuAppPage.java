package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.PageObject;

import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class HerokuAppPage extends utilities {

    static RemoteWebDriver driver;
    @BeforeSuite
    public static void  getChromeDriver() throws MalformedURLException {
        driver = SeleniumCurs5Grid.Utilitati.getRemoteDriver();
    }


    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }

    public HerokuAppPage(ChromeDriver driver) {

        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "delaygotobasic")
    private WebElement fiveSecondsButton;

    public WebElement getFiveSecondsButton() {
        return fiveSecondsButton;
    }

    @FindBy(css = "#combo1")
    private WebElement categoryWeb;

    @FindBy(id = "combo2")
    private WebElement Language;

    @FindBy(css = "#_valueid")
    private WebElement id;

    @FindBy(css = "#_valuelanguage_id")
    private WebElement language_id;

    @FindBy(css = "#_valuesubmitbutton")
    private WebElement submitbutton;

    @FindBy(css = "#back_to_form")
    private WebElement goBackButton;

    public WebElement getCategoryWeb() {
        return categoryWeb;
    }

    public WebElement getLanguage() {
        return Language;
    }

    public WebElement getId() {
        return id;
    }

    public WebElement getLanguage_id() {
        return language_id;
    }

    public WebElement getSubmitbutton() {
        return submitbutton;
    }

    public WebElement getGoBackButton() {
        return goBackButton;
    }
}
