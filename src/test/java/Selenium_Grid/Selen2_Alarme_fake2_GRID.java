package Selenium_Grid;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class Selen2_Alarme_fake2_GRID {

    public static void main(String[] args) throws InterruptedException {
        prima_alerta();
        a_doua_alerta();
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

    public static void prima_alerta() {
        RemoteWebDriver driver = null;
        try {
            driver = WebdriverManager.getRemoteWebDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
            driver.manage().window().maximize();
            WebElement firstButton = driver.findElement(By.id("fakealert"));
//  alarma falsa, se gaseste cu inspectarea in pagina - se gaseste selectorul si se da click pt verificare
            firstButton.click();
            Thread.sleep(1000);
            WebElement button1_OK = driver.findElement(By.cssSelector(".dialog.active"));
            System.out.println(driver.findElement(By.cssSelector(".dialog.active")).getText());
            Thread.sleep(1000);
            button1_OK.click();
            Thread.sleep(1000);
            System.out.println("E alarma 1 deschisa dupa executie ? - " + isAlertOpened(driver));

//  se comenteaza linia de Switch = se inchide pagina la final de executie. Se redeschide pt testul urmator
//           Alert prima_alerta = driver.switchTo().alert();

        } catch (InterruptedException | MalformedURLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void a_doua_alerta() {
        RemoteWebDriver driver = null;
        try {
            driver = WebdriverManager.getRemoteWebDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
            driver.manage().window().maximize();
            WebElement secondButton = driver.findElement(By.id("modaldialog"));
            secondButton.click();
            Thread.sleep(1000);
//            WebElement button2_OK = driver.findElement(By.xpath("//div[@class='dialog-actions']"));
            WebElement button2_OK = driver.findElement(By.xpath("//div[@class='dialog active']"));
//            System.out.println(driver.findElement(By.xpath("//div[@class='dialog-actions']")).getText());
            System.out.println(driver.findElement(By.xpath("//div[@class='dialog active'] [h2]")).getText());
            Thread.sleep(1000);
            button2_OK.click();
            Thread.sleep(1000);
            System.out.println("E alarma 2 deschisa dupa executie ? - " + isAlertOpened(driver));

//  se comenteaza linia pt ca nu este nevoie. Se inchide pagina la final.
//          Alert a_doua_alerta = driver.switchTo().alert();

        } catch (InterruptedException | MalformedURLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
//  aici verificam daca alerta este deschisa sau nu!
    public static boolean isAlertOpened(RemoteWebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
