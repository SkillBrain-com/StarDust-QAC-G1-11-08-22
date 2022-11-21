package SeleniumHomeWork5Grid.SeleniumHomeWork3TestNGGrid;

import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static SeleniumHomeWork5Grid.GridSetUp.driver;

public class LogIn extends utilities {

    @Test(description = "Login din meniul din colțul dreapta sus, cu un user valid")
    public void logInUserValid() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();
    }

    @Test(description = "Login din meniul din colțul dreapta sus, cu un user invalid")
    public void logInUserInvalid() {
            driver.findElement(By.id("menu-toggle")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
            driver.findElement(By.id("txt-username")).sendKeys("Ana Maria");
            driver.findElement(By.id("txt-password")).sendKeys("ThisIsAPassword");
            WebElement loginButton = driver.findElement(By.id("btn-login"));
            loginButton.click();
    }

    @Test(description = "Make Appointment button va redirecta userul la pasul de login, " +
            "dacă el nu este logat în momentul in care apasă pe buton")
    public void makeAppointmentButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement makeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentButton.click();
    }


    @DataProvider(name = "myDataProvider")
    public Object[][] myDataProvider() {
        return  new Object[][] {
                {"history.php#history"},
                {"profile.php#profile"},
                {"#appointment"},
        };
    }


    @Test(dataProvider = "myDataProvider", description = "Butonul de Home din meniul din dreapta" +
            " sus duce userul mereu pe pagina de homepage, indiferent de pe ce pagină se apasă")
    public void dataProviderTest(String resource) {
        driver.get("https://katalon-demo-cura.herokuapp.com" + "/" + resource);
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
    }




}
