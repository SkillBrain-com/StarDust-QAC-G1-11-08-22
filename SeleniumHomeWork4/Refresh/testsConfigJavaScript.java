package SeleniumHomeWork4.Refresh;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testsConfigJavaScript {

    protected ChromeDriver driver = null;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebdriverConfig.getChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/refresh");

    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
}
