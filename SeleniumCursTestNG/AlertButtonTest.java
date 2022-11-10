package SeleniumCursTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertButtonTest {
    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void initializeDriver() {
        driver = Utilitati.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Webdriver initialized!");
    }


    @AfterSuite(alwaysRun = true)
        public  void closeDriver() {
        driver.quit();
        System.out.println("Closing WebDriver");
    }



    @Test(groups = {"Grupa1"})
    public void alertTest() {
        driver.get("https://demoqa.com/alerts");
        WebElement element = driver.findElement(By.id("alertButton"));
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
    @Test(groups = {"Grupa2"})
    public void clickRadioButton() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement yesButton = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
        yesButton.click();
        Thread.sleep(3000);
        boolean isSelected = driver.findElement(By.id("yesRadio")).isSelected();
        boolean isEnabled = driver.findElement(By.id("noRadio")).isEnabled();
        System.out.println("Este butonul \"No\" enabled? " + isEnabled);
        Assert.assertTrue(isSelected);
        Assert.assertFalse(isEnabled);

        if(!isSelected) {
            System.out.println(isSelected);
            System.out.println("Test complite!");
        }
    }

    @Test(groups = {"Grupa1"})
    public void clickMeButtonTest() {
        driver.get("https://demoqa.com/alerts");
        WebElement element = driver.findElement(By.id("promtButton"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(element);
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Selenium test");
        alert.accept();
        WebElement promptMessageElement = driver.findElement(By.id("promptResult"));
        String promptMessage = promptMessageElement.getText();
        //validare in mod programatic
        Assert.assertEquals(promptMessage, "You entered Selenium test");
       // SoftAssert softAssert = new SoftAssert();
       // softAssert.assertEquals(promptMessage, "You entered Test");

        System.out.println("Hello la final de test!");
    }

    @DataProvider(name = "myDataProvider")
    public Object[][] myDataProvider() {
        return new Object[][]{
                {"elements"},
                {"forms"},
                {"alertsWindows"},
                {"interaction"},
                {"books"},
                {"widgets"}
        };

        }


    @Test(dataProvider = "myDataProvider", groups = {"Grupa1"})
    public void dataProviderTest(String resources) {
        driver.get("https://demoqa.com" + "/" + resources);
        boolean imageIsPresent = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertTrue(imageIsPresent);




        }




    }

