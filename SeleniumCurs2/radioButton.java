package SeleniumCurs2;

import org.openqa.selenium.*;

public class radioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Utilitati.getChromeDriver();
        try {
            driver.get("https://demoqa.com/radio-button");
            driver.manage().window().maximize();
            WebElement yesButton = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
            yesButton.click();
            Thread.sleep(3000);
            boolean isSelected = driver.findElement(By.id("yesRadio")).isSelected();
            boolean isEnabled = driver.findElement(By.id("noRadio")).isEnabled();
            System.out.println("Este butonul \"No\" enabled?" + isEnabled);

            if(!isSelected) {
                System.out.println(isSelected);
                System.out.println("Test complite!");
        }else {
                throw new NoSuchElementException("Nu s-a selectat butonul!");
            }
        }catch (ElementClickInterceptedException | NoSuchElementException | InterruptedException e) {
            if (driver != null) {
                System.out.println("Ceva a mers prost, nu am resuit sa fac testul");
                e.printStackTrace();
            }

        }finally {
            if (driver!= null) {
                System.out.printf("Eu voi fi executat indiferent de rezultat");


                driver.quit();
            }
        }
    }
}
