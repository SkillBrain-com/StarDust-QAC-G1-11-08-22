package SeleniumHomeWork2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static SeleniumHomeWork2.AlertTestsHomeWork.isAlertOpened;

public class FakeAlerts {
    public static void main(String[] args) {
        firstFakeAlert();
        secondFakeAlert();
    }

    public static void firstFakeAlert() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

            WebElement firstButton = driver.findElement(By.id("fakealert"));
            firstButton.click();
            WebElement okButton = driver.findElement(By.id("dialog-ok"));
            Thread.sleep(2000);
            okButton.click();
            System.out.println("Is fake alert open after it has been closed: " + isAlertOpened(driver));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void secondFakeAlert() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

            WebElement secondButton = driver.findElement(By.id("modaldialog"));
            secondButton.click();
            WebElement divModal =driver.findElement(By.id("dialog-ok"));
            Thread.sleep(2000);
            divModal.click();
            System.out.println("Is fake alert open after it has been closed: " + isAlertOpened(driver));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
