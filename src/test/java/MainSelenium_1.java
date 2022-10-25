import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium_1 {


    public static <CodecSet> void main(String[] args) throws InterruptedException {
//  Setam locatia driver-ului
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe" );
//  cream un OBIECT de tip ChromeDriver
        ChromeDriver driver = new ChromeDriver();
//  maximizam pagina cat tot ecranul
        driver.manage().window().maximize();
//  folosim pagina de demo a TOOLS QA
        driver.get("https://demoqa.com");
//  Inseram untemporizator in milisecunde - acum avem 2,5 secunde
        Thread.sleep(2000);

        WebElement footerElement = driver.findElement(By.tagName("footer")); //
        String footerMsg = footerElement.getText();
        System.out.println(footerMsg);
        Thread.sleep(2000);
        WebElement formsPage= driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][2]"));
        formsPage.click();
        Thread.sleep(2000);
//  Trecem la urmatoarea pagina
        driver.findElement(By.xpath("//div[@class='header-wrapper'][1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("item-3")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Cristian");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Emil");
//  cu linia de comanda de mai sus se impiedica dupa "lastName:
//  cu linia de comanda de mai jos se impiedica inainte de "lastName"
//        driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Emil");
        driver.findElement(By.id("userEmail")).sendKeys("CristianEmil@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Age")).sendKeys("50");
        driver.findElement(By.id("Salary")).sendKeys("21.000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("input[@id='department']")).sendKeys("Engineering");
        driver.findElement(By.id("Submit")).click();
        Thread.sleep(10000);

        driver.close();
        driver.quit();

    }

}
