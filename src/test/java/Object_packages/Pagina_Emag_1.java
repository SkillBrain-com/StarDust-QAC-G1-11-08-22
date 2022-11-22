package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagina_Emag_1 {

// O varianta este sa definim mai intai elementele si apoi sa le accesam - vezi mai jos

    public static final String ACCEPT_BUTTON = "//button[normalize-space()='Accept']";
    public static final String CASUTA_NEAGRA = "//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']";

    public static final String LOGIN_BUTTON = "//a[normalize-space()='Intra in cont']";

    public static final String CLOSE_BUTTON = "//img[@title='IFI']";

    public Pagina_Emag_1(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = ACCEPT_BUTTON)
    private WebElement acceptButton;

    @FindBy(xpath = CASUTA_NEAGRA)
    private WebElement mesajPagina;

    @FindBy(xpath = LOGIN_BUTTON)
    private WebElement loginButton;

    @FindBy(xpath = CLOSE_BUTTON)
    private WebElement closeButton;

    @FindBy(xpath = "//a[normalize-space()='Inapoi in site']")
    private WebElement inapoiInSite;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getMesajPagina() {
        return mesajPagina;
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
