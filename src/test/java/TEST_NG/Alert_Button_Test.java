package TEST_NG;
import Selenium2.Utilitati;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Alert_Button_Test {

    WebDriver driver;       // - este definit la nivel global
//    ChromeDriver driver;  // - este definit ca element global

    @BeforeSuite(alwaysRun = true)
    public void initializeDriver() {
//        WebDriver driver = Utilitati.getChromeDriver();   // - avem definit DRIVER-ul mai sus , se poate sterge
        driver = Utilitati.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("WebDriver initialized");
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
        System.out.println("Closing WebDriver");
    }

    @Test(groups = {"Grupa1"})
    public void alertTest() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("alertButton"));
        element.click();
        Thread.sleep(2500);
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    //  copiem din Radio_Button
    @Test(groups = {"Grupa2"})
    public void clickRadioButton() throws InterruptedException {
//  Cautam un RADIO BUTTON - acesta merge doar cu o optiune din cate sunt disponibile
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement yesButton = driver.findElement(By.xpath("//Label[normalize-space()='Yes']"));
        yesButton.click();
        Thread.sleep(1500);
        boolean isSelected = driver.findElement(By.id("yesRadio")).isSelected();
        boolean isEnabled = driver.findElement(By.id("noRadio")).isEnabled();
        System.out.println("Este butonul \"NO\" enabled? - " + isEnabled);
//        if (isSelected) {
            Assert.assertTrue(isSelected);
            Assert.assertFalse(isEnabled);
            System.out.println(isSelected);
            System.out.println("Test complete");
//        }

    }
    @Test(groups = "Grupa1")
    public void clickMeButtonTest() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("promtButton"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(element);
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Selenium Test");
        alert.accept();
        WebElement promptMessageElement = driver.findElement(By.id("promptResult"));
        String promptMessage = promptMessageElement.getText();
//    facem validarea in mod programatic
        Assert.assertEquals( promptMessage, "You entered Selenium Test"); // pt eroare punem "Test Selenium".
//        SoftAssert softAssert = new SoftAsseert();
//        softAssert.assertEquals(propmptMessage, "You entered Test");
            System.out.println("Salut - la final de test");

    }

    @DataProvider(name = "myDataProvider")
    public Object[][] myDataProvider(){
        return new Object[][]{
                {"elements"},
                {"forms"},
                {"alertsWindows"},
                {"interactions"},
                {"books"},
                {"widgets"},
        };
    }
    @Test (dataProvider = "myDataProvider")
    public void dataProviderTest(String resources) {
        driver.get("https://demoqa.com" + "/" + resources);
        boolean imageIsPresent = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']")).isDisplayed();
            Assert.assertTrue(imageIsPresent);

// - asta e prima metoda
//        driver.get("https://demoqq.com/" + "/elements");
//        driver.get("https://demoqq.com/" + "/alerts");
//        driver.get("https://demoqq.com/" + "/widgets");
//        driver.get("https://demoqq.com/" + "/widgets");
    }
}
