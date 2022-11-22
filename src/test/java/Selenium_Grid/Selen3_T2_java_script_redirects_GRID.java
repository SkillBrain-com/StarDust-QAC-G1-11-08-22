package Selenium_Grid;

// pagina "https://testpages.herokuapp.com/styled/index.html", JAVASCRIPT , exe.= Redirect (JavaScript) Test Page

import Selenium3.Utilitati_tema_Selen3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class Selen3_T2_java_script_redirects_GRID {

    RemoteWebDriver driver;

    @BeforeSuite
    public void getChromeDriver() throws MalformedURLException {
        driver = WebdriverManager.getRemoteWebDriver();
    }

    @AfterSuite
    public void loseChrome(){
        driver.quit();
    }

        @Test
        public void ChromeTest() throws InterruptedException {
            driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

            WebElement Transport1_Button = driver.findElement(By.id("delaygotobasic"));
            Transport1_Button.click();
//            Thread.sleep(6000);

            WebElement Back1_Button = driver.findElement(By.id("goback"));
            Back1_Button.click();
//            Thread.sleep(1000);

            WebElement Transport2_Button = driver.findElement(By.id("delaygotobounce"));
            Transport2_Button.click();
//            Thread.sleep(3000);

            WebElement Back2_Button = driver.findElement(By.id("goback"));
            Back2_Button.click();
//            Thread.sleep(1000);
        }
}
