import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Selenium2_Erori_Demo_Curs {

    public static void main(String[] args) {

        WebDriver driver = Utilitati.getChromeDriver();
//        checkedException();
        uncheckedException();

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


}
