package Object_packages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagina_Emag {
    @FindBy(xpath = "//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']")
    private WebElement mesajPagina;
// facem o metoda de "getter" - ALT + INSERT

    @FindBy(xpath = "//button[normalize-space()='Accept']")
    private WebElement acceptButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getMesajPagina() {
        return mesajPagina;
    }

}
