import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//  import java.sql.SQLOutput;
import java.util.List;

public class Tabel_HTML {

    public static void main(String[] args) {
        testWebTable();
        System.out.println("Debug");
    }

    public static void testWebTable() {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
    driver.get("http://testpages.herokuapp.com/styled/tag/dynamic-table.html");


    WebElement tableCaption = driver.findElement(By.cssSelector("table#dynamictable caption"));
    System.out.println(tableCaption.getText());

//  selectam tabelul dupa randuri si coloane
    List<WebElement> tableRows = driver.findElements(By.cssSelector("tabel#dynamictable tr"));

    WebElement firstRow = tableRows.get(0);

    List<WebElement> firstRowColumns = firstRow.findElements(By.cssSelector("th"));
    System.out.println("Header din prima coloana" + firstRowColumns.get(0).getText());
    System.out.println("Header din a doua coloana" + firstRowColumns.get(1).getText());
    System.out.println(" ");

    WebElement secondRow = tableRows.get(1);
    List<WebElement> secondRowColumns = secondRow.findElements(By.cssSelector("td"));
    System.out.println("Textul din randul 2, coloana1 " +secondRowColumns.get(0).getText());
    System.out.println("Textul din randul 2, coloana2 " +secondRowColumns.get(1).getText());
    System.out.println(" ");

    WebElement thirdRow = tableRows.get(2);
    List<WebElement> thirdRowColumns = thirdRow.findElements(By.cssSelector("td"));
    System.out.println("Textul din randul 3, coloana1 " +thirdRowColumns.get(0).getText());
    System.out.println("Textul din randul 3, coloana2 " +thirdRowColumns.get(1).getText());

    driver.quit();
    }

}
