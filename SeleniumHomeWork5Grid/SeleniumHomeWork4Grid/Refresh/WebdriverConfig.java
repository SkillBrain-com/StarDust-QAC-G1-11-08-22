package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.Refresh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverConfig {

    public static ChromeDriver getChromeDriverWithOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
}
