package Selenium3;

import Object_packages.Login_page_C8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tema_1_basic_ajax_test {
    ChromeDriver driver;

    @BeforeSuite
    public void getChromeDriver(){
        driver = Utilitati_tema_Selen3.getChromeImplicitWait(2);
    }
    @AfterSuite
    public void closeChrome(){
        driver.quit();
    }

    @Test(dataProvider = "Ajax_Test")
    public void Ajax_Test(String category, String language) {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        for (int i = 0; i < 5; i++) {
//            WebElement Element_A = driver.findElement(By.cssSelector("#combo1 > option:nth-child(1)"));
//            Element_A.click();
//            WebElement Element_B = driver.findElement(By.cssSelector("#combo2 > option:nth-child(1)"));
//            Element_B.click();
            driver.findElement(By.cssSelector(category)).click();
            driver.findElement(By.cssSelector(language)).click();
//            String date = driver.findElement(By.id("refreshdate")).getText();
//            System.out.println("Data = " + date);
        }
    }
}
