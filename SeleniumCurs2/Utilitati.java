package SeleniumCurs2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Utilitati {

    public static ChromeDriver getChromeDriver () {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        return new ChromeDriver();
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
