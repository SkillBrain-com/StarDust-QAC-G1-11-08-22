package SeleniumCurs2;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTestWithException {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Utilitati.getChromeDriver();
        // scopul (vizibilitatea)
        try {
            driver.get("https://demoqa.com/alerts");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            WebElement fereastraAlerte = driver.findElement(By.xpath("(//div[contains(@class,'header-wrapper')])[3]"));
//            actions.moveToElement(fereastraAlerte).build().perform();
//            WebElement alertButton = driver.findElement(By.id("alertButton"));
//            alertButton.click();
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//            driver.findElement(By.id("confirmButton")).click();
//            Thread.sleep(3000);
//            Alert alert = driver.switchTo().alert();
//            alert.dismiss();
//            Thread.sleep(3000);
//            WebElement confirmMassage = driver.findElement(By.id("confirmResult"));
//            System.out.println(confirmMassage.getText());
            driver.findElement(By.id("promtButton")).click();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Selenium test!");
            Thread.sleep(2000);
            alert.accept();
            WebElement promptMessage = driver.findElement(By.id("promptResult"));
            System.out.println(promptMessage.getText());

            System.out.println("Test complet!");
        } catch (ElementClickInterceptedException e) {
            System.out.println(e.getMessage());
            System.out.println("Ceva a mers prost, nu am reusit sa fac testul!");
            e.printStackTrace();
        } finally {
            System.out.println("Eu voi fi executat indiferent de rezultat!");
            driver.quit();
        }
    }
}
