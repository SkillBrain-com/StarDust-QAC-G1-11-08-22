package SeleniumCurs2;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsTests {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utilitati.getChromeDriver();
        //scop (vizibilitate)
        try {
            driver.get("https://demoqa.com/buttons");
            driver.manage().window().maximize();
//            driver.findElement(By.xpath("//button[normalize-space()='Click Me']")).click();
//            String dymanicClickMessage = driver.findElement(By.id("dymanicClickMessage")).getText();
//            System.out.println(dymanicClickMessage);

//            WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
//            Actions actionsRightClick = new Actions(driver);
//            //context click = click dreapta
//            actionsRightClick.contextClick(rightClickButton).build().perform();
//            String contextClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
//            System.out.println(contextClickMessage);

            WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
            Actions actionsDoubleClick = new Actions(driver);
            actionsDoubleClick.doubleClick(doubleClickButton).build().perform();
            System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
            System.out.println(doubleClickButton);


            System.out.println("Test complete!");
        }catch (ElementClickInterceptedException e) {
            if (driver != null) {
                System.out.println("Ceva a mers prost, nu am resuit sa fac testul");
                e.printStackTrace();
            }

        }finally {
            if (driver!= null) {
                System.out.println("Eu voi fi executat indiferent de rezultat");
                driver.quit();
            }
        }
    }
}

