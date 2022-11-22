package Selenium_Grid;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class GridTest {


    @Test
//    public void gridTest() throws MalformedURLException {
//        RemoteWebDriver driver = Utilitati_GRID.getRemoteWebDriver();
//        driver.get("https://demoqa.com");
//        driver.quit();
//        }

        public void gridTest() throws MalformedURLException, InterruptedException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.quit();
        }
}
