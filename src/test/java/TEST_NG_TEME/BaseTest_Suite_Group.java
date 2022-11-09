package TEST_NG_TEME;

import Selenium2.Utilitati;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class BaseTest_Suite_Group {

    WebDriver driver;

    @BeforeSuite(alwaysRun = true, groups = {"cu_logare"})
    public void initializeDriver() {
        driver = Utilitati.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        pasi_logare("standard_user", "secret_sauce");
        System.out.println("WebDriver initializad");
    }

//    @BeforeSuite(alwaysRun = true, groups = {"fara_logare"})
//    public void initializeDriver2() {
//        driver = Utilitati.getChromeDriver();
//    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            System.out.println("Closing WebDriver");
        }
    }
    protected void pasi_logare(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        // click back button on browser
        driver.navigate().back();
    }
    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean isElementPresent(WebElement element, By locator) {
        try {
            element.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}


