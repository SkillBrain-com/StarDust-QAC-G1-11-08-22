package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.naming.Name;

public class Product_Edit_Page {

    public Product_Edit_Page( ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (id="Name")
    private WebElement productName;

    @FindBy (css = "button[name='save']")
    private WebElement saveButton;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}
