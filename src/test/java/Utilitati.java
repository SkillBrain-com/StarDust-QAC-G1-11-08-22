import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Utilitati {

    public static RemoteWebDriver getRemoteDriver()throws MalformedURLException {
//        URL url = new URL ("http://localhost:4444/ui");
//        ChromeOptions chromeOptions =
        return new RemoteWebDriver(new URL("http://localhost:4444/ui"),new ChromeOptions());

    }


    public static ChromeDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
//  creez un obiect de tipul ChromeDriver
//        ChromeDriver driver = new ChromeDriver();     // sau accesez cu linia de mai jos
        return new ChromeDriver();
    }

    public static ChromeDriver getMobileChromeDriver(){
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeOptions options = new ChromeOptions();
        Map<String,String> mobileMap= new HashMap<>();
        mobileMap.put("deviceName" , "iPhone X");
        options.setExperimentalOption( "mobileEmulation", mobileMap  );
        options.setHeadless(true);      // ESTE COMANDA SA FACA TESTELE IN SPATE , adica nu le afiseaza.!!!!!!
//        options.setAcceptInsecureCerts(true);
//        options.addArguments("start-maximized");    // maximizarea paginii
        return new ChromeDriver();
    }
    public static ChromeDriver getChromeImplicitWait() {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new ChromeDriver();
    }

    public static ChromeDriver getChromeWithWait(){
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new ChromeDriver();
    }

    public static void takeScrennshot (String testcaseName, WebDriver driver) {
        String destination = null;
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            destination = System.getProperty("user.dir") + "/Logs/" + testcaseName + " .png";
            FileUtils.copyFile(source, new File(destination));
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken");
        }
     }
}
