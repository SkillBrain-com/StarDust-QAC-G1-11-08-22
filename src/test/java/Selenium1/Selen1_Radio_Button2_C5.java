package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selen1_Radio_Button2_C5 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        Thread.sleep(1000);


        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        WebElement yesRadioButtonLabel = driver.findElement (By.cssSelector("label[for=\"yesRadio\"]"));
        WebElement noRadioButtonLabel = driver.findElement (By.cssSelector("label[for=\"noRadio\"]"));
        Thread.sleep(1000);

        System.out.println("yesRadioButton before click: isEnabled " + yesRadioButton.isEnabled() + ", is Selected: " + yesRadioButton.isSelected());
        System.out.println("noRadioButton before click: isEnabled " + noRadioButton.isEnabled() + ", is Selected: " + noRadioButton.isSelected());
        Thread.sleep(1000);

        yesRadioButtonLabel.click();
        driver.executeScript("argument(0).click" , yesRadioButton);
        driver.executeScript("argument(0).click" , noRadioButton);
        Thread.sleep(1000);


        System.out.println("yesRadioButton after click: isEnabled " + yesRadioButton.isEnabled() + ", is Selected: " + yesRadioButton.isSelected());
        System.out.println("noRadioButton after click: isEnabled " + noRadioButton.isEnabled() + ", is Selected: " + noRadioButton.isSelected());
        Thread.sleep(1000);

        yesRadioButtonLabel.click();
        driver.executeScript("argument(0).click" , yesRadioButton);
        driver.executeScript("argument(0).click" , noRadioButton);
        Thread.sleep(1000);

        driver.quit();
    }
}
