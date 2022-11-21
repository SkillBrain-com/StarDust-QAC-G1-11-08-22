package SeleniumHomeWork5Grid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class GridSetUp {
    public static WebDriver driver;

    public static void main(String[]  args) throws MalformedURLException, InterruptedException{

        String URL = "https://www.DemoQA.com";
        String Node = "https://192.168.1.164:4444/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(driver.getCurrentUrl());
        //cap.setBrowserName(Chrome);

        driver = new RemoteWebDriver(new URL(Node), cap);

        driver.navigate().to(URL);
        Thread.sleep(5000);
        driver.quit();

}}
