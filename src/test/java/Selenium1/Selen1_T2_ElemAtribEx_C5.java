package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selen1_T2_ElemAtribEx_C5 {

//  PAGINA 2 din https://testpages.herokuapp.com/styled/ = Element Attributes Examples

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        driver.manage().window().maximize();

        System.out.println("Verificam pagina in timp real sa vedem daca programul ruleaza corect! \n");
        Thread.sleep(1500);

//  Linia de titlu
        WebElement title = driver.findElement(By.xpath("//div[@class='page-body'] [h1]"));
        System.out.println(title.getText());
        Thread.sleep(2000);

//  Linia cu explicatii din titluri
        WebElement explanation = driver.findElement(By.cssSelector(".explanation"));
        System.out.println(explanation.getText());
        Thread.sleep(2000);

//  Linia de subtitlu - 1 si 2
        WebElement subtitle1 = driver.findElement(By.cssSelector("body>div:nth-child(1)>h1"));
        System.out.println(subtitle1.getText());
        Thread.sleep(2000);

//  Linia pt paragraful 3
        WebElement paragraph_3 = driver.findElement(By.xpath("//div[@class='page-body'] [h1]"));;
        System.out.println(paragraph_3.getText());
        Thread.sleep(2000);

//  Linia pt paragraful 4
        WebElement paragraph_4 = driver.findElement(By.cssSelector("#jsattributes"));
        System.out.println(paragraph_4.getText());
        Thread.sleep(1500);
        System.out.println("");

//  Linia cu butonul- Add Another Attribute - pe care facem click ca sa vedem ce se intampla.
        driver.findElement(By.cssSelector(".styled-click-button")).click();

        Thread.sleep(5000);
//        driver.close();
        driver.quit();

        System.out.println("Pagina a fost incarcata si descarcat cu succes!");

/*      ATENTIE:
        pentru linia 20 si 37 am folosit XPATH dar se poate utiliza si css.Selector cu formulele de mai jos:
P20-    WebElement title = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
P37-    WebElement paragraph_3 = driver.findElement(By.cssSelector("#domattributes"));
 */

    }
}