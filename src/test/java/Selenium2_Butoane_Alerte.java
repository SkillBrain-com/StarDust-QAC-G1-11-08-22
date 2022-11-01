import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium2_Butoane_Alerte {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2500);

        WebElement firstButton = driver.findElement(By.id("alertButtom"));
        WebElement thirdButton = driver.findElement(By.cssSelector("#confirmButton"));
        WebElement forthButton = driver.findElement(By.cssSelector("#promtButton"));

//            firstButton.click();
//            thirdButton.click();
//            forthButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Text2");
        alert.accept();
        forthButton.click();
        alert.dismiss();

//        driver.close();
        driver.quit();
    }

//  Definim butonul DOUBLE_CLICK
    public static void doubleClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement doubleClick = driver.findElement(By.id("doubleClick"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).build().perform();
        driver.close();
        driver.quit();
    }

//  Definim butonul RIGHT_CLICK ( se numeste CONTEXTCLICK )
    public static void rightClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).build().perform();
        driver.close();
        driver.quit();
    }
    public static void simpleClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElements(By.cssSelector(".btn.btn-primary")).get(2).click();

        System.out.println("Am facut click pe butonul nostru1");
        driver.close();
        driver.quit();
    }
}
