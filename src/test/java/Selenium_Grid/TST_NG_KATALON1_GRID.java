package Selenium_Grid;

import TEST_NG_TEME.BaseTest_Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TST_NG_KATALON1_GRID extends BaseTest_Suite {


    public static void main(String[] args) throws InterruptedException, MalformedURLException {
      Logare_corecta();
      Logare_incorecta();
    }

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
    public static void Logare_corecta() throws InterruptedException, MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("menu-toggle")).click();
        Thread.sleep(1000);
        WebElement LOGIN = driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(4) > a"));
//        WebElement LOGIN = driver.findElement(By.xpath("/html/body/nav/ul/li[3]/a"));
        LOGIN.click();
        Thread.sleep(3000);

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        Thread.sleep(1000);
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);
//        driver.findElement(By.id("login-button")).click();

        WebElement Element1 = driver.findElement(By.cssSelector("#combo_facility > option:nth-child(2)"));
        Element1.click();
        Thread.sleep(1000);
        driver.findElement(By.id("chk_hospotal_readmission")).click();
        Thread.sleep(1000);
        WebElement Element2 = driver.findElement(By.id("radio_program_medicaid"));
        Element2.click();
        Thread.sleep(1000);
        WebElement Element3 = driver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]"));;
        Thread.sleep(3000);
        Element3.sendKeys("03/05/2022");
        Thread.sleep(1000);
        WebElement Element4 = driver.findElement(By.cssSelector("div.form-group:nth-child(5) > div:nth-child(2)"));
        driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[5]"));
        Element4.click();
        Thread.sleep(1000);
        driver.findElement(By.id("txt_comment")).sendKeys("Dorim programare la ortopedie si interne");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-book-appointment")).click();
    Thread.sleep(3000);
         driver.quit();
     }

// se executa a doua varianta
    @Test
    public static void Logare_incorecta() throws InterruptedException, MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("menu-toggle")).click();
        Thread.sleep(1000);
        WebElement LOGIN = driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(4) > a"));
//        WebElement LOGIN = driver.findElement(By.xpath("/html/body/nav/ul/li[3]/a"));
        LOGIN.click();
        Thread.sleep(3000);

        driver.findElement(By.id("txt-username")).sendKeys("Florin Parizer");
        Thread.sleep(1000);
        driver.findElement(By.id("txt-password")).sendKeys("De la Matracuca");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);

        System.out.println("Nu am avut acces - numele si parola 'E GRESITE', va spune Florin Parizer ... fratele lu' Salam" );
        driver.quit();
    }

}

