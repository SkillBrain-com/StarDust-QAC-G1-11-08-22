package INTERSHIP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

import static Selenium_Grid.WebdriverManager.getChromeDriverByManager;

public class Intership_Hotmail {

// pagina FABRICATA ca model de LOGIN automat pe un site cu iesire prin inchiderea paginii de browser fare DELOGARE/DECONECTARE
// ACCEPTA LOGARI SUCCESIVE FARA PROBLEME DE DELOGARE!

    ChromeDriver driver;

    @Test
    public void Test_Logare() throws InterruptedException {
        driver= getChromeDriverByManager();
        driver.get("https://outlook.live.com/owa/");
        driver.manage().window().maximize();
        Thread.sleep(1500);


        WebElement SignIn_AccessButton = driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
        SignIn_AccessButton.click();
        Thread.sleep(1500);

//SE FACE FOCUS PE NOUA PAGINA CA SA NU PIERDEM ETAPELE DE LOGARE

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles){
            if ( !window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
// Pentru a verifica ca suntem pe pagina respectiva, facem CLICK pe un element inactiv , pt siguranta - nu este obligatoriu dar e mai SANATOS!

        WebElement SignIn_Page1 = driver.findElement(By.cssSelector("#lightbox"));
        SignIn_Page1.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("cristianzidarescu@hotmail.com");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
        Thread.sleep(1000);

        WebElement SignIn_Page2 = driver.findElement(By.cssSelector("#lightbox"));
        SignIn_Page2.click();
        driver.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("CRISTIANEMIL1968");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();
        Thread.sleep(2000);

        System.out.println("OK");

        Thread.sleep(7500);
        driver.quit();

    }

}
