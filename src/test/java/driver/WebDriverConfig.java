package driver;
// import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {


    public static WebDriver getChromedriver(){
// setam efectiv ChromeDriver, adica driverul de Chrome
        WebDriverManager.chromedriver().setup();
//  returnam o noua instanta de ChromeDriver
        return new ChromeDriver();


//    public static ChromeDriver getChromedriver(){
//// setam efectiv ChromeDriver, adica diriverul de Chrome
//        WebDriverManager.chromedriver().setup();
////  returnam o noua instanta de ChromeDriver
//        return new ChromeDriver();

    }
}
