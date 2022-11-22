package Selenium3;

import Object_packages.Login_page_C8;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tema_1_basic_ajax_test_1 {

    ChromeDriver driver;

    @BeforeSuite
    public void getChromeDriver() {
        driver = Utilitati_tema_Selen3.getChromeImplicitWait(3);
    }

    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }

    @Test
    public void ChromeTest() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        List<WebElement> Category_Button = driver.findElements(By.cssSelector("combo1"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

            for (int i = 0; i < 5; i++) {
            WebElement Elementul_X = Category_Button.get(i);
                WebElement Elementul_curent1 = Elementul_X.findElement(By.cssSelector("#combo1 > option:nth-child(i)"));
                Elementul_curent1.click();
            WebElement Elementul_Y = Category_Button.get(i);
                WebElement Elementul_curent2 = Elementul_Y.findElement(By.cssSelector("#combo2 > option:nth-child(i)"));
            Elementul_curent2.click();
                Thread.sleep(1000);
                System.out.println("A fost selectata o optiune?");
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                WebElement Code_In_It_Button = driver.findElement(By.cssSelector(".styled-click-button"));
                Code_In_It_Button.click();
                    Thread.sleep(2000);
                WebElement Go_back_to_form = driver.findElement(By.id("back_to_form"));
                Go_back_to_form.click();

//        for (int i = 0; i < Category_Button.size(); i++) {
//                    Thread.sleep(2000);
//            } else {
//                System.out.println(" Nu sunt elemente in lista");
//            }
//            for (int j = 0; j < Category_Button2.size(); j++) {
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//                WebElement Elementul_Y = Category_Button.get(i);
//                if (j == 0) {
//
//                }
        }
    }
}
