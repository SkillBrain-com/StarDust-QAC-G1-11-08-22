package Object_packages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Magazin_Emag {

    public Magazin_Emag(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="img[scr='/images/Toolsqa.jpg']")
    private WebElement acceptButton;

    public WebElement getAcceptButton() {

        return acceptButton;
    }

}
