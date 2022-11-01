import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium2_Radio_Button {

    public static void main(String[] args)  {

    System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
    ChromeDriver driver = new ChromeDriver();

        try {
//  Cautam un RADION BUTTON - acesta merge doar cu o optiune din cate sunt disponibil
            driver.get("https://demoqa.com/radio-button");
            driver.manage().window().maximize();
            Thread.sleep(1500);

            WebElement yesButton = driver.findElement(By.xpath("//Label[normalize-space()='Yes']"));
            yesButton.click();
            Thread.sleep(2500);
//            boolean isEnabled = yesButton.isEnabled(); - // este o varianta
            boolean isSelected = driver.findElement(By.id("yesRadio")).isSelected();
            boolean isEnabled  = driver.findElement(By.id("noRadio")).isEnabled();

            System.out.println("Este butonul \"NO\" enabled? - " + isEnabled);

            if (isSelected) {
// daca dorim sa negam raspunsul o sa punem semnul ! inainte de is Selected ori isEnable
//  astfel o sa apara eroare ca intra pe ramura de catch si nu gaseste ce trebuie.

            System.out.println(isSelected);
            System.out.println("Test complete");

            } else {
            throw new NoSuchElementException( "Nu a fost selectat butonul!");
            }

    } catch(ElementClickInterceptedException | NoSuchElementException | InterruptedException e ){
        if(driver != null);
        {
            System.out.println("Ceva a mers prost si nu am reusit sa facem testul \n");
            e.printStackTrace();    // linia tipareste stiva de erori in consola ca sa vedem ce probleme avem
        }
    } finally {
        if(driver != null);
        {
            System.out.println("Eu voi fi executat indiferent de rezultat \n");
            driver.quit();
        }
    }
  }
}
