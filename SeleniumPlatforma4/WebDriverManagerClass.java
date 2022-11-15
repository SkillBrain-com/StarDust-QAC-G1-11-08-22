package SeleniumPlatforma4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManagerClass {
    public static ChromeDriver getChromeDriverByExecutable() {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        return new ChromeDriver();
    }

    public static ChromeDriver getChromeDriverByManager() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static ChromeDriver getChromeDriverWithOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();

        //strocheaza in format: cheie -> valoare
        /*
         *cheie: String -> valoare: String
         * "andrei" -> "student"
         * "roxana" -> "contabil"
         *
         * map.get("andrei")
         */

//        Map<String, String> map = new HashMap<>();
//        map.put("deviceName", "iPhone X");
        //chromeOptions.setExperimentalOption("mobileEmulation", map);
          chromeOptions.addArguments("start-maximized");
          chromeOptions.setAcceptInsecureCerts(true);
//        chromeOptions.addArguments("user-data-dir=C:\\Users\\sauci\\AppData\\Local\\Google\\Chrome\\User Data\\");
//        chromeOptions.addArguments("profile-directory=Profile 7");

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
}
