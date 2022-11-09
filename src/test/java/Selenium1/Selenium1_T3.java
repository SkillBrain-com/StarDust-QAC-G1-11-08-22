package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


    public class Selenium1_T3 {

//  PAGINA 3 din https://testpages.herokuapp.com/styled/ = Find By Playground - Locator Examples


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
            driver.manage().window().maximize();


//  Titlul 3 = title3
            WebElement title3 = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
            System.out.println(title3.getText());
            System.out.println("");

            WebElement explanation3 = driver.findElement(By.xpath("//div[@class='explanation']"));
            System.out.println(explanation3.getText());
            System.out.println("");

            WebElement body = driver.findElement(By.cssSelector("#div1"));
            System.out.println(body.getText());
            System.out.println("");

            WebElement para1 = driver.findElement(By.cssSelector("#p1"));
            System.out.println(para1.getText());
            System.out.println("");

            WebElement para2 = driver.findElement(By.cssSelector("#p2"));
            System.out.println(para2.getText());
            System.out.println("");

            WebElement para3 = driver.findElement(By.cssSelector("#p3"));
            System.out.println(para3.getText());
            System.out.println("");

            WebElement para4 = driver.findElement(By.cssSelector("#p4"));
            System.out.println(para4.getText());
            System.out.println("");

            WebElement para5 = driver.findElement(By.cssSelector("#p5"));
            System.out.println(para5.getText());
            System.out.println("");

            WebElement para6 = driver.findElement(By.cssSelector("#p6"));
            System.out.println(para6.getText());
            System.out.println("");

            WebElement para7 = driver.findElement(By.cssSelector("#p7"));
            System.out.println(para7.getText());
            System.out.println("");

            WebElement para8 = driver.findElement(By.cssSelector("#p8"));
            System.out.println(para8.getText());
            System.out.println("");

            WebElement para9 = driver.findElement(By.cssSelector("#p9"));
            System.out.println(para9.getText());
            System.out.println("");

            WebElement para10 = driver.findElement(By.cssSelector("#p10"));
            System.out.println(para10.getText());
            System.out.println("");

            WebElement para11 = driver.findElement(By.cssSelector("#p11"));
            System.out.println(para11.getText());
            System.out.println("");

            WebElement para12 = driver.findElement(By.cssSelector("#p12"));
            System.out.println(para12.getText());
            System.out.println("");

            WebElement para13 = driver.findElement(By.cssSelector("#p13"));
            System.out.println(para13.getText());
            System.out.println("");

            WebElement para14 = driver.findElement(By.cssSelector("#p14"));
            System.out.println(para14.getText());
            System.out.println("");

            WebElement para15 = driver.findElement(By.cssSelector("#p15"));
            System.out.println(para15.getText());
            System.out.println("");

            WebElement para16 = driver.findElement(By.cssSelector("#p16"));
            System.out.println(para16.getText());
            System.out.println("");

            WebElement para17 = driver.findElement(By.cssSelector("#p17"));
            System.out.println(para17.getText());
            System.out.println("");

            WebElement para18 = driver.findElement(By.cssSelector("#p18"));
            System.out.println(para18.getText());
            System.out.println("");

            WebElement para19 = driver.findElement(By.cssSelector("#p19"));
            System.out.println(para19.getText());
            System.out.println("");

            WebElement para20 = driver.findElement(By.cssSelector("#p20"));
            System.out.println(para20.getText());
            System.out.println("");

            WebElement para21 = driver.findElement(By.cssSelector("#p21"));
            System.out.println(para21.getText());
            System.out.println("");

            WebElement para22 = driver.findElement(By.cssSelector("#p22"));
            System.out.println(para22.getText());
            System.out.println("");

            WebElement para23 = driver.findElement(By.cssSelector("#p23"));
            System.out.println(para23.getText());
            System.out.println("");

            WebElement para24 = driver.findElement(By.cssSelector("#p24"));
            System.out.println(para24.getText());
            System.out.println("");

            WebElement para25 = driver.findElement(By.cssSelector("#p25"));
            System.out.println(para25.getText());
            System.out.println("");

//  Celelalte paragrafe - rest of paragraphs
            WebElement para1A = driver.findElement(By.cssSelector("#p26"));
            System.out.println(para1A.getText());
            System.out.println("");

            WebElement otherParagraphs = driver.findElement(By.cssSelector("#div3"));
            System.out.println(otherParagraphs.getText());
            System.out.println("");

            //link-urile
            WebElement links = driver.findElement(By.cssSelector("#div18"));
            System.out.println(links.getText());
            System.out.println("");

            WebElement eachLinks = driver.findElement(By.xpath("//li[@id='li1']"));
            System.out.println(eachLinks.getText());
            System.out.println("");

            WebElement eachLinks2 = driver.findElement(By.xpath("//li[@id='li2']"));
            System.out.println(eachLinks2.getText());
            System.out.println("");

            WebElement eachLinks3 = driver.findElement(By.xpath("//li[@id='li3']"));
            System.out.println(eachLinks3.getText());
            System.out.println("");

            WebElement eachLinks4 = driver.findElement(By.xpath("//li[@id='li4']"));
            System.out.println(eachLinks4.getText());
            System.out.println("");

            WebElement eachLinks6 = driver.findElement(By.xpath("//li[@id='li6']"));
            System.out.println(eachLinks6.getText());
            System.out.println("");

            WebElement eachLinks7 = driver.findElement(By.xpath("//li[@id='li7']"));
            System.out.println(eachLinks7.getText());
            System.out.println("");

            WebElement eachLinks8 = driver.findElement(By.xpath("//li[@id='li8']"));
            System.out.println(eachLinks8.getText());
            System.out.println("");

            WebElement eachLinks9 = driver.findElement(By.xpath("//li[@id='li9']"));
            System.out.println(eachLinks9.getText());
            System.out.println("");

            WebElement eachLinks10 = driver.findElement(By.xpath("//li[@id='li10']"));
            System.out.println(eachLinks10.getText());
            System.out.println("");

            WebElement eachLinks11 = driver.findElement(By.xpath("//li[@id='li11']"));
            System.out.println(eachLinks11.getText());
            System.out.println("");

            WebElement eachLinks12 = driver.findElement(By.xpath("//li[@id='li12']"));
            System.out.println(eachLinks12.getText());
            System.out.println("");

            WebElement eachLinks13 = driver.findElement(By.xpath("//li[@id='li13']"));
            System.out.println(eachLinks13.getText());
            System.out.println("");

            WebElement eachLinks14 = driver.findElement(By.xpath("//li[@id='li14']"));
            System.out.println(eachLinks14.getText());
            System.out.println("");

            WebElement eachLinks15 = driver.findElement(By.xpath("//li[@id='li15']"));
            System.out.println(eachLinks15.getText());
            System.out.println("");

            WebElement eachLinks16 = driver.findElement(By.xpath("//li[@id='li16']"));
            System.out.println(eachLinks16.getText());
            System.out.println("");

            WebElement eachLinks17 = driver.findElement(By.xpath("//li[@id='li17']"));
            System.out.println(eachLinks17.getText());
            System.out.println("");

            WebElement eachLinks18 = driver.findElement(By.xpath("//li[@id='li18']"));
            System.out.println(eachLinks18.getText());
            System.out.println("");

            WebElement eachLinks19 = driver.findElement(By.xpath("//li[@id='li19']"));
            System.out.println(eachLinks19.getText());
            System.out.println("");

            WebElement eachLinks20 = driver.findElement(By.xpath("//li[@id='li20']"));
            System.out.println(eachLinks20.getText());
            System.out.println("");

            WebElement eachLinks21 = driver.findElement(By.xpath("//li[@id='li21']"));
            System.out.println(eachLinks21.getText());
            System.out.println("");

            WebElement eachLinks22 = driver.findElement(By.xpath("//li[@id='li22']"));
            System.out.println(eachLinks22.getText());
            System.out.println("");

            WebElement eachLinks23 = driver.findElement(By.xpath("//li[@id='li23']"));
            System.out.println(eachLinks23.getText());
            System.out.println("");

            WebElement eachLinks24 = driver.findElement(By.xpath("//li[@id='li24']"));
            System.out.println(eachLinks24.getText());
            System.out.println("");

            WebElement eachLinks25 = driver.findElement(By.xpath("//li[@id='li25']"));
            System.out.println(eachLinks25.getText());
            System.out.println("");

            //last paragraph
            WebElement lastParagraph = driver.findElement(By.xpath("//pre[@id='pre1']"));
            System.out.println(lastParagraph.getText());
            System.out.println("");

            //click Links
            driver.findElement(By.xpath("//a[@id='a26']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a27']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a28']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a29']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a30']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a31']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a32']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a33']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a34']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a35']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a36']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a37']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a38']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a39']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a40']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a41']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a42']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a43']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a44']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a45']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a46']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a47']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a48']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a49']")).click();
            sleep(1000);
            driver.findElement(By.xpath("//a[@id='a50']")).click();
            sleep(1000);

            Thread.sleep(10000);
            driver.close();
            driver.quit();

        }
}




