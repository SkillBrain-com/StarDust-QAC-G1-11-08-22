package Object_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Emag_Test_Page_C8 {

   ChromeDriver driver;

   @BeforeSuite
   public void getChromeDriver(){
//     driver = Utilitati_C8.getChromeDriver();
      driver = Utilitati_C8.getChromeImplicitWait(3);
//      driver = Utilitati_C8.getChromeWithWait(4);
   }

   @AfterSuite
   public void closeChrome(){
       driver.quit();
   }


    @Test
    public void implicitTest(){
        driver.get("https://www.emag.ro/");
        Pagina_Emag pagina_emag = PageFactory.initElements(driver, Pagina_Emag.class);
        WebElement casutaNeagra = pagina_emag.getMesajPagina();
        casutaNeagra.click();
//  dau click pe banner-ul din josul paginii ca sa eliminam restuld e pop-up-uri care apar pe pagina ( sunt "by default" )
//        driver.findElement(By.xpath ("//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']")).click();
//  eliminam linia de mai sus dar am definit totul in linia de Pagina_Emag

// comentam aceasta linie pt ca am scris in "Pagina_Emag" linia de XPATH pt buton
//        WebElement accept = driver.findElement(By.xpath("//button[normalize-space()='Accept']"));
//        Thread.sleep(2500);               // anulam linia si facem functia de asteptare implicita - vezi mai sus
//      variantele urmatoare:  "getChromeWithWait" si "getChromeImplicitWait"
        WebElement accept = pagina_emag.getAcceptButton();
        accept.click();
   }

   /*  ------------------------------------------------------------------------------------------------------------------
avem alta metoda unde ii punem un timp de asteptare explicit
    */

    @Test
    public void explicitTest(){
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        Pagina_Emag pagina_emag = PageFactory.initElements(driver, Pagina_Emag.class);
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3)) ;
        WebElement casutaNeagra = pagina_emag.getMesajPagina();
        explicitWait.until (ExpectedConditions.visibilityOf(casutaNeagra));

//        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']")));
//        driver.findElement(By.xpath ("//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']")).click();

        casutaNeagra.click();

//        WebElement accept = driver.findElement(By.xpath("//button[normalize-space()='Accept']"));
        WebElement accept = pagina_emag.getAcceptButton();
        accept.click();
    }


}
