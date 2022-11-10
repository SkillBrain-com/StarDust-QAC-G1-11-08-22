package SelemiunDemo1;

import SelemiunDemo1.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableTests {
    public static void main(String[] args) {
     //   testWebTable();
          ChromeDriver driver = createDriverAndGetPage();
          updateTable(driver);
          getTableDetails(driver);
          driver.quit();
    }


    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        return driver;
    }


    public static void getTableDetails(ChromeDriver driver) {
        WebElement tableCaption = driver.findElement(By.cssSelector("#tablehere table caption"));
        System.out.println("Caption: " + tableCaption.getText());
        WebElement table = driver.findElement(By.cssSelector("#tablehere table"));
        System.out.println("ID attribute: " + table.getAttribute("id"));
        System.out.println("");

        //select table rows and columns
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tr"));
        for (int i = 0; i < tableRows.size(); i++) {
            WebElement currentRow = tableRows.get(i);
            if (i == 0) {
                List<WebElement> firstRowColumns = currentRow.findElements(By.cssSelector("th"));
                System.out.println("Header din prima coloana: " + firstRowColumns.get(0).getText());
                System.out.println("Header din a doua coloana: " + firstRowColumns.get(1).getText());
                System.out.println("");
            } else {
                List<WebElement> currentColums = currentRow.findElements(By.cssSelector("td"));
                System.out.println("Text din randul " + (i+1) + " coloana 1: " + currentColums.get(0).getText());
                System.out.println("Text din randul " + (i+1) + " coloana 2: " + currentColums.get(1).getText());

            }
        }
//        WebElement firstRow = tableRows.get(0);
//        List<WebElement> firstRowColumns = firstRow.findElements(By.cssSelector("th"));
//        System.out.println("Header din prima coloana: " + firstRowColumns.get(0).getText());
//        System.out.println("Header din a doua coloana: " + firstRowColumns.get(1).getText());
//        System.out.println("");
//
//        WebElement secondRow = tableRows.get(1);
//        List<WebElement> secondRowColumns = secondRow.findElements(By.cssSelector("td"));
//        System.out.println("Text din randul 2, coloana 1: " + secondRowColumns.get(0).getText());
//        System.out.println("Textul din randul 2, coloana 2: " + secondRowColumns.get(1).getText());
//        System.out.println("");
//
//        WebElement thirdRow = tableRows.get(2);
//        List<WebElement> thirdRowColumns = thirdRow.findElements(By.cssSelector("td"));
//        System.out.println("Textul din randul 3, coloana 1: " + thirdRowColumns.get(0).getText());
//        System.out.println("Textul din randul 3, coloana 2: " +thirdRowColumns.get(1).getText());

    }


    public static void updateTable(ChromeDriver driver) {
        WebElement summary = driver.findElement(By.cssSelector("details summary"));
        summary.click();

        //update caption
        WebElement caption = driver.findElement(By.id("caption"));
        caption.clear();
        caption.sendKeys("text introdus la lectia Demo");

        //update table id
        WebElement tableId = driver.findElement(By.id("tableid"));
        tableId.clear();
        tableId.sendKeys("customId");

        //update table content
        WebElement jsonData = driver.findElement(By.cssSelector("textarea#jsondata"));
        jsonData.clear();
        jsonData.sendKeys("[{\"name\" : \"Bob\", \"age\" : 20}, {\"name\": \"George\", \"age\" : 42}, {\"name\" : \"Bia\", \"age\" : 19}, {\"name\": \"Mihai\", \"age\" : 32}, {\"name\" : \"Vlad\", \"age\" : 50}, {\"name\": \"Cristina\", \"age\" : 42}]");
        System.out.println(jsonData.getAttribute("value"));

        //press refresh button
        WebElement refreshTableButton = driver.findElement(By.id("refreshtable"));
        refreshTableButton.click();

//        WebElement tableCaption = driver.findElement(By.cssSelector("#tablehere table caption"));
//        System.out.println(tableCaption.getText());
//        System.out.println("");

    }
}
