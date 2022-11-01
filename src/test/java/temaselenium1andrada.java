package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tema1 {


    public static void main(String[] args) throws InterruptedException {

//       ChromeDriver driver = new ChromeDriver();
     System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     try{
      driver.manage().window().maximize();
      driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
      WebElement basicPage = driver.findElement(By.cssSelector("h1"));
      WebElement explenationElement = driver.findElement(By.cssSelector(".explanation"));
      WebElement centeredElement = driver.findElement(By.cssSelector(".centered"));
      WebElement para1Element = driver.findElement(By.id("para1"));
      WebElement para2Element = driver.findElement(By.id("para2"));
      WebElement pagefooterElement = driver.findElement(By.cssSelector(".page-footer"));
      WebElement evilElement = driver.findElement(By.cssSelector("a[href=\"https://eviltester.com\""));
      WebElement compendElement = driver.findElement(By.cssSelector("a[href=\"https://compendiumdev.co.uk\""));
      System.out.println(basicPage.getText());
      System.out.println(explenationElement.getText());
      System.out.println(para1Element.getText());
      System.out.println(para2Element.getText());
      System.out.println(centeredElement.getText());
      System.out.println(pagefooterElement.getText());
      System.out.println(evilElement.getText());
      System.out.println(compendElement.getText());
      Thread.sleep(2000);
     } catch (Exception exceptie) {
      System.out.println(exceptie.getMessage());
     } finally {
      driver.quit();
     }


    }
}