package SeleniumCurs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium {

    public static void main(String[] args) throws InterruptedException {
        // setam locatia driverului
        System.setProperty("webdriver.chrome.driver" , "src/drivers/chromedriver.exe");
        //creez un obiect de tip Chrome driver
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        WebElement footerElement = driver.findElement(By.tagName("footer"));
        String footerMsg = footerElement.getText();
        System.out.println(footerMsg);
        Thread.sleep(2000);
        WebElement formsPage = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][2]"));
        formsPage.click();
        Thread.sleep(2000);
        //suntem pe urmatoarea pagina
        driver.findElement(By.xpath("//div[@class='header-wraper'][1]")).click();
        driver.findElement(By.id("item-3")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Adelina");
        driver.findElement(By.xpath("input[placeholder='Last Name']")).sendKeys("Dorina");
        driver.findElement(By.id("userEmail")).sendKeys("adelina_burlacu17@yahoo.com");
        driver.findElement(By.id("age")).sendKeys("32");
        driver.findElement(By.id("salary")).sendKeys("100000");
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("QA Automated");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);


        driver.close();


        Thread.sleep(5000);





   driver.quit();
    }
}


