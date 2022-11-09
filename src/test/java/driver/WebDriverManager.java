package driver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    public static ChromeDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe");
        return new ChromeDriver();
    }


}
