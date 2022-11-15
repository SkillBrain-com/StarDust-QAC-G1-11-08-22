package SeleniumPlatforma4;

import SeleniumPlatforma4.pageObjects.EmagPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import static SeleniumPlatforma4.pageObjects.EmagPage.*;
import static org.testng.Assert.assertTrue;


public class ChromeOptionsTest {

    ChromeDriver driver;
    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public  void  mobileTest() {
        ChromeDriver driver = WebDriverManagerClass.getChromeDriverWithOptions();
        driver.get("https://demoqa.com/");
        driver.quit();

    }

    @Test
    public void implicitWaitTest() {
        driver = WebDriverManagerClass.getChromeDriverWithOptions();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.emag.ro/");
        WebElement inapoiPeSite = driver.findElement(By.xpath("//a[normalize-space()='Inapoi in site']"));
        inapoiPeSite.click();

        //se initializeaza elementele din test
        EmagPage emagPage = PageFactory.initElements(driver, EmagPage.class);
       // WebElement acceptButton = driver.findElement(By.xpath("//button[normalize-space()='Accept']"));
        emagPage.getAcceptButton().click();

       // WebElement loginButton = driver.findElement(By.xpath("//a[normalize-space()='Intra in cont']"));
        emagPage.getLoginButton().click();
        driver.quit();
    }

    @Test
    public void explicitWaitTest() {
        driver = WebDriverManagerClass.getChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
//        WebElement inapoiPeSite = driver.findElement(By.xpath("//a[normalize-space()='Inapoi in site']"));
//        inapoiPeSite.click();

        //se initializeaza elementele prin constructorul clase de PageObject
        EmagPage emagPage = new EmagPage(driver);

        //exemplu WebDriverWait
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //exemplu FluentWait
        FluentWait<ChromeDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CLOSE_BUTTON_XPATH)));
        WebElement closeButton = driver.findElement(By.xpath(CLOSE_BUTTON_XPATH));
        closeButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ACCEPT_BUTTON_XPATH)));
       emagPage.getAcceptButton().click();

        //wait.until(ExpectedConditions.elementToBeClickable(acceptButton));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGIN_BUTTON_XPATH)));
        emagPage.getLoginButton().click();
        assertTrue(driver.getCurrentUrl().contains("user/login"), "Login page did not open");
    }
}
