package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema_1_basic_ajax_test_complet {

    ChromeDriver driver;

    @BeforeSuite
    public void getChromeDriver(){
        driver = Utilitati_tema_Selen3.getChromeImplicitWait(2);
    }
    @AfterSuite
    public void closeChrome(){
        driver.quit();
    }

    @Test
    public void ChromeTest() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//----------------------------------------------------------------------------------------------------------------------
// prima linie de la casuta 1 si prima linie de la casuta 2

        WebElement Element1A = driver.findElement(By.cssSelector("#combo1 > option:nth-child(1)"));
        Element1A.click();
        WebElement Element2_1A = driver.findElement(By.cssSelector("#combo2 > option:nth-child(1)"));
        Element2_1A.click();
        WebElement Code_In_It_Button1A = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button1A.click();
        Thread.sleep(1000);
        String TEXT1 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT1);
        System.out.println("A fost selectata optiunea \"1 cu 1\"");
        WebElement Go_back_to_form1A = driver.findElement(By.id("back_to_form"));
        Go_back_to_form1A.click();
       Thread.sleep(2000);

        WebElement Element1B = driver.findElement(By.cssSelector("#combo1 > option:nth-child(1)"));
        Element1B.click();
        WebElement Element2_1B = driver.findElement(By.cssSelector("#combo2 > option:nth-child(2)"));
        Element2_1B.click();
        WebElement Code_In_It_Button1B = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button1B.click();
        Thread.sleep(1000);
        String TEXT2 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT2);
        WebElement Go_back_to_form1B = driver.findElement(By.id("back_to_form"));
        Go_back_to_form1B.click();
        System.out.println("A fost selectata optiunea \"1 cu 2\"");
        Thread.sleep(2000);

        WebElement Element1C = driver.findElement(By.cssSelector("#combo1 > option:nth-child(1)"));
        Element1C.click();
        WebElement Element2_1C = driver.findElement(By.cssSelector("#combo2 > option:nth-child(3)"));
        Element2_1C.click();
        WebElement Code_In_It_Button1C = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button1C.click();
        Thread.sleep(1000);
        String TEXT3 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT3);
        WebElement Go_back_to_form1C = driver.findElement(By.id("back_to_form"));
        Go_back_to_form1C.click();
        System.out.println("A fost selectata optiunea \"1 cu 3\"");
        Thread.sleep(2000);

 // --------------------------------------------------------------------------------------------------------------------
 // a doua linie de la casuta 1 si prima linie de la casuta 2

        WebElement Element2A = driver.findElement(By.cssSelector("#combo1 > option:nth-child(2)"));
        Element2A.click();
        WebElement Element2_2A = driver.findElement(By.cssSelector("#combo2 > option:nth-child(1)"));
        Element2_2A.click();
        WebElement Code_In_It_Button2A = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button2A.click();
        Thread.sleep(1000);
        String TEXT4 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT4);
        System.out.println("A fost selectata optiunea \"2 cu 10\"");
        WebElement Go_back_to_form2A = driver.findElement(By.id("back_to_form"));
        Go_back_to_form2A.click();
        Thread.sleep(2000);

        WebElement Element2B = driver.findElement(By.cssSelector("#combo1 > option:nth-child(2)"));
        Element2B.click();
        WebElement Element2_2B = driver.findElement(By.cssSelector("#combo2 > option:nth-child(2)"));
        Element2_2B.click();
        WebElement Code_In_It_Button2B = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button2B.click();
        Thread.sleep(1000);
        String TEXT5 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT5);
        WebElement Go_back_to_form2B = driver.findElement(By.id("back_to_form"));
        Go_back_to_form2B.click();
        System.out.println("A fost selectata optiunea \"2 cu 11\"");
        Thread.sleep(2000);

        WebElement Element2C = driver.findElement(By.cssSelector("#combo1 > option:nth-child(2)"));
        Element2C.click();
        WebElement Element2_2C = driver.findElement(By.cssSelector("#combo2 > option:nth-child(3)"));
        Element2_2C.click();
        WebElement Code_In_It_Button2C = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button2C.click();
        Thread.sleep(1000);
        String TEXT6 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT6);
        WebElement Go_back_to_form2C = driver.findElement(By.id("back_to_form"));
        Go_back_to_form2C.click();
        System.out.println("A fost selectata optiunea \"2 cu 12\"");
        Thread.sleep(2000);

        WebElement Element2D = driver.findElement(By.cssSelector("#combo1 > option:nth-child(2)"));
        Element2D.click();
        WebElement Element2_2D = driver.findElement(By.cssSelector("#combo2 > option:nth-child(4)"));
        Element2_2D.click();
        WebElement Code_In_It_Button2D = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button2D.click();
        Thread.sleep(1000);
        String TEXT7 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT7);
        WebElement Go_back_to_form2D = driver.findElement(By.id("back_to_form"));
        Go_back_to_form2D.click();
        System.out.println("A fost selectata optiunea \"2 cu 13\"");
        Thread.sleep(2000);

