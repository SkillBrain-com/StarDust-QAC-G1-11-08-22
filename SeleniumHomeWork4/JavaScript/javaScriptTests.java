package SeleniumHomeWork4.JavaScript;

import SeleniumHomeWork4.PageObject.HerokuAppPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class javaScriptTests extends testsConfigJavaScript {

    @Test(description = "Se vor verifica butoanele care redirectează " +
            "către o pagină noua, folosind wait si windowHandles")
    public void redirectingButton() {
        HerokuAppPage herokuAppPage = new HerokuAppPage(driver);
      //  String originalWindow = driver.getWindowHandle();
        herokuAppPage.getFiveSecondsButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Wait<ChromeDriver> wait5Seconds = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofMillis(5000))
//                .ignoring(NoSuchElementException.class);
//        wait5Seconds.until(ExpectedConditions.visibilityOfElementLocated(By.id("javascript_countdown_time")));

        driver.getWindowHandle();
        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window: windowHandles) {
            if(!window.equals(parentWindow));
            driver.switchTo().window(window);
            break;
        }

//        WebElement goBack = driver.findElement(By.xpath("//button[@id='goback']"));
//        goBack.click();


  }
}
