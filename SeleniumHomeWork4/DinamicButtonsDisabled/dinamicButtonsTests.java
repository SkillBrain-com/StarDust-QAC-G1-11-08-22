package SeleniumHomeWork4.DinamicButtonsDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class dinamicButtonsTests extends testsConfigDinamicButtonsDisabled {



    @Test(description = "Se va crea un test care va face click pe toate butoanele, " +
            "și la sfârșit va verifica mesajul afișat. Mesajul apare doar dacă toate " +
            "butoanele au fost apăsate.")
    public void dinamicButtons() {

        //Click Buttons In Order

        //Start
        WebElement startButton = driver.findElement(By.id("button00"));
        startButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement oneButton = driver.findElement(By.id("button01"));
        oneButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement twoButton = driver.findElement(By.id("button02"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement threeButton = driver.findElement(By.id("button03"));
        threeButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement message = driver.findElement(By.xpath("//p[@id='buttonmessage']"));
        message.getText();
    }
}
