package TEST_NG_TEME;

import Selenium2.Utilitati;
import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_Method {

// aici avem toate conexiunile de BEFORE si AFTER pt METHOD

    public abstract class BaseTest extends WebDriverConfig {

    protected WebDriver driver = null;
//        WebDriver driver;

        @BeforeMethod(onlyForGroups ={"cu_logare"} )
        public void beforeMethodCuLogare(){
            driver = WebDriverConfig.getChromedriver();
            driver.get("https://www.saucedemo.com/");


//            driver = Utilitati.getChromeDriver();
//            driver.findElement(By.id("user-name")).sendKeys("standard_user");
//            driver.findElement(By.id("password")).sendKeys("secret_sauce");
//            driver.findElement(By.id("login-button")).click();
        }

        @BeforeMethod(onlyForGroups ={"fara_logare"} )
        public void beforeMethodFaraLogare() {
            driver = WebDriverConfig.getChromedriver();
            driver.get("https://www.saucedemo.com/");
        }
        @AfterMethod(alwaysRun = true)
        public void afterMethod () {
            if (driver != null) {
            driver.quit();
            }
        }
    }
}
