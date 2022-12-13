package INTERSHIP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_CYSIAM {

        public Login_CYSIAM(ChromeDriver driver){
                PageFactory.initElements(driver, this);
        }

        @FindBy(tagName="form")
        public WebElement loginForm;

        @FindBy(id = "adminbrain5@test.com")
        public static WebElement email;

        @FindBy(id = "Parola12#")
        public static WebElement password;


// pt ca elementele sunt private le accesam cu metaoda de PUBLIC si asa respectam metoda/principiul de INCAPSULARE

        public WebElement getLoginForm() {
                return loginForm;
        }

        public static WebElement getEmail() {
                return email;
        }

        public static WebElement getPassword() {
                return password;
        }
}

