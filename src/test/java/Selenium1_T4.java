import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Selenium1_T4 {

//  PAGINA 4 din https://testpages.herokuapp.com/styled/ = HTML TABLE Tag

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
            driver.manage().window().maximize();

            Thread.sleep(2000);

            WebElement title = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
            System.out.println(title.getText());

            WebElement explanation = driver.findElement(By.cssSelector(".explanation"));
            System.out.println(explanation.getText());

            WebElement titleTableCenter = driver.findElement(By.cssSelector("table[id='mytable'] caption"));
            System.out.println(titleTableCenter.getText());
            System.out.println("");

            List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tr"));

            WebElement firstRow = tableRows.get(0);
            List<WebElement> firstRowColumns = firstRow.findElements(By.cssSelector("th"));
            System.out.println("ATENTIE: R- randul ; C- coloana . \n");
            System.out.println("Cap tabel R_1, C_1 : " + firstRowColumns.get(0).getText() + " - Prenumele");
            System.out.println("Cap tabel R_1, C_2 : " + firstRowColumns.get(1).getText() + " - Varsta/ani");
            System.out.println("");

            WebElement secondRow = tableRows.get(1);
            List<WebElement> secondRowColumns = secondRow.findElements(By.cssSelector("td"));
            System.out.println("Nume - R_2, C_1: " + secondRowColumns.get(0).getText());
            System.out.println("Varsta - R_2, C_2: " + secondRowColumns.get(1).getText());
            System.out.println("");

            WebElement thirdRow = tableRows.get(2);
            List<WebElement> thirdRowColumns = thirdRow.findElements(By.cssSelector("td"));
            System.out.println("Nume - R_3, C_1: " + thirdRowColumns.get(0).getText());
            System.out.println("Varsta - R_3, C_2: " + thirdRowColumns.get(1).getText());
            System.out.println("");

            WebElement fourthRow = tableRows.get(3);
            List<WebElement> fourthRowColumns = fourthRow.findElements(By.cssSelector("td"));
            System.out.println("Nume - R_4, C_1: " + fourthRowColumns.get(0).getText());
            System.out.println("Varsta - R_4, C_2: " + fourthRowColumns.get(1).getText());
            System.out.println("");

            WebElement fifthRow = tableRows.get(4);
            List<WebElement> fifthRowColumns = fifthRow.findElements(By.cssSelector("td"));
            System.out.println("Nume - R_5, C_1 : " + fifthRowColumns.get(0).getText());
            System.out.println("Varsta - R_5, C_2: " + fifthRowColumns.get(1).getText());

            Thread.sleep(9000);
//            driver.close();
            driver.quit();

            System.out.println("Programul a rulat cu succes!");
        }
}

