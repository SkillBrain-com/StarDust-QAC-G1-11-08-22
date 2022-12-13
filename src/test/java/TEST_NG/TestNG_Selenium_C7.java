package TEST_NG;

import Selenium_Grid.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestNG_Selenium_C7 {

    ChromeDriver driver;

    @BeforeMethod
    public void beforeMethode() throws InterruptedException {
        driver = WebdriverManager.getChromeDriverByManager();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        if(driver != null){
            driver.quit();
        }
    }

//  aici incepem sa facem testele

    @Test
    public void asserTest() throws InterruptedException {
        driver.get("https://demoqa.com/");
        List<WebElement> cards = driver.findElements(By.className("card"));
        assertEquals(cards.size(),6,"Wrong card size");
        Thread.sleep(3000);
     }

    @Test
    public void primul_Test() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
        throw new RuntimeException("Custom exception");

    }

    @Test
    public void double_Click() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement double_Click = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(double_Click).build().perform();

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        assertEquals(message.getText(),"You have done a double click","Click-ul dublu a fost fara succes");
        Thread.sleep(3000);
    }

    public void right_Click(SoftAssert softAssert) throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement right_Click = driver.findElement(By.id("rightClickBtn"));
        softAssert.assertTrue(right_Click.isDisplayed(),"Right click button is not displayed!");

        Actions actions = new Actions(driver);
        actions.contextClick(right_Click).build().perform();

        WebElement message = driver.findElement(By.id("rightClickMessage"));
        softAssert.assertEquals(message.getText(),"You have done a right click","Click-ul dreapta a fost fara succes");
        Thread.sleep(3000);
        softAssert.assertAll();
    }
}
