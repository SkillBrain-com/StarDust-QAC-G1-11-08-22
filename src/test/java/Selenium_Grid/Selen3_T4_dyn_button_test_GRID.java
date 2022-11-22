package Selenium_Grid;

// pagina "https://testpages.herokuapp.com/styled/index.html", SYNCHRONISATION , exe.= Dynamic Buttons Challenge 01

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

public class Selen3_T4_dyn_button_test_GRID {

    RemoteWebDriver driver;

    @BeforeSuite
    public void getChromeDriver() throws MalformedURLException {
        driver = WebdriverManager.getRemoteWebDriver();
    }

    @AfterSuite
    public void loseChrome(){
        driver.quit();
    }

    @Test(description = "Test in care se face click pe toate butoanele iar la sfârșit va verifica mesajul afișat. " +
            "Mesajul apare dupa ce toate butoanele au fost apăsate.")
    public void dinamic_buttons() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

// Incepem sa apasam butoanele, primul este "START"
        WebElement start_Button = driver.findElement(By.cssSelector("#button00"));
        start_Button.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        Thread.sleep(4000);

// Apasam butoanul "ONE"
        WebElement one_Button = driver.findElement(By.id("button01"));
        one_Button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//        Thread.sleep(4000);

// Apasam butoanul "TWO"
        WebElement two_Button = driver.findElement(By.id("button02"));
        two_Button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        Thread.sleep(5000);

// Apasam butoanul "Three"
        WebElement three_Button = driver.findElement(By.cssSelector("#button03"));
        three_Button.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.xpath("//p[@id='buttonmessage']"));
        message.getText();
    }
}


