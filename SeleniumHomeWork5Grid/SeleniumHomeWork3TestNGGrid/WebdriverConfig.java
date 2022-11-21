package SeleniumHomeWork5Grid.SeleniumHomeWork3TestNGGrid;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverConfig {
    public static ChromeDriver getChromedriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
