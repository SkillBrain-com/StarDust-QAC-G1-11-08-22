package Selenium2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Selenium2_formulare_pt_testare {

    public static void main(String[] args) {
        Formular_detaliat_testare();
    }

    public static void Formular_detaliat_testare() {
        ChromeDriver driver = null;
        try {
            driver = Browser_Manager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

            driver.manage().window().maximize();
            Thread.sleep(1500);
            System.out.println(" ");

            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement comment = driver.findElement(By.name("comment"));
            WebElement fileUpload = driver.findElement(By.name("filename"));
            WebElement hiddenInput = driver.findElement(By.name("hiddenFiled"));
            List<WebElement> checkboxes = driver.findElements(By.name("checkboxes[]"));
            List<WebElement> radioButtons = driver.findElements(By.name("radioval"));
            Select select= new Select(driver.findElement(By.name("multipleselect[]")));
            Select dropdown = new Select(driver.findElement(By.name("dropdown")));
            WebElement cancelButton = driver.findElement(By.cssSelector("input[type='reset']"));
            WebElement submitlButton = driver.findElement(By.cssSelector("input[type='submit']"));

            username.sendKeys("Cristian");
            password.sendKeys("univers'");
            comment.clear();
            Thread.sleep(1000);
            comment.sendKeys("Un comentariu in plus");
            fileUpload.sendKeys("C:\\Users\\CRISTIAN ZIDARESCU\\IdeaProjects\\ProjSelenium\\Logs\\newTabsTest.png");
            hiddenInput.sendKeys("Aceasta este o intrare ascunsa");
            Thread.sleep(1500);
            checkboxes.get(1).click();
            radioButtons.get(2).click();
            Thread.sleep(1500);
            select.selectByValue("ms1");
            select.selectByValue("ms2");
            dropdown.selectByIndex(2);

            submitlButton.click();
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\CRISTIAN ZIDARESCU\\IdeaProjects\\ProjSelenium\\Logs\\newTabsTest.png");
                try {
                    FileUtils.copyFile(file, destFile);
                } catch (IOException ex) {
                    System.out.println("Screenshot copy failed.");
                }
            } else {
                System.out.println("Driver instance failed to create succesfully.");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }

        }
    }

}
