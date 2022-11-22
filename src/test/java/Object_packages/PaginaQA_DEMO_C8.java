package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PaginaQA_DEMO_C8 {

    public PaginaQA_DEMO_C8(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCards() {
        return cards;
    }
    @FindBy(className = "card")
    List<WebElement> cards;
}


