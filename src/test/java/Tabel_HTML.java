import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//  import java.sql.SQLOutput;
import java.util.List;

public class Tabel_HTML {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = createDriverAndGetPage();
        testDynamicWebTable(driver);
        testWebTable(driver);

        System.out.println("Verificam tabelul ca sa vedem daca ruleaza corect!");

    Thread.sleep(10000);
    driver.quit();
    }

    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("http://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        return driver;
    }

    public static void testWebTable(ChromeDriver driver) throws InterruptedException {
        getTableDetails(driver);

//     public static void testWebTable() {
//        ChromeDriver driver = WebDriverManager.createChromeDriver();
//        driver.get("http://testpages.herokuapp.com/styled/tag/dynamic-table.html");
    }

    private static void testDynamicWebTable(ChromeDriver driver) throws InterruptedException {
          updateTable(driver);
    }

    public static void getTableDetails(ChromeDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        WebElement tableCaption = driver.findElement(By.cssSelector("#tablehere table caption"));
        System.out.println(tableCaption.getText());

//  selectam tabelul dupa randuri si coloane
        List<WebElement> tableRows = driver.findElements(By.cssSelector("tr"));
        for (int i = 0; i < tableRows.size(); i++) {
            WebElement currentRow = tableRows.get(i);
            if (i == 0) {
                List<WebElement> firstRowColumns = currentRow.findElements(By.cssSelector("th"));
                System.out.println("Header din prima coloana - " + firstRowColumns.get(0).getText());
                System.out.println("Header din a doua coloana - " + firstRowColumns.get(1).getText());
                System.out.println(" ");
            } else {
                List<WebElement> currentColumns = currentRow.findElements(By.cssSelector("td"));
                System.out.println("Text din randul = " + (i + 1) + ", coloana 1: " + currentColumns.get(0).getText());
                System.out.println("Text din randul = " + (i + 1) + ", coloana 2: " + currentColumns.get(1).getText());
//                System.out.println(" ");
            }
        }
//        WebElement firstRow = tableRows.get(0);
//        La acest WebElement moare programul ******************************************
//        List<WebElement> firstRowColumns = firstRow.findElements(By.cssSelector("th"));
//        System.out.println("Header din prima coloana" + firstRowColumns.get(0).getText());
//        System.out.println("Header din a doua coloana" + firstRowColumns.get(1).getText());
//        System.out.println(" ");
//
//        WebElement secondRow = tableRows.get(1);
//        List<WebElement> secondRowColumns = secondRow.findElements(By.cssSelector("td"));
//        System.out.println("Textul din randul 2, coloana1 " +secondRowColumns.get(0).getText());
//        System.out.println("Textul din randul 2, coloana2 " +secondRowColumns.get(1).getText());
//        System.out.println(" ");
//
//        WebElement thirdRow = tableRows.get(2);
//        List<WebElement> thirdRowColumns = thirdRow.findElements(By.cssSelector("td"));
//        System.out.println("Textul din randul 3, coloana1 " +thirdRowColumns.get(0).getText());
//        System.out.println("Textul din randul 3, coloana2 " +thirdRowColumns.get(1).getText());
    }

    public static void updateTable(ChromeDriver driver) throws InterruptedException {
        WebElement summary = driver.findElement(By.cssSelector("details summary"));
        summary.click();

        WebElement caption = driver.findElement(By.id("caption"));
        caption.clear();
        caption.sendKeys("text introdus acum");

// up-date caption ID
        WebElement tableId = driver.findElement(By.id("tableid"));
        tableId.clear();
        tableId.sendKeys("customId");

        WebElement jsonData= driver.findElement(By.cssSelector("textarea#jsondata"));
        jsonData.clear();
        jsonData.sendKeys("[{\"name\": \"Bob\", \"age\": 20}, {\"name\": \"George\", \"age\": 42}, {\"name\": \"Ioana\", \"age\": 32}, {\"name\": \"Ileana\", \"age\": 28}, \n" +
                " {\"name\": \"Ion\", \"age\": 43}, {\"name\": \"Georgiana\", \"age\": 40}]");
        System.out.println(jsonData.getAttribute("value"));

// se apasa butonul de refresh
        WebElement refreshTableButton = driver.findElement(By.id("refreshtable"));
        refreshTableButton.click();
        Thread.sleep(2000);


//        WebElement tableCaption = driver.findElement(By.cssSelector("#tablehere table caption"));
//        System.out.println(tableCaption.getText());
//        System.out.println(" ");
//
//        WebElement table = driver.findElement(By.cssSelector("#tablehere table"));
//        System.out.println(tableCaption.getAttribute("id"));





    }

}
