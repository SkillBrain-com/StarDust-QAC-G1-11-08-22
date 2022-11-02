package Selenium2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium2_TestWithExcep_Alert {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
//        WebDriver driver = Utilitati.getChromeDriver();

//   scopul sau vizibilitatea este dor in acest bloc de driver de acee a fost mutat mai sus
        try {
//            driver.get("https://demoqa.com");
//  daca ne ducem direct la pagina de ALERTS, cum este specificat mai jos, atunci comentam toate actiunile pana acolo.

            driver.get("https://demoqa.com/alerts");
            driver.manage().window().maximize();
            Thread.sleep(1500);

            driver.findElement(By.xpath("//path[@stroke='00aecd']")).click();
            WebElement elementsCard = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]"));
            Thread.sleep(1500);
            elementsCard.click();
            Thread.sleep(1500);
            Actions actions = new Actions(driver);
            WebElement fereastra_Alerte = driver.findElement(By.xpath("(//div[contains(@class,'header-wrapper')])[3]"));

//  Avem actiunea pentru apasarea butonului 1
//  ATENTIE: cand utilizam clasa ACTIONS trebuie intai s-o construim cu BUILD si apoi sa-i da si actiune cu PERFORM

           actions.moveToElement(fereastra_Alerte).build().perform();
           Thread.sleep(1500);
           fereastra_Alerte.click();
            Thread.sleep(1000);
            WebElement alerte = driver.findElement(By.id("item-1"));
            alerte.click();
            Thread.sleep(1000);
            WebElement alertButton = driver.findElement(By.id("alertButton"));
// aici nu mai facem inca un WebElement, scriem direct driverul pentru By.id - pt primul buton
            alertButton.click();
            Thread.sleep(3000);
// ne mutam pe urmatoarea fereastra
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(3000);
//  ca sa apasam butonul inferior comentam butoanele superioare , deci acum sunt comentate


// scriem direct driverul pentru By.id - pt butonul 2
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(1500);
            Alert alert1 =driver.switchTo().alert();
            alert1.dismiss();
            Thread.sleep(2500);
            WebElement confirmMessage = driver.findElement(By.id("confirmResult"));
            System.out.println(confirmMessage.getText());


// scriem driverul pentru By.id - pt butonul 3 , dar intai construim butonul
            driver.findElement(By.id("promtButton")).click();
            Thread.sleep(2500);
            Alert alert2 = driver.switchTo().alert(); // se trece la fereastra de alerta = switch
            alert2.sendKeys("\"Selenium Test - pt verificare\"");
            Thread.sleep(1500);
            alert2.accept();
            WebElement promptMessage = driver.findElement (By.id("promptResult"));
            System.out.println(promptMessage.getText());


            System.out.println("Testul este complet");
        } catch(ElementClickInterceptedException e){
            System.out.println("Ceva a mers prost si nu am reusit sa facem testul \n");
//            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Eu voi fi executat indiferent de rezultat \n");
            driver.quit();
        }
    }
}
