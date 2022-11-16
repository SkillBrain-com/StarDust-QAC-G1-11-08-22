package TEST_NG;
import Selenium2.Browser_Manager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Set;

@Test
public class TESTNG_primul_test {

    public static void main(String[] args) throws InterruptedException {
        Selenium2_WindowHandles();
    }

    @Test
//  Pentru a rula un test punem comanda @TEST in fata liniilor de comanda pentru un fisier
//  incercam o testare folosind liniile din fisierul Selenium2_Navigare_Tab_Focus

    public static void Selenium2_WindowHandles() throws InterruptedException {

             ChromeDriver driver = null;
            try {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();

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
