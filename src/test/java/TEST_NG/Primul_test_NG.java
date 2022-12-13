package TEST_NG;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import static Selenium_Grid.WebdriverManager.getChromeDriverByManager;

// @Test - daca punem aici test o sa ruleze toate metodele din interiorul clasei, metode care contin PUBLIC si VOID
public class Primul_test_NG {

    ChromeDriver driver;

    @Test
    public void Test1() throws InterruptedException {
//        ChromeDriver driver= getChromeDriverByManager();  // pentru ca am pus linia de mai sus aceasta se comenteaza
        driver= getChromeDriverByManager();
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        Thread.sleep(3500);
        driver.quit();
    }
    @Test
    public void Test2() throws InterruptedException {
//        ChromeDriver driver= getChromeDriverByManager();
        driver= getChromeDriverByManager();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(3500);
        driver.quit();
    }
}
