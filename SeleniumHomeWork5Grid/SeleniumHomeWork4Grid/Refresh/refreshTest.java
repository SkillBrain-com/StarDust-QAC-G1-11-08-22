package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.Refresh;

import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static SeleniumHomeWork5Grid.GridSetUp.driver;

public class refreshTest extends utilities {

    @Test
    public void refreshTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        for (int i = 0; i <5; i++) {
            String date = driver.findElement(By.id("refreshdate")).getText();
            System.out.println("Date = " + date);
            Thread.sleep(4000);
            driver.navigate().refresh();
            Assert.assertNotEquals(date, driver.findElement(By.id("refreshdate")).getText());
        }
    }

}
