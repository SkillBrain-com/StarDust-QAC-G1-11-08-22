package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Selenium2_Action_and_Scroll {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://demoqa.com/browser-windows");
            driver.manage().window().maximize();
            Thread.sleep(1500);

            List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
            WebElement sixthCard = cards.get(5);
            Actions actions = new Actions(driver);
            actions.moveToElement(sixthCard).build().perform();
            Thread.sleep(5000);
            sixthCard.click();

        } finally {
            Thread.sleep(1500);
            driver.quit();
            System.out.println("Suntem la final, fereastra a fost inchisa!");
        }
    }
}
