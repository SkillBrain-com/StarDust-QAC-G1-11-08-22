package SeleniumHomeWork5Grid;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class utilities {
    public static RemoteWebDriver getRemoteDriver() throws MalformedURLException {
        //define URL, capabilities
        // URL link = new URL("http:localhost:4444");
        //ChromeOptions chromeOptions = new ChromeOptions();
        return new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
    }


    public static ChromeDriver getChromeImplicitWait (int duration) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
        return driver;
    }

//    public static void getChromeDriver () throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
//        return new ChromeDriver();
//    }


    public static ChromeDriver getMobileChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String, String> mobileMap = new HashMap<>();
        mobileMap.put("deviceName", "iPhone X");

        options.setExperimentalOption("mobileEmulation", mobileMap);
//        options.setHeadless(true);
//        options.setAcceptInsecureCerts(true); //accepta fara certificate
        options.addArguments("start-maximized");
        return new ChromeDriver(options);

    }



    public static void takeScreenshot(String testcaseName, WebDriver driver) {
        String destination = null;
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            destination = System.getProperty("user.dir") + "/Log/" + testcaseName + " .png";
            FileUtils.copyFile(source, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken");

        }
    }
}
