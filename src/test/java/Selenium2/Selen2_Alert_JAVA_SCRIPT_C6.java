package Selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selen2_Alert_JAVA_SCRIPT_C6 {
//  suntem in pagina "https://testpages.herokuapp.com/styled/alerts/alert-test.html"

    public static void main(String[] args) throws InterruptedException {
        firstAlertTest();
        secondAlertTest();
    }
    public static void firstAlertTest() throws InterruptedException {
/* scoatem initializarea driverului de Chrome in afara blocului de try:
deci spargem blocul de mai jos in partea de NULL si partea de accesare din ciclul "try - finally"
            ChromeDriver driver = Browser_Manager.getChromeDriver();
*/
        ChromeDriver driver = null;
        try {
            driver = Browser_Manager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            driver.manage().window().maximize();
            Thread.sleep(1500);
            System.out.println(" ");
            System.out.println("Incepe prima actiune - primul clic_to_box  \n");

            WebElement firstButton = driver.findElement(By.id("alertexamples"));
            firstButton.click();
            Alert firstAlert = driver.switchTo().alert();
            System.out.println(firstAlert.getText());
            firstAlert.accept();
            Thread.sleep(2500);
            System.out.println("Este alerta deschisa dupa ce se inchide ? - " + isAlertOpened(driver));

//            driver.switchTo().alert();
        } finally {
            if (driver != null) {
                driver.close();
            }
            System.out.println("Aici se inchide prima actiune - CLOSE \n");
        }
    }
//-------------------------------------------------------------------------------------------------------------------
    public static void secondAlertTest() throws InterruptedException {
        ChromeDriver driver = null;
        try {
            driver = Browser_Manager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

            driver.manage().window().maximize();
            Thread.sleep(1500);
            System.out.println(" ");
            System.out.println("Incepe a doua actiune - al doilea clic_to_box  \n");

            WebElement secondButton = driver.findElement(By.id("confirmexample"));
            for (int i = 0; i <= 1; i++) {
                System.out.println("Iteratia = " + i);
                secondButton.click();
                System.out.println( "Este alerta deschisa dupa apasarea butonului? - " + isAlertOpened(driver));
                Alert alert = driver.switchTo().alert();
                Thread.sleep(1500);
                if( i == 0 ){
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                Thread.sleep(2500);
                System.out.println(driver.findElement (By.id("confirmexplanation")).getText());
                System.out.println("Este alerta deschisa dupa inchidere ? - " + isAlertOpened(driver));
                System.out.println(" ---------- este o noua iteratie ----------");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
// aici verificam daca alerta este deschisa sau nu!
    public static boolean isAlertOpened(ChromeDriver driver){
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
