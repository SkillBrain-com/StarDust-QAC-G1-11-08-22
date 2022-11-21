package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.Ajax;

import SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.PageObject.HerokuAppPage;
import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class basicAjaxTests extends utilities {

    static RemoteWebDriver driver;
    @BeforeSuite
    public static void  getChromeDriver() throws MalformedURLException {
        driver = SeleniumCurs5Grid.Utilitati.getRemoteDriver();
    }


    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }


    @Test(description = "se vor crea teste care folosesc wait-uri să aștepte " +
            "până se încarcă elemente în drop-down. După ce se vor selecta opțiunile," +
            " se va verifica că ele sunt corecte pe pagina următoare, după ce se apasă " +
            "butonul de Code it in.")
    public void dropDownLists() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HerokuAppPage herokuAppPage = new HerokuAppPage((ChromeDriver) driver);
        //select Category Web
        Select categoryWeb1 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryWeb1.selectByValue("1");

        //select Language -1
        Select language1 = new Select(driver.findElement(By.id("combo2")));
        language1.selectByValue("1");

        //butonul Code In It
        WebElement codeButton1 = driver.findElement(By.name("submitbutton"));
        codeButton1.click();

        // verificare pagina urmatoare
        Assert.assertEquals(herokuAppPage.getId().getText(), "1",
                "Nu corespunde!");

        Assert.assertEquals(herokuAppPage.getLanguage_id().getText(), "1",
                "Nu corespunde!");

        Assert.assertEquals(herokuAppPage.getSubmitbutton().getText(), "Code In It",
                "Nu corespunde!");

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Web
        Select categoryWeb2 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryWeb2.selectByValue("1");

        //select Language - 2
        Select language2 = new Select(driver.findElement(By.id("combo2")));
        language2.selectByValue("2");

        //butonul Code In It
        WebElement codeButton2 = driver.findElement(By.name("submitbutton"));
        codeButton2.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Web - 3
        Select categoryWeb3 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryWeb3.selectByValue("1");

        //select Language - 3
        Select language3 = new Select(driver.findElement(By.id("combo2")));
        language3.selectByValue("3");

        //butonul Code In It
        WebElement codeButton3 = driver.findElement(By.name("submitbutton"));
        codeButton3.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Desktop - 1
        Select categoryDesktop1 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryDesktop1.selectByValue("2");

        //select Language -1
        Select language4 = new Select(driver.findElement(By.id("combo2")));
        language4.selectByValue("10");

        //butonul Code In It
        WebElement codeButton4 = driver.findElement(By.name("submitbutton"));
        codeButton4.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Desktop - 2
        Select categoryDesktop2 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryDesktop2.selectByValue("2");

        //select Language -2
        Select language5 = new Select(driver.findElement(By.id("combo2")));
        language5.selectByValue("11");

        //butonul Code In It
        WebElement codeButton5 = driver.findElement(By.name("submitbutton"));
        codeButton5.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Desktop -3
        Select categoryDesktop3 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryDesktop3.selectByValue("2");

        //select Language -3
        Select language6 = new Select(driver.findElement(By.id("combo2")));
        language6.selectByValue("12");

        //butonul Code In It
        WebElement codeButton6 = driver.findElement(By.name("submitbutton"));
        codeButton6.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Desktop -4
        Select categoryDesktop4 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryDesktop4.selectByValue("2");

        //select Language -4
        Select language7 = new Select(driver.findElement(By.id("combo2")));
        language7.selectByValue("13");

        //butonul Code In It
        WebElement codeButton7 = driver.findElement(By.name("submitbutton"));
        codeButton7.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Server -1
        Select categoryServer1 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryServer1.selectByValue("3");

        //select Language -1
        Select language8 = new Select(driver.findElement(By.id("combo2")));
        language8.selectByValue("20");

        //butonul Code In It
        WebElement codeButton8 = driver.findElement(By.name("submitbutton"));
        codeButton8.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Server -2
        Select categoryServer2 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryServer2.selectByValue("3");

        //select Language -2
        Select language9 = new Select(driver.findElement(By.id("combo2")));
        language9.selectByValue("21");

        //butonul Code In It
        WebElement codeButton9 = driver.findElement(By.name("submitbutton"));
        codeButton9.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Server -3
        Select categoryServer3 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryServer3.selectByValue("3");

        //select Language -3
        Select language10 = new Select(driver.findElement(By.id("combo2")));
        language10.selectByValue("22");

        //butonul Code In It
        WebElement codeButton10 = driver.findElement(By.name("submitbutton"));
        codeButton10.click();

        //Go back
        herokuAppPage.getGoBackButton().click();

        //select Category Server -4
        Select categoryServer4 = new Select(driver.findElement(By.cssSelector("#combo1")));
        categoryServer4.selectByValue("3");

        //select Language -4
        Select language11 = new Select(driver.findElement(By.id("combo2")));
        language11.selectByValue("23");

        //butonul Code In It
        WebElement codeButton11 = driver.findElement(By.name("submitbutton"));
        codeButton11.click();

        //Go back
        herokuAppPage.getGoBackButton().click();
    }
}
