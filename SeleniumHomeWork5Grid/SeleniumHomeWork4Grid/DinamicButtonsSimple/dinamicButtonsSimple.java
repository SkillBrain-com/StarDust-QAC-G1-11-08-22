package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.DinamicButtonsSimple;

import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class dinamicButtonsSimple extends utilities {

    static RemoteWebDriver driver;
    @BeforeSuite
    public static void  getChromeDriver() throws MalformedURLException {
        driver = SeleniumCurs5Grid.Utilitati.getRemoteDriver();
    }


    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }

}
