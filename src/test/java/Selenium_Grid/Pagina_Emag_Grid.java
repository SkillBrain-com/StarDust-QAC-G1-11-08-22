package Selenium_Grid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagina_Emag_Grid {

    @FindBy(xpath = "//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']")
    private WebElement mesajPagina;

    @FindBy(xpath = "//button[normalize-space()='Accept']")
    private WebElement acceptButton;

    @FindBy(xpath = "//img[@title='IFI']")
    private WebElement closeButton;

    @FindBy(xpath = "//a[normalize-space()='Intra in cont']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[normalize-space()='Inapoi in site']")
    private WebElement inapoiInSite;

// facem o metoda de "getter" - ALT + INSERT si selectam GETTER

    public WebElement getMesajPagina() { return mesajPagina; }

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getInapoiInSite() {
        return inapoiInSite;
    }
}
