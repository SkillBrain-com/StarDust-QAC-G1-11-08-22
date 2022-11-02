package Selenium2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2_Alarme_fake2 {

    public static void main(String[] args) throws InterruptedException {
//        prima_alerta();
        a_doua_alerta();
    }

    public static void prima_alerta() {
        ChromeDriver driver = null;
        try {
            driver = Browser_Manager.getChromedriver();
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
            System.out.println("E alarma 1 deschisa dupa inchidere ? - " + isAlertOpened(driver));

//  se comenteaza linia de ALERTA = se inchide pagina la final de executie si se redeschide pt testul urmator
//           Alert prima_alerta = driver.switchTo().alert();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void a_doua_alerta() {
        ChromeDriver driver = null;
        try {
            driver = Browser_Manager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
            driver.manage().window().maximize();
            WebElement secondButton = driver.findElement(By.id("modaldialog"));
            secondButton.click();
            Thread.sleep(1000);
            WebElement button2_OK = driver.findElement(By.xpath("//div[@class='dialog-actions']"));
            System.out.println(driver.findElement(By.xpath("//div[@class='dialog-actions']")).getText());
            Thread.sleep(1000);
            button2_OK.click();
            Thread.sleep(1000);
            System.out.println("E alarma 2 deschisa dupa inchidere ? - " + isAlertOpened(driver));

//  se comenteaza linia pt ca nu este nevoie. Se inchide pagina la final.
//          Alert a_doua_alerta = driver.switchTo().alert();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
    // aici verificam daca alerta este deschisa sau nu!
    public static boolean isAlertOpened(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
