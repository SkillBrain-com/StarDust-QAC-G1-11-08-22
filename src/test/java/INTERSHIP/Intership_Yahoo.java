package INTERSHIP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

import static Selenium_Grid.WebdriverManager.getChromeDriverByManager;

public class Intership_Yahoo {

// pagina FABRICATA ca model de LOGIN automat pe un site cu iesire prin inchiderea paginii de browser fare DELOGARE/DECONECTARE
// ACCEPTA LOGARI SUCCESIVE!

    ChromeDriver driver;

    @Test
    public void Test_Logare() throws InterruptedException {
        driver = getChromeDriverByManager();
        driver.get("https://ro.yahoo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

// Buton1 de ACCEPT pt conditiile de pe prima pagina
        WebElement Accept_Button1 = driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/form/div[2]/div[2]/a"));
        Accept_Button1.click();
        Thread.sleep(1000);

// Buton2 de ACCEPT pt conditiile de pe a doua pagina
        WebElement Accept_Button2 = driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/form/div[3]/div/div/button[1]"));
        Accept_Button2.click();
        Thread.sleep(1000);

// Accesam casuta de MAIL/Conectare ca sa intram in pagina
        WebElement Conectare = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div/div[2]/div/div[3]/div[1]/div/a"));
        Conectare.click();
        Thread.sleep(1500);

//SE FACE FOCUS PE NOUA PAGINA CA SA NU PIERDEM ETAPELE DE LOGARE

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window : windowHandles) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
// Pentru a verifica ca suntem pe pagina respectiva, facem CLICK pe un element inactiv , pt siguranta - nu este obligatoriu dar e mai SANATOS!

        WebElement SignIn_Page1 = driver.findElement(By.xpath("//*[@id=\"login-body\"]/div[2]/div[1]/div[2]"));
        SignIn_Page1.click();
        driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("cristian_zidarescu@yahoo.com");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("Cristian_Emil_1968");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
        Thread.sleep(2000);

        WebElement Mail = driver.findElement(By.xpath("//*[@id=\"ybar-navigation-item-mail\"]/a"));
        Mail.click();

        System.out.println("OK");
        Thread.sleep(10000);
        driver.quit();
    }
}
