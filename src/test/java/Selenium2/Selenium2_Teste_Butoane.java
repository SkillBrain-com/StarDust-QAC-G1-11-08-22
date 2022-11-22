package Selenium2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium2_Teste_Butoane {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://demoqa.com/buttons");
            driver.manage().window().maximize();
            Thread.sleep(1500);

// Este pagina de la demoqa.com /Elements /Button si testam cele 3 butoane

//  "dynamicClick" este clicul STANGA ( simplu )
            driver.findElement(By.xpath("//button[normalize-space()='Click Me']")).click();
            String dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
            System.out.println(dynamicClickMessage);

//  "contextClick" este clicul din DREAPTA
            WebElement rightClickButton = driver.findElement (By.id("rightClickBtn"));
            Actions actionRightClick = new Actions(driver);
            actionRightClick.contextClick(rightClickButton).build().perform();
            String contextClickMessage = driver.findElement( By.id("rightClickMessage")).getText();
            System.out.println(contextClickMessage);

//  "doubleClick" este apasarea dubla
            WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
            Actions actionsDoubleClick = new Actions(driver);
            actionsDoubleClick.doubleClick(doubleClickButton).build().perform();
            System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
            System.out.println("Testul este complet");
            Thread.sleep(2500);
        } catch(ElementClickInterceptedException | NoSuchElementException e ){
            if(driver != null);
            {
                System.out.println("Ceva a mers prost si nu am reusit sa facem testul \n");
                e.printStackTrace();    // linia tipareste stiva de erori in consola ca sa vedem ce probleme avem
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
