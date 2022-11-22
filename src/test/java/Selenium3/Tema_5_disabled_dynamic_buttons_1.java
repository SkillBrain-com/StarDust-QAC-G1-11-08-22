package Selenium3;

// pagina "https://testpages.herokuapp.com/styled/index.html", SYNCHRONISATION , exe.= Dynamic Buttons Challenge 02

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema_5_disabled_dynamic_buttons_1 {

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
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();


        WebElement Start_Button = driver.findElement(By.cssSelector("#button00"));
        Start_Button.click();
        Thread.sleep(3000);

        WebElement One_Button = driver.findElement(By.cssSelector("#button01"));
        One_Button.click();
        Thread.sleep(4000);

        WebElement Two_Button = driver.findElement(By.cssSelector("#button02"));
        Two_Button.click();
        Thread.sleep(5000);

        WebElement Three_Button = driver.findElement(By.cssSelector("#button03"));
        Three_Button.click();
        Thread.sleep(4000);

//        System.out.println("Testul a trecut!").getText();

        System.out.println("A fost selectata o optiune?");
    }
}
