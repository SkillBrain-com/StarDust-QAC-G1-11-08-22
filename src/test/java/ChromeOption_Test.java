import Object_packages.Tester_page_EMAG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ChromeOption_Test {

    ChromeDriver driver;

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        if(driver != null){
            driver.quit();
        }
    }

    @Test
    public void mobileTest(){
        ChromeDriver driver = WebdriverManager.getChromeDriverWithOptions();
        driver.get("https://demoqa.com/");
//        driver.get("https://youtube.com/");       // - am folosit pagina asta pt testare
        driver.manage().window().maximize();
        driver.quit();
    }
    @Test
    public void waitTest_Implicit() throws InterruptedException {
//        ChromeDriver driver = WebdriverManager.getChromeDriverWithOptions();
//  putem sa definim si ChromeDriver sau doar driver ca mai jos
        driver = WebdriverManager.getChromeDriverWithOptions();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));   //  implicite wait - timp de asteptare, comanda implicita

//  declaram o instanta de OBIECT ( si apelam metode de PAGE_FACTORI ) ca sa instantiem clasa respectiva - din Tester_page_EMAG
        Tester_page_EMAG emagPage = PageFactory.initElements(driver, Tester_page_EMAG.class);


        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();

//  linia de mai jos se comenteaza ( devine text ) cand activam linia 44 - cea cu Test_page_EMAG
//        WebElement accept_Button = driver.findElement(By.cssSelector("button.js-accept"));

//  folosim functia getAcceptButton ca sa activam comanda
        WebElement accept_Button = emagPage.getAcceptButton();
        Thread.sleep(1000);
        accept_Button.click();
//  daca avem o singura variabila putem sa mutam click-ul pe el si sa scriem doar linia:
//      emagPage.getAcceptButton().click();

//  linia de mai jos se comenteaza ( devine text ) cand activam linia 44 - cea cu Test_page_EMAG
//        WebElement login_Button = driver.findElement(By.cssSelector("a.login.btn"));          // varianta 1
//        WebElement login_Button = driver.findElement(By.xpath("//*[@id=\"my_account\"]/i"));  // varianta 2

//  folosim functia getAcceptButton ca sa activam comanda
        WebElement login_Button = emagPage.getLoginButton();
        Thread.sleep(1000);
        login_Button.click();

//  daca avem o singura variabila putem sa mutam click-ul pe el si sa scriem doar linia:
//      emagPage.getLoginButton().click();

        Thread.sleep(5000);

        driver.quit();
    }

    @Test   // expliciturile se aplica doar cand avem nevoie de un anumit WAIT pe pagina pe care anvigam
    public void waitTest_Explicit() throws InterruptedException {
//        ChromeDriver driver = WebdriverManager.getChromeDriverWithOptions();
//  putem sa definim si ChromeDriver sau doar driver ca mai jos
        driver = WebdriverManager.getChromeDriverWithOptions();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));   //  implicite wait - timp de asteptare, comanda implicita
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)) ;

//  ii punem un timp de asteptare sa incarce acel element cautat
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.close")));

//  anulam acel pop-up care apare pe pagina si ne intersecteaza click-ul
         WebElement close_Button = driver.findElement(By.cssSelector("button.close"));
        close_Button.click();

//  ii punem un timp de asteptare sa incarce toate elementele de pe pagina
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.js-accept")));
        WebElement accept_Button = driver.findElement(By.cssSelector("button.js-accept"));

//  ii punem un timp de asteptare sa incarce butonul de ACCEPTARE
        wait.until(ExpectedConditions.elementToBeClickable(accept_Button));
        accept_Button.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.login-btn")));
        WebElement login_Button = driver.findElement(By.cssSelector("a.login-btn"));
        login_Button.click();
        Thread.sleep(5000);

//  facem un asser pentru login-ul de pe pagina ce apare
        assertTrue(driver.getCurrentUrl().contains("user/login"));

//  la final inchide pagina si driver-ul sa nu incarcam memeoria cu tot felul de pagini
        driver.quit();
    }
}
