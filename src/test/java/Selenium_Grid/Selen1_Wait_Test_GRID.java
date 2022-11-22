package Selenium_Grid;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Selen1_Wait_Test_GRID {

    RemoteWebDriver driver;

    @BeforeSuite
    public void getChromeDriver() throws MalformedURLException {
        driver = WebdriverManager.getRemoteWebDriver();
    }

    @AfterSuite
    public void closeChrome(){
        driver.quit();
    }

    @Test
    public void mobileChromeTest() throws InterruptedException {
        driver.get("http://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

}
