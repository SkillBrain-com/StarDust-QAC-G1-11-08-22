package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagina_Emag_1 {

// O varianta este sa definim mai intai elementele si apoi sa le accesam - vezi mai jos

    public static final String ACCEPT_BUTTON_XPATH = "//button[normalize-space()='Accept']";
    public static final String CASUTA_NEAGRA = "//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']";

    @FindBy(xpath = CASUTA_NEAGRA)
    private WebElement mesajPagina;

    @FindBy(xpath = ACCEPT_BUTTON_XPATH)
    private WebElement acceptButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getMesajPagina() {
        return mesajPagina;
    }
}
