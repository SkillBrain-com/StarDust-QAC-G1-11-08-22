package Selenium2;

import org.openqa.selenium.WebDriver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Selenium_Basic2 {

    public static void checkedException()  {
        try {
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader fileInput = new BufferedReader(fileReader);
            System.out.println(fileInput.readLine());
        } catch ( IOException e ) {
            System.out.println("Ceva nu a mers bine");
            System.out.println(e.getMessage());
        }
    }

// APARE LA RULAREA CODULUI ( Runtime)
    public static void uncheckedException(){
        String cuvant = null;   // este un obiect care nu are valoare, nu exista in memorie = null;
        System.out.println(cuvant.toUpperCase());

    }



}
