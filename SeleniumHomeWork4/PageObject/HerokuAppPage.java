package SeleniumHomeWork4.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppPage {


    public HerokuAppPage(ChromeDriver driver) {

        PageFactory.initElements(driver, this);
    }



    @FindBy(css = "#delaygotobasic")
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
