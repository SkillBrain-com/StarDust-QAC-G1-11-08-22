package Selenium_Grid;

import Object_packages.Tester_page_EMAG;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ChromeOption_Test_GRID {

    RemoteWebDriver driver;

//    @BeforeSuite
//    public void getChromeDriver()throws MalformedURLException {
////        driver = Utilitati_GRID.getRemoteWebDriver();
////        driver = WebdriverManager.getRemoteWebDriver();
//    }
//
//    @AfterSuite
//    public void closeChrome(){
//       driver.quit();
//    }

    @Test
    public void Chrome_Test() throws MalformedURLException, InterruptedException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void waitTest_Implicit() throws InterruptedException, MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

//        Thread.sleep(2000);
//        WebElement inapoiInSite= driver.findElement(By.xpath("//a[normalize-space()='Inapoi in site']"));
//        inapoiInSite.click();

        Thread.sleep(1000);
        Tester_page_EMAG emagPage = PageFactory.initElements(driver,Tester_page_EMAG.class);
        Thread.sleep(2000);

//  folosim functia getAcceptButton ca sa activam comanda
        WebElement acceptButton = emagPage.getAcceptButton();
        Thread.sleep(1000);
        acceptButton.click();

//  folosim functia getAcceptButton ca sa activam comanda
        WebElement loginButton = emagPage.getLoginButton();
        Thread.sleep(1000);
        loginButton.click();

        Thread.sleep(3000);
        driver.quit();
    }


    @Test   // expliciturile se aplica doar cand avem nevoie de un anumit WAIT pe pagina pe care navigam
    public void waitTest_Explicit() throws InterruptedException, MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));   //  implicite wait - timp de asteptare, comanda implicita
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1)) ;

//        FluentWait<ChromeDriver> asteapta = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

//  ii punem un timp de asteptare sa incarce acel element cautat
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.close")));

//  anulam acel pop-up care apare pe pagina si ne intersecteaza click-ul
        WebElement closeButton = driver.findElement(By.cssSelector("button.close"));
        closeButton.click();

//  ii punem un timp de asteptare sa incarce toate elementele de pe pagina
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.js-accept")));
        WebElement acceptButton = driver.findElement(By.cssSelector("button.js-accept"));

//  ii punem un timp de asteptare sa incarce butonul de ACCEPTARE
        wait.until(ExpectedConditions.elementToBeClickable(acceptButton));
        acceptButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.login-btn")));
        WebElement loginButton = driver.findElement(By.cssSelector("a.login-btn"));
        loginButton.click();
        Thread.sleep(3000);

//  facem un assert pentru login-ul de pe pagina ce apare
        assertTrue(driver.getCurrentUrl().contains("user/login"));

        driver.quit();
    }
}
