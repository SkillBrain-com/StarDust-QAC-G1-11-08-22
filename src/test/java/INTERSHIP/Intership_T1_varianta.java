package INTERSHIP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Intership_T1_varianta {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https://cysiam-client-docker.azurewebsites.net/auth/sign-in");
            driver.manage().window().maximize();
            Thread.sleep(1500);

            WebElement SignIn_AccessButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[3]/button"));
            SignIn_AccessButton.click();

            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();
            Thread.sleep(2500);

            for (String window: windowHandles){
                if ( !window.equals(parentWindow)){
                    driver.switchTo().window(window);
                    break;
                }
            }

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();

            driver.switchTo().window(parentWindow);
            driver.findElement(By.id("windowButton")).click();
            Set<String> windowHandles2 = driver.getWindowHandles();
            Thread.sleep(2500);
            for (String window: windowHandles2){
                if ( !window.equals(parentWindow)){
                    driver.switchTo().window(window);
                    break;
                }
            }
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            Thread.sleep(1500);
            driver.close();

            System.out.println("Finish - am inchis fereastra");

        } finally {
            if (driver != null ){
                driver.quit();
            }
        }




    }
}
