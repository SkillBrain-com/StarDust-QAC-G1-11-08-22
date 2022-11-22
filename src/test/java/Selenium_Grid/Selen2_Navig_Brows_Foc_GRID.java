package Selenium_Grid;

import Selenium2.Utilitati;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

public class Selen2_Navig_Brows_Foc_GRID {

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
    public static void main(String[] args) throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();

        try {
//  Cautam un buton care incarca o pagina goala
            driver.get("https://demoqa.com/browser-windows");
            driver.manage().window().maximize();
            Thread.sleep(1500);

            WebElement newTab =driver.findElement(By.id("tabButton"));
            newTab.click();
            Thread.sleep(1500);
//          String parentId = driver.getWindowHandle();
//          System.out.println(parentId); - este parintele paginii
            Set<String> windowsIds = driver.getWindowHandles();
            System.out.println(windowsIds);
            Iterator<String> iterator = windowsIds.iterator();
            String parentId = iterator.next();  // ii spunem sa ia primul element si sa-l salveze ca string
            String childId = iterator.next();   // ii spunem sa ia urmatorul element
            driver.switchTo().window(childId);  // schimba FOCUS-ul pe urmatoarul tab/pagina

            String mesajTabNou = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
//          String mesajTabNou = driver.findElement(By.id("sampleHeading")).getText(); ( este o varianta dar nu merge
            System.out.println(mesajTabNou);
            driver.switchTo().window(parentId); // ne intoarcem la pagina principala / tabul principal
            System.out.println("Test complet executat!");
        } catch(ElementClickInterceptedException | NoSuchElementException | InterruptedException e ){
            if(driver != null);
            {
                System.out.println("Ceva a mers prost si nu am reusit sa facem testul \n");
                e.printStackTrace();    // linia tipareste stiva de erori in consola ca sa vedem ce probleme avem
            Utilitati.takeScrennshot("newTabTest", driver);

            }
        } finally {
            if(driver != null);
            {
                System.out.println("Eu voi fi executat indiferent de rezultat \n");
                driver.quit();
            }
        }
    }
}
