package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema_3_refresh_page_test {

    ChromeDriver driver;

    @BeforeSuite
    public void getChromeDriver(){
        driver = Utilitati_tema_Selen3.getChromeImplicitWait(3);
    }
    @AfterSuite
    public void closeChrome(){
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
