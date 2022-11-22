package Selenium_Grid;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class WebdriverManager {

    public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444/"),new ChromeOptions());
    }

    public static ChromeDriver getChromeDriverByExecutable(){
            System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe");
            return new ChromeDriver();
    }
    public static ChromeDriver getChromeDriverByManager(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static ChromeDriver getChromeDriverWithOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();

        Map<String, String> map = new HashMap<>();
        map.put("deviceName","iPhone X");
//        chromeOptions.setExperimentalOption("mobileEmulation", map);
        chromeOptions.addArguments("start-maximized");
        chromeOptions.setAcceptInsecureCerts(true);

// pentru schimbarea profilului in chrome Driver putem sa schimbam cu linia de mai jos
//        chromeOptions.addArguments("user-data-dir = xx");
//        chromeOptions.addArguments("profile-directory = Profile 1");

// aducem varianta corecta de drive si intializam/returnam o varianta de Chrome
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
}


