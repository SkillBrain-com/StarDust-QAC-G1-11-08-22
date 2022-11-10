package SeleniumHomeWork2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class AlertTestsHomeWork {
    public static void main(String[] args) {
       thirdAlertTest();
    }

    public static void firstTests() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

            WebElement firstButton = driver.findElement(By.id("alertexamples"));
            firstButton.click();
            Alert firstAlert = driver.switchTo().alert();
            System.out.println(firstAlert.getText());
            firstAlert.accept();
            System.out.println("Is alert open after it has been closed: " + isAlertOpened(driver));
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void secondAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            WebElement secondButton = driver.findElement(By.id("confirmexample"));
            for (int i = 0; i <= 1; i++) {
                System.out.println("Iteration " + i);
                secondButton.click();
                System.out.println("Is alert open after click button: " + isAlertOpened(driver));
                Alert alert = driver.switchTo().alert();
                if (i==0) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                System.out.println(driver.findElement(By.id("confirmexplanation")).getText());
                System.out.println("Is alert open after it has been closed: " + isAlertOpened(driver));
                System.out.println("==============================");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void thirdAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            WebElement thirdButton = driver.findElement(By.id("promptexample"));
            WebElement promptReturn = driver.findElement(By.id("promptreturn"));
            for (int i = 0; i <= 1; i++) {
                System.out.println("Iteration " + i);
                thirdButton.click();
                System.out.println("Is alert open after click button: " + isAlertOpened(driver));
                Alert thirdAlert = driver.switchTo().alert();
                sleep(2000);
                if (i == 0) {

                    thirdAlert.accept();
                } else {
                    thirdAlert.dismiss();
                }
                System.out.println(driver.findElement(By.id("promptreturn")).getText());
//                promptReturn.clear();
//                promptReturn.sendKeys("text random");
                System.out.println("Is alert open after it has been closed: " + isAlertOpened(driver));
                System.out.println("==============================");
            sleep(2000);
            }
    } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
        if (driver != null) {
        driver.quit();
             }
        }
    }
    public static boolean isAlertOpened(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
