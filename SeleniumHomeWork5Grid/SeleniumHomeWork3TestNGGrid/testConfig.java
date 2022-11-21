package SeleniumHomeWork5Grid.SeleniumHomeWork3TestNGGrid;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class testConfig extends LogIn {


    protected ChromeDriver driver = null;

    @BeforeMethod
        public void beforeMethod() {
            driver = WebdriverConfig.getChromedriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");

    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }


}
