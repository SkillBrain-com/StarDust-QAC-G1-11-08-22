package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tester_page_EMAG {

    @FindBy(css = "button.js-accept")
    private WebElement acceptButton;

    @FindBy(css="a.login-btn")
    private WebElement loginButton;


    @FindBy (css="button.close")
    private WebElement closeButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }
}
