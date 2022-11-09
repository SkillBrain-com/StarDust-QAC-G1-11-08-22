package TEST_NG;

import Selenium2.Utilitati;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Teste_DIVERSE {

    public static void main(String[] args) {
//        clasa_Assert();
//        clasa_SoftAssert();
//        FaceCevaInainte();
//        FaceCevaDupaMetoda();


    }
    public static void clasa_Assert(){
        String a = "text";
        String b = "TEXT";
        Assert.assertEquals(a, b, "Eroare la compararea a cu b - ");
    }

    public static void clasa_SoftAssert(){
        String a = "text";
        String b = "TEXT";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a,b);
        boolean isTrue = true;
        softAssert.assertTrue(isTrue);
        System.out.println("Testul este picat daca nu se valideaza cu \"TRUE\"");
    }

    @BeforeMethod
    public static void FaceCevaInainte() {
        System.out.println("Se face inainte de aplicarea metodei!");
        String a = "text";
        String b = "TEXT";
        Assert.assertEquals(a, b, "Nu se poate compara \"a\" cu \"b\" - ");
    }
    @AfterMethod
    public static void FaceCevaDupaMetoda() {
        System.out.println("Se face dupa aplicarea metodei!");
    }

}
