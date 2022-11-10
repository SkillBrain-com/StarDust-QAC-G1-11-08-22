package SeleniumPlatformaTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SeleniumTests {

    static ChromeDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverManager.getChromeDriverByManager();
        //throw  new RuntimeException("Eroare din beforeMethod");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }

    }




//    @Test(dataProvider = "myFirstDataProvider", dataProviderClass = MainSelenium.class)
//    public void dataProviderTest(String path, int paramInt) {
//        driver.get("https://demoqa.com/" + path);
//        WebElement image = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
//        assertTrue(image.isDisplayed(), "Image is not displayed");
//    }
//
//
//
//
    @Test
    public void assertTest() {

        driver.get("https://demoqa.com/");
        List<WebElement> cards = driver.findElements(By.className("card"));
        assertEquals(cards.size(), 6, "Wrong card size");
    }
//
//
//    @Test
//    public void primulTest() {
//
//        driver.get("https://demoqa.com/browser-windows");
//        throw new RuntimeException("Custom exception");
//    }
//
//
//        @Test
//        public void doubleClick() {
//
//            driver.get("https://demoqa.com/buttons");
//            WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
//            Actions actions = new Actions(driver);
//            actions.doubleClick(doubleClick).build().perform();
//
//            WebElement message = driver.findElement(By.id("doubleClickMessage"));
//            assertEquals(message.getText(), "You have done a double click", "Double click was unsuccessful");
//        }
//
//        @Test
//        public void rightClick() {
//
//            SoftAssert softAssert = new SoftAssert();
//
//            driver.get("https://demoqa.com/buttons");
//            WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
//            softAssert.assertFalse(rightClickButton.isDisplayed(), "Right button is not displayed!");
//
//            Actions actions = new Actions(driver);
//            actions.contextClick(rightClickButton).build().perform();
//
//            WebElement message = driver.findElement(By.id("rightClickMessage"));
//            softAssert.assertEquals(message.getText(), "You have done a right click", "Right click was unsuccessful");
//            softAssert.assertAll();
//
//        }
}
