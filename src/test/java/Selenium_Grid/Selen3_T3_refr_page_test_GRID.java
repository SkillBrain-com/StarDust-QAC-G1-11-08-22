package Selenium_Grid;

// pagina "https://testpages.herokuapp.com/styled/index.html", JAVASCRIPT , exe.= Refresh Test Page

import Selenium3.Utilitati_tema_Selen3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class Selen3_T3_refr_page_test_GRID {

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
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        for(int i =0; i< 7; i++){
// avem o valoare deja existenta pe care o captureza si o printez ca s-o vad
            String date = driver.findElement(By.id("refreshdate")).getText();
            System.out.println("Data = " + date);
            Thread.sleep(2000);
            driver.navigate().refresh();
// da refresjh la pagina si vedem daca noua variabila nu este egala cu variabila initiala
            Assert.assertNotEquals(date, driver.findElement(By.id("refreshdate")).getText());
        }
    }
}
