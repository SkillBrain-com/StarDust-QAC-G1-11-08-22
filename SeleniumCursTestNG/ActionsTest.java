package SeleniumCursTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebElement element = driver.findElement(By.id("id1"));
        Actions actions = new Actions(driver);
        actions.contextClick(element).build().perform();
    }
}
