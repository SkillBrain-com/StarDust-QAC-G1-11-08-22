package INTERSHIP;

import driver.BrowserConfigs_C8;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base_Test_Intership {

    protected ChromeDriver driver = null;

    @BeforeClass
    public void init(){
        driver = BrowserConfigs_C8.getChromeDriver();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

// Avem varianta initiala cu @BeforeMethod ------------------------------------------------------------------------------

//    @BeforeMethod                       // putem utiliza si varianta @BeforeClass
//    public void beforeMethod(){
////    public void beforeClass(){
//        driver = BrowserConfigs_C8.getChromeDriver();
//    }
//
//    @AfterMethod(alwaysRun = true)      // putem utiliza si varianta AfterClass
//    public void afterMethode() {
////    public void afterClass(){
//        if (driver != null) {
//            driver.quit();
//        }
//    }

// ---------------------------------------------------------------------------------------------------------------------
    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class);
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
