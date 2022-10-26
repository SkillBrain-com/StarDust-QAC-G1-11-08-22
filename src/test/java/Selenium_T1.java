import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//  PAGINA 1 din tema https://testpages.herokuapp.com/styled/ = Basic Web Page Example

public class Selenium_T1 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
            driver.manage().window().maximize();

            System.out.println("Verificam pagina in timp real sa vedem daca programul ruleaza corect! \n");
            Thread.sleep(1500);

//  Titlul
            WebElement title = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
            System.out.println(title.getText());
            Thread.sleep(1500);

//  Explicatiile din pagina
            WebElement explanation = driver.findElement(By.cssSelector(".explanation"));
            System.out.println(explanation.getText());
            Thread.sleep(1500);

//  Primul paragraf
            WebElement primulParagraph = driver.findElement(By.cssSelector("#para1"));
            System.out.println(primulParagraph.getText());
            Thread.sleep(1500);

//  Al doilea paragraf
            WebElement alDoileaParagraf = driver.findElement(By.cssSelector("#para2"));
            System.out.println(alDoileaParagraf.getText());
            Thread.sleep(3000);
            System.out.println("");

            driver.close();
            driver.quit();

//            if ( i == 0)
//            secondParagraph.getText() =0 -----------------------------------
//            System.out.println("Pagina este afisata corect!");
//            } else {
//            return null
//            }

    }
}
