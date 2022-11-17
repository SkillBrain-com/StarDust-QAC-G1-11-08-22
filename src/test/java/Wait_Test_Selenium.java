import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Wait_Test_Selenium {

    ChromeDriver driver;

    @BeforeSuite
    public void getChromeDriver() {
//        driver = Utilitati.getChromeDriver();
        driver = Utilitati.getMobileChromeDriver();
    }

    @AfterSuite
    public void closeChrome(){
        driver.quit();
    }

    @Test
    public void mobileChromeTest() {
        driver.get("http://demoqa.com/");
//        driver.findElement(By.id("27")).click();      // scrie linia asta ca sa pice testul
    }

}
