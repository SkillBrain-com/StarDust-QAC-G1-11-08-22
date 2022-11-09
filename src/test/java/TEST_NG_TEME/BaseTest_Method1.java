package TEST_NG_TEME;

import Selenium2.Utilitati;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_Method1 {

    WebDriver driver;

    @BeforeMethod
    public void initializeDriver() throws InterruptedException {
        driver = Utilitati.getChromeDriver();
        System.out.println("WebDriver este initilizat");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
        System.out.println("WebDriver se inchide");
    }

}
