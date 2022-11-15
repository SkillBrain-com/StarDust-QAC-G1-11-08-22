package SeleniumHomeWork4.Ajax;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class testsConfigAjax {


    protected ChromeDriver driver = null;

    @BeforeMethod
        public void beforeMethod() {
            driver = WebdriverConfig.getChromeDriverWithOptions();
            driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }


}
