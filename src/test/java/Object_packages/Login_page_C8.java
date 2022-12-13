package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_C8 {

    public Login_page_C8(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName="form")
    private WebElement loginForm;

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Password")
    private WebElement password;

// pt ca elementele sunt pribvate le accesam cu metaoda de PUBLIC si asa respectam metoda/principiul de INCAPSULARE

    public WebElement getLoginForm() {
        return loginForm;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }
}
