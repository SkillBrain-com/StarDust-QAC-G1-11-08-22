package SeleniumCurs2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorDemo {
//    public static void main(String[] args) throws InterruptedException {
//       // checkedException();
//        uncheckedException();


//        WebDriver driver = getChromeDriver();
//    try {
//        driver.get("https://demoqa.com/alert");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        WebElement fereastraAlerte = driver.findElement(By.xpath("(//div[contains(@class,'header-wrapper')])[3]\n"));
//        actions.moveToElement(fereastraAlerte).build().perform();
//        Thread.sleep(1000);
//        driver.findElement(By.id("alertButton")).click();
//
//
//        driver.findElement(By.id("promtButtom")).click();
//        Thread.sleep(3000);
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        Thread.sleep(3000);
//        WebElement confirmRezult = driver.findElement(By.id("confirmRezult"));
//        System.out.printf(confirmRezult.getText());
//        System.out.println("Test complete!");
//    }catch (ElementClickInterceptedException e) {
//        System.out.println("Ceva amers prost, nu am reusit sa fac testul");
//        e.printStackTrace();
//    } finally {
//        System.out.println("Eu voi fi executat indiferent de rezultat");
//        driver.quit();
//    }
//


//checked exceptions , apare la compilare
public static void  checkedException() {
    try {
        FileReader fileReader = new FileReader("file.txt");
        BufferedReader fileInput = new BufferedReader(fileReader);
        System.out.println(fileInput.readLine());
    } catch (IOException e) {
        //throw new RuntimeException(e);
        System.out.println("Something went wrong!");
        System.out.println(e.getMessage());
    }
}
//uncheckedException, apara la RunTime
        public static void uncheckedException() {
        String cuvant = null;
            System.out.println(cuvant.toUpperCase());
        }
    }
