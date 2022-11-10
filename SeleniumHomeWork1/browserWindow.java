package SeleniumHomeWork1;

import org.openqa.selenium.*;

import java.util.Iterator;
import java.util.Set;

public class browserWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Utilitati.getChromeDriver();
        try {
            //new tab
            driver.get("https://demoqa.com/browser-windows");
            driver.manage().window().maximize();
            WebElement newTab = driver.findElement(By.id("tabButton"));
            newTab.click();
            Thread.sleep(3000);
            Set<String> windowsIDs = driver.getWindowHandles();
            System.out.println(windowsIDs);
            Iterator<String> iterator = windowsIDs.iterator();
            String parentId = iterator.next();
            String childId = iterator.next();
            driver.switchTo().window(childId);
            String mesajTabNou = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
            System.out.println(mesajTabNou);
            driver.switchTo().window(parentId);
            System.out.println("Test complete!");

            //new window
            WebElement newWindow = driver.findElement(By.id("windowButton"));
            newWindow.click();
            Thread.sleep(4000);
            Set<String> windowsID = driver.getWindowHandles();
            System.out.println(windowsID);
            Iterator<String> iteratorWindow = windowsIDs.iterator();
            String parentIdWindow = iteratorWindow.next();
            String childIdWindow = iteratorWindow.next();
            driver.switchTo().window(childIdWindow);
            Thread.sleep(4000);
            driver.switchTo().window(parentId);
            System.out.println("New window");

            //New Window Message
            WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
            newWindowMessage.click();
            Set<String> windowMessage = driver.getWindowHandles();
            System.out.println(windowMessage);
            Iterator<String> iteratorWindowMessage = windowMessage.iterator();
            String parentIdWindowMessage = iteratorWindowMessage.next();
            String childIdWindowMessage = iteratorWindowMessage.next();
            Thread.sleep(3000);
            driver.switchTo().window(childIdWindowMessage);
            Thread.sleep(4000);
            driver.switchTo().window(parentId);
            System.out.println("New window message");

        } catch (ElementClickInterceptedException | NoSuchElementException | InterruptedException e) {
            if (driver != null) {
                System.out.println("Ceva a mers prost, nu am resuit sa fac testul");
                e.printStackTrace();
                Utilitati.takeScreenshot("newTabTest", driver);
            }

        } finally {
            if (driver != null) {
                System.out.printf("Eu voi fi executat indiferent de rezultat");
                driver.quit();
            }
        }
    }
}
