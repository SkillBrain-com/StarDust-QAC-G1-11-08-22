package Object_packages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
public class Utilitati_C8 {

    public static ChromeDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        return new ChromeDriver();
    }

    public static ChromeDriver getMobileChromeDriver(){
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeOptions options = new ChromeOptions();
        Map<String,String> mobileMap= new HashMap<>();
        mobileMap.put("deviceName" , "iPhone X");
        options.setExperimentalOption( "mobileEmulation", mobileMap  );
//        options.setHeadless(true);      // ESTE COMANDA SA FACA TESTELE IN SPATE , adica nu le afiseaza.!!!!!!
//        options.setAcceptInsecureCerts(true);     // este pentru certificatul de pe pagina
        options.addArguments("start-maximized");    // maximizarea paginii
        return new ChromeDriver(options);
    }

    public static ChromeDriver getChromeImplicitWait(int duration) {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
        return driver;  // returneaza obiectul de "driver"
    }

    public static ChromeDriver getChromeWithWait(int duration){
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
        return driver;
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
