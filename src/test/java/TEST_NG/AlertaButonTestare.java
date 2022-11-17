package TEST_NG;

import Selenium2.Utilitati;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class AlertaButonTestare {

    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void initializeDriver() {
        driver = Utilitati.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("WebDriver initialized");
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
        System.out.println("Closing WebDriver");
    }
}
