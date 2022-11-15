package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema_2_java_script_redirects {

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
