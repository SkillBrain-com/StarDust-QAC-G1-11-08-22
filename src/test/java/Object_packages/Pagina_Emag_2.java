package Object_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// putem folosi o alta metoda de generare -

public class Pagina_Emag_2 {

// O varianta este sa definim ca DRIVER fara valoare si apoi sa le accesam - vezi mai jos
        WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @FindBy(xpath = "//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']")
    private WebElement mesajPagina;

    By acceptButton = By.xpath("acceptButton");

    public WebElement declineButton(){
        return driver.findElement(acceptButton);
    }
}
