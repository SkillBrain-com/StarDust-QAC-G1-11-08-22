package SeleniumPlatforma2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;



public class MainSelenium {

    @DataProvider(name = "myFirstDataProvider")
    public static Object[][] myFirstDataProvider() {
        return new Object[][] {
                {"elements", 1},
                {"forms", 2},
                {"alertsWindows", 3},
//                {"widgets", 4},
//                {"interaction", 5},
//                {"books", }
        };
    }

      @Test
      public void assertTest() {
          ChromeDriver driver = getChromeDriverByManager();
          driver.get("https://demoqa.com/");
          List<WebElement> cards = driver.findElements(By.className("card"));
          assertEquals(cards.size(), 6, "Wrong card size");
          driver.quit();

      }


    @Test
    public void primulTest() {
        ChromeDriver driver = getChromeDriverByManager();
        driver.get("https://demoqa.com/browser-windows");
        driver.quit();
        throw new RuntimeException("Custom exception");
    }



    private static void  windowHandlers() {
        ChromeDriver driver = null;
        try {
            driver = getChromeDriverByManager();
            driver.get("https://demoqa.com/browser-windows");

            WebElement tabButton = driver.findElement(By.id("yabButton"));
            tabButton.click();

            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();

            for (String window: windowHandles) {
                if(!window.equals(parentWindow));
                    driver.switchTo().window(window);
                    break;
            }

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();

            driver.switchTo().window(parentWindow);
            driver.findElement(By.id("windowButton")).click();
            Set<String> windowHandles2 = driver.getWindowHandles();
            for (String window: windowHandles2) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();

            System.out.println("Finish!");
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    private static void radioButton() {
        ChromeDriver driver = getChromeDriverByManager();
        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        WebElement yesRadioButtonLabel = driver.findElement(By.cssSelector("label[for=\"yesRadio\"]"));


        System.out.println("YesRadioButton before click: isEnable: " + yesRadioButton.isEnabled() + " , isSelected: " + yesRadioButton.isSelected());
        System.out.println("NoRadioButton before click: isEnable: " + noRadioButton.isEnabled() + " , isSelected: " + noRadioButton.isSelected());

        driver.executeScript("arguments[0].click()", yesRadioButton);
        driver.executeScript("arguments[0].click()", noRadioButton);

        //yesRadioButtonLabel.click();
        System.out.println("YesRadioButton after click: isEnable: " + yesRadioButton.isEnabled() + " , isSelected: " + yesRadioButton.isSelected());
        System.out.println("noRadioButton after click: isEnable: " + noRadioButton.isEnabled() + " , isSelected: " + noRadioButton.isSelected());

//        System.out.println("YesRadioButton before click: isEnable: " + yesRadioButtonLabel.isEnabled() + " , isSelected: " + yesRadioButtonLabel.isSelected());
//        yesRadioButtonLabel.click();
//        System.out.println("YesRadioButton after click: isEnable: " + yesRadioButtonLabel.isEnabled() + " , isSelected: " + yesRadioButtonLabel.isSelected());
        driver.close();
    }

    private static void alerts() throws InterruptedException {
        ChromeDriver driver = getChromeDriverByExecutable();
        driver.get("https://demoqa.com/alerts");

        WebElement firstButton = driver.findElement(By.id("alertButton"));
        WebElement thirdButton = driver.findElement(By.cssSelector("#confirmButton"));
        WebElement fourthButton = driver.findElement(By.cssSelector("#promtButton"));

        //simple alert - accept ok and Cancel
        firstButton.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        //alert with OK and Cancel
        thirdButton.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        thirdButton.click();
        alert2.dismiss();

        //alert with text input
        fourthButton.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Text 2");
        alert3.accept();
        fourthButton.click();
        alert3.sendKeys("Text123456678");
        alert3.dismiss();

        driver.close();
    }

//    @Test
//    public static void doubleClick() {
//        ChromeDriver driver = getChromeDriverByManager();
//        driver.get("https://demoqa.com/buttons");
//        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick(doubleClick).build().perform();
//
//        WebElement message = driver.findElement(By.id("doubleClickMessage"));
//        assertEquals(message.getText(), "You have done a double click", "Double click was unsuccessful");
//        driver.quit();
//    }
//
//    @Test
//    public static void rightClick() {
//        ChromeDriver driver = getChromeDriverByManager();
//        SoftAssert softAssert = new SoftAssert();
//
//        driver.get("https://demoqa.com/buttons");
//        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
//        softAssert.assertFalse(rightClickButton.isDisplayed(), "Right button is not displayed!");
//
//        Actions actions = new Actions(driver);
//        actions.contextClick(rightClickButton).build().perform();
//
//        WebElement message = driver.findElement(By.id("rightClickMessage"));
//        softAssert.assertEquals(message.getText(), "You have done a right click", "Right click was unsuccessful");
//        driver.quit();
//        softAssert.assertAll();
//
//    }

    private static void simpleClick() {
        ChromeDriver driver = getChromeDriverByManager();
        driver.get("https://demoqa.com/buttons");
        driver.findElements(By.cssSelector(".btn.btn-primary")).get(2).click();
        driver.quit();
    }

    private static void actionsClass () throws IOException {
        ChromeDriver driver= null;
            try {
                driver = getChromeDriverByManager();
                driver.get("https://demoqa.com");
                List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
                WebElement sixthCard = cards.get(5);
                Actions actions = new Actions(driver);
                actions.moveToElement(sixthCard).build().perform();
                sixthCard.click();
                throw new NoSuchElementException("Exceptie custom");
            } catch (Exception e) {
                System.out.println("Am intrat in ramura catch");
                if (driver != null) {
                    File file = driver.getScreenshotAs(OutputType.FILE);
                    File destFile = new File("C:\\Users\\sauci\\Desktop\\myria\\intelliJ\\poze\\poza.png");
                    FileUtils.copyFile(file, destFile);
                }
            } finally {
                if (driver != null) {
                    driver.quit();
                }
            }
        System.out.println("Finish!");
    }

    private static ChromeDriver getChromeDriverByExecutable() {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        return new ChromeDriver();
    }

    private static ChromeDriver getChromeDriverByManager() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
