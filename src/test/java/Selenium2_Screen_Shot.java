import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;

public class Selenium2_Screen_Shot {

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
