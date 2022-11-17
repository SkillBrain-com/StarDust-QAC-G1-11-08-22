package Selenium2;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Selen2_Erori_Demo_Curs_ScreenShoot_C7 {

    public static void main(String[] args) {

        WebDriver driver = Utilitati.getChromeDriver();
//        checkedException();
//       uncheckedException();

        driver.quit();
    }

    //  folosim o metoda de check exceptions , apare la compilare
    public static void checkedException()  {
        try {
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader fileInput = new BufferedReader(fileReader);
            System.out.println(fileInput.readLine());
        } catch ( IOException e ) {
//           sau pune ( Exception e ) pentru toate erorile posibile
//           throw new RuntimeException(e);
            System.out.println("Ceva nu a mers bine");
            System.out.println(e.getMessage());
//        } catch (IOException e){
//            e.printStackTrace();
        }
    }

    public static void uncheckedException(){
        String cuvant = null;   // este un obiect care nu are valoare, nu exista in memorie = null;
        System.out.println(cuvant.toUpperCase());

    }

    public static void takeScrennshot (String testcaseName, WebDriver driver) {
        String destination = null;
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            destination = System.getProperty("user.dir") + "/Logs/" + testcaseName + " .png";
            FileUtils.copyFile(source, new File(destination));
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken");
        }
    }

}
