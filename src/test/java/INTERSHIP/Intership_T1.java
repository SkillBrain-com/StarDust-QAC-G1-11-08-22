package INTERSHIP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Set;
import static Selenium_Grid.WebdriverManager.getChromeDriverByManager;


public class Intership_T1 {

    ChromeDriver driver;

    @Test
    public void Test_Logare() throws InterruptedException {
        driver= getChromeDriverByManager();
//        driver.get("https://cysiam-client-docker.azurewebsites.net/auth/sign-in");
        driver.get("https://cysiam-client-docker.azurewebsites.net/");

        driver.manage().window().maximize();
        Thread.sleep(2500);

        WebElement SignIn_AccessButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[3]/button"));
        SignIn_AccessButton.click();
        Thread.sleep(2500);

//SE FACE FOCUS PE NOUA PAGINA CA SA NU PIERDEM ETAPELE DE LOGARE

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(2500);

        for (String window: windowHandles){
            if ( !window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
// Pentru a verifica ca suntem pe pagina respectiva, facem CLICK pe un element inactiv , pt siguranta - nu este obligatoriu dar e mai SANATOS!

        WebElement SignIn_Page = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/img"));
        SignIn_Page.click();
        Thread.sleep(2500);

        driver.findElement(By.id("email")).sendKeys("adminbrain5@test.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Parola12#");
        Thread.sleep(2000);
        driver.findElement(By.id("next")).click();
        Thread.sleep(2000);

        System.out.println("OK");
        Thread.sleep(6500);

        WebElement LogoButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/div"));
        LogoButton.click();
        WebElement SignOutButton = driver.findElement(By.cssSelector(".css-fd3x2n > button:nth-child(1)"));
        SignOutButton.click();
        Thread.sleep(1000);
        driver.quit();
    }



//      Alte elmente ajutatoare:

//  definim si accesam butoanele de la USER si PASSWORD - ca gimastica mentala

//        WebElement Email_Address = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/form/div[3]/div[1]"));
//        Email_Address.click();
//        Login_CYSIAM.getEmail().sendKeys("adminbrain5@test.com");
//        Thread.sleep(1000);
//
//        WebElement Password_Field = driver.findElement(By.cssSelector("#password"));
//        Password_Field.click();
//        Login_CYSIAM.getPassword().sendKeys("Parola12#");
//        Thread.sleep(1000);
//
//        WebElement Sign_In_Site = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/form/div[3]/div[4]/button"));
//        Sign_In_Site.click();
//        Thread.sleep(1500);


// definim butonul de LOGO pt SIGN OUT

//        .css-1akk63l > div:nth-child(1)
//        .css-fd3x2n > button:nth-child(1)
//        WebElement LogoButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/div/img"));   // este LOGO
//        ;       // este casuta deLOGO
//        WebElement LogoButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]"))
//        WebElement LogoButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div/div[2]/div/div/div/div/img"));
//        WebElement LogoButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div/div[2]/div/div/p/span"));
//        WebElement LogoButton = driver.findElement(By.xpath("//*[@id="__next"]/div[1]/header/div/div[2]/div/div"));               //  tot box-ul cu Admin, LOGO si sagea
//        WebElement LogoButton = driver.findElement(By.cssSelector(".css-1akk63l > div:nth-child(1)"));
//        WebElement LogoButton = driver.findElement(By.cssSelector(".css-be98sb"));                                                // este sageata mica de dupa LOGO
//        driver.findElement(By.xpath("//div[@class='MuiBox-root css-1akk63l']//div@class='MuiBox-root css-daz67v']")).click();
//        driver.findElement(By.cssSelector(".css-1akk63l")).click();                                                               // este class="MuiBox-root css-1akk63l" - tot box-ul cu Admin, LOGO si sageata
//        driver.findElement(By.cssSelector(".css-194w71p")).click();                                                               // este box-ul cu rama cu tot
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]")).click();                                       // este box-ul cu rama cu tot


// definim butonul de SIGN OUT

//        WebElement SignOutButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/button"));
//        ;
//        WebElement SignOutButton = driver.findElement(By.xpath("//button[normalize-space()='sign out']"));
//        WebElement SignOutButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]"))
}