// --------------------------------------------------------------------------------------------------------------------
// a treia linie de la casuta 1 si prima linie de la casuta 2

        WebElement Element3A = driver.findElement(By.cssSelector("#combo1 > option:nth-child(3)"));
        Element3A.click();
        WebElement Element2_3A = driver.findElement(By.cssSelector("#combo2 > option:nth-child(1)"));
        Element2_3A.click();
        WebElement Code_In_It_Button3A = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button3A.click();
        Thread.sleep(1000);
        String TEXT8 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT8);
        WebElement Go_back_to_form3A = driver.findElement(By.id("back_to_form"));
        Go_back_to_form3A.click();
        System.out.println("A fost selectata optiunea \"3 cu 21\"");
        Thread.sleep(2000);

        WebElement Element3B = driver.findElement(By.cssSelector("#combo1 > option:nth-child(3)"));
        Element3B.click();
        WebElement Element2_3B = driver.findElement(By.cssSelector("#combo2 > option:nth-child(2)"));
        Element2_3B.click();
        WebElement Code_In_It_Button3B = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button3B.click();
        Thread.sleep(1000);
        String TEXT9 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT9);
        WebElement Go_back_to_form3B = driver.findElement(By.id("back_to_form"));
        Go_back_to_form3B.click();
        System.out.println("A fost selectata optiunea \"3 cu 21\"");
        Thread.sleep(2000);

        WebElement Element3C = driver.findElement(By.cssSelector("#combo1 > option:nth-child(3)"));
        Element3C.click();
        WebElement Element2_3C = driver.findElement(By.cssSelector("#combo2 > option:nth-child(3)"));
        Element2_3C.click();
        WebElement Code_In_It_Button3C = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button3C.click();
        Thread.sleep(1000);
        String TEXT10 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT10);
        WebElement Go_back_to_form3C = driver.findElement(By.id("back_to_form"));
        Go_back_to_form3C.click();
        System.out.println("A fost selectata optiunea \"3 cu 22\"");
        Thread.sleep(2000);

        WebElement Element3D = driver.findElement(By.cssSelector("#combo1 > option:nth-child(3)"));
        Element3D.click();
        WebElement Element2_3D = driver.findElement(By.cssSelector("#combo2 > option:nth-child(4)"));
        Element2_3D.click();
        WebElement Code_In_It_Button3D = driver.findElement(By.cssSelector(".styled-click-button"));
        Thread.sleep(1000);
        Code_In_It_Button3D.click();
        Thread.sleep(1000);
        String TEXT11 = driver.findElement(By.cssSelector("#_valuelanguage_id")).getText();
        System.out.println("Valoare capturata casuta language_id = " + TEXT11);
        WebElement Go_back_to_form3D = driver.findElement(By.id("back_to_form"));
        Go_back_to_form3D.click();
        System.out.println("A fost selectata optiunea \"3 cu 23\"");
        Thread.sleep(2000);
    }
}
