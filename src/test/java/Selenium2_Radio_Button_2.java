import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2_Radio_Button_2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        Thread.sleep(1500);


        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        WebElement yesRadioButtonLabel = driver.findElement (By.cssSelector("label[for=\"yesRadio\"]"));
        Thread.sleep(1500);

        System.out.println("yesRadioButton before click: isEnabled " + yesRadioButton.isEnabled() + ", is Selected: " + yesRadioButton.isSelected());
        System.out.println("noRadioButton before click: isEnabled " + noRadioButton.isEnabled() + ", is Selected: " + noRadioButton.isSelected());
        Thread.sleep(1500);

        yesRadioButtonLabel.click();
        driver.executeScript("argument(0).click" , yesRadioButton);
        driver.executeScript("argument(0).click" , noRadioButton);
        Thread.sleep(2500);
        yesRadioButtonLabel.click();

        System.out.println("yesRadioButton after click: isEnabled " + yesRadioButton.isEnabled() + ", is Selected: " + yesRadioButton.isSelected());
        System.out.println("noRadioButton after click: isEnabled " + noRadioButton.isEnabled() + ", is Selected: " + noRadioButton.isSelected());
        Thread.sleep(1000);

//        driver.close();
        driver.quit();
    }
}
