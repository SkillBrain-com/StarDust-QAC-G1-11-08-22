package Selenium_Grid.HUB_NODE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Grid_HUB_NODE {
    public static WebDriver driver;

    public static void main(String[]  args) throws MalformedURLException, InterruptedException{

        String URL = "https://www.DemoQA.com";
        String Node = "https://192.168.1.164:4444/wd/hub";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
        DesiredCapabilities cap = new DesiredCapabilities();

        driver = new RemoteWebDriver(new URL(Node), cap);

        driver.navigate().to(URL);
        Thread.sleep(7000);
        driver.quit();
    }
}