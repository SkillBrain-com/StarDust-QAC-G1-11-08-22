package SelemiunDemo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    public static ChromeDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver" , "src/test/resouces/chromedriver.exe");
        return new ChromeDriver();
    }
}
