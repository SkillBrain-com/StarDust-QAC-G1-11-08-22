package Selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Manager {

    public static ChromeDriver getChromedriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static <CodecSet> void main(String[] args) throws InterruptedException {
//  Setam locatia driver-ului
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//  cream un OBIECT de tip ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        driver.quit();
    }


}
