package Selenium_Grid;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Selen2_Alert_JavaSCR_GRID {
//  suntem in pagina "https://testpages.herokuapp.com/styled/alerts/alert-test.html"

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        firstAlertTest();
        secondAlertTest();
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
    public static void firstAlertTest() throws InterruptedException, MalformedURLException {
/* scoatem initializarea driverului de Chrome in afara blocului de try:
deci spargem blocul de mai jos in partea de NULL si partea de accesare din ciclul "try - finally"
            ChromeDriver driver = Browser_Manager.getChromeDriver();
*/
        RemoteWebDriver driver = null;
        try {
            driver = WebdriverManager.getRemoteWebDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            driver.manage().window().maximize();
            Thread.sleep(1500);
            System.out.println(" ");
            System.out.println("Incepe prima actiune - primul clic_to_box  \n");

            WebElement firstButton = driver.findElement(By.id("alertexamples"));
            firstButton.click();
            Alert firstAlert = driver.switchTo().alert();
            System.out.println(firstAlert.getText());
            firstAlert.accept();
            Thread.sleep(2000);
            System.out.println("Este alerta deschisa dupa ce se inchide ? - " + isAlertOpened(driver));

//            driver.switchTo().alert();
        } finally {
            if (driver != null) {
                driver.close();
            }
            System.out.println("Aici se inchide prima actiune - CLOSE \n");
        }
    }
//-------------------------------------------------------------------------------------------------------------------
    @Test
    public static void secondAlertTest() throws InterruptedException, MalformedURLException {
        RemoteWebDriver driver = null;
        try {
            driver = WebdriverManager.getRemoteWebDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

            driver.manage().window().maximize();
            Thread.sleep(1500);
            System.out.println(" ");
            System.out.println("Incepe a doua actiune - al doilea clic_to_box  \n");

            WebElement secondButton = driver.findElement(By.id("confirmexample"));
            for (int i = 0; i <= 1; i++) {
                System.out.println("Iteratia = " + i);
                secondButton.click();
                System.out.println( "Este alerta deschisa dupa apasarea butonului? - " + isAlertOpened(driver));
                Alert alert = driver.switchTo().alert();
                Thread.sleep(1500);
                if( i == 0 ){
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                Thread.sleep(2000);
                System.out.println(driver.findElement (By.id("confirmexplanation")).getText());
                System.out.println("Este alerta deschisa dupa inchidere ? - " + isAlertOpened(driver));
                System.out.println(" ---------- este o noua iteratie ----------");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
// aici verificam daca alerta este deschisa sau nu!
    public static boolean isAlertOpened(RemoteWebDriver driver){
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
