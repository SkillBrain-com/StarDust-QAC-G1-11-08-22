package Selenium_Grid.HUB_NODE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Selenium_PACKAGE {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://selenium.dev");
            driver.quit();
        }
}

