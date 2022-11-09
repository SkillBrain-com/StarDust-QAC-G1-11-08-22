package TEST_NG_TEME;

// aici avem toate programele de BEFORE si AFTER pentru SUITE

import Selenium2.Utilitati;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public abstract class BaseTest_Suite {

    WebDriver driver;

    //   protected WebDriver driver = null;
    @BeforeSuite(alwaysRun = true)
    public void initializeDriver1() {
        driver = Utilitati.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("WebDriver initializad");
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
        System.out.println("Closing WebDriver");
    }

}
