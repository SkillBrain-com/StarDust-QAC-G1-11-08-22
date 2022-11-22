package Selenium_Grid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester_page_EMAG {

    public Tester_page_EMAG(ChromeDriver driver){
        PageFactory.initElements(driver, this );
    }

    @FindBy(css = "button.js-accept")
    private WebElement acceptButton;

    @FindBy(css="a.login-btn")
    private WebElement loginButton;

    @FindBy (css="button.close")
    private WebElement closeButton;

    @FindBy(xpath = "//a[normalize-space()='Inapoi in site']")
    private WebElement inapoiInSite;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public WebElement getInapoiInSite() {
        return inapoiInSite;
    }
}
