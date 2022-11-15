package SeleniumPlatforma4.pageObjects;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoQAPage {

    public DemoQAPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCards() {
        return cards;
    }
    @FindBy(className = "card")
    List<WebElement> cards;
}
