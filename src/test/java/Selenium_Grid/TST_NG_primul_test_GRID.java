package Selenium_Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Set;

@Test
public class TST_NG_primul_test_GRID {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        Selenium2_WindowHandles();
    }

    RemoteWebDriver driver;

    @BeforeSuite
    public void getChromeDriver() throws MalformedURLException {
        driver = WebdriverManager.getRemoteWebDriver();
    }

    @AfterSuite
    public void loseChrome(){
        driver.quit();
    }

    @Test
    public static void Selenium2_WindowHandles() throws InterruptedException, MalformedURLException {

             RemoteWebDriver driver = null;
            try {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = WebdriverManager.getRemoteWebDriver();

                driver.get("https://demoqa.com/browser-windows");
                driver.manage().window().maximize();
                Thread.sleep(2500);

                WebElement tabButton = driver.findElement(By.id("tabButton"));
                tabButton.click();

                String parentWindow = driver.getWindowHandle();
                Set<String> windowHandles = driver.getWindowHandles();
                Thread.sleep(2500);

                for (String window : windowHandles) {
                    if (!window.equals(parentWindow)) {
                        driver.switchTo().window(window);
                        break;
                    }
                }

                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
                driver.close();

                driver.switchTo().window(parentWindow);
                driver.findElement(By.id("windowButton")).click();
                Set<String> windowHandles2 = driver.getWindowHandles();
                Thread.sleep(2500);
                for (String window : windowHandles2) {
                    if (!window.equals(parentWindow)) {
                        driver.switchTo().window(window);
                        break;
                    }
                }
                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
                Thread.sleep(1500);
                driver.close();

                System.out.println("Finish - am inchis fereastra");

            } finally {
                if (driver != null) {
                    driver.quit();
                }
            }
        }
   }
