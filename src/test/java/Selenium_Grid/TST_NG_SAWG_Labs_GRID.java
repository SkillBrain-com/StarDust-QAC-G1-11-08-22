package Selenium_Grid;

import Selenium2.Utilitati;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import static org.testng.Assert.*;

public class TST_NG_SAWG_Labs_GRID {

    RemoteWebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void initializeDriver() throws MalformedURLException {
        driver = WebdriverManager.getRemoteWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("WebDriver initializad");
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    System.out.println("Closing WebDriver");
    }


    @Test(description = "Verify that adding element to card works as expected")
    public void SwagLabsTest1() throws InterruptedException {

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
    Thread.sleep(2000);

        WebElement shoppingCart = driver.findElement(By.cssSelector("a.shopping_cart_link"));
        List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item"));
        WebElement primulProdus = inventoryItems.get(0);
        String primulProdusTitlu = primulProdus.findElement(By.cssSelector(".inventory_item_name")).getText();
        String primulProdusPret = primulProdus.findElement(By.cssSelector(".inventory_item_price")).getText();
        WebElement primulProdusButon = primulProdus.findElement(By.cssSelector(".btn_inventory"));
    Thread.sleep(2000);

    assertEquals(primulProdusButon.getText().toLowerCase(), "add to cart", "Add to cart button is incorrect before adding");
    assertFalse(isElementPresent(By.cssSelector("span.shopping_cart_badge")), "Shopping cart bagde is present before adding");

    primulProdusButon.click();
    Thread.sleep(2000);

    assertEquals(primulProdus.findElement(By.cssSelector(".btn_inventory")).getText().toLowerCase(), "remove",
            "Add to cart button is incorect before adding an item to cart");
    assertTrue(isElementPresent(By.cssSelector("span.shopping_cart_badge")), "Shopping cart bagde is not present before");
    assertEquals(driver.findElement(By.cssSelector("span.shopping_cart_badge")).getText(), "1",
            "Number of elements in shopping cart badge incorrect");
    Thread.sleep(2000);

    shoppingCart.click();
    assertTrue(driver.getCurrentUrl().contains("cart.html"), " User is not on cart after navigation");

    List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
    assertEquals(cartItems.size(), 1, "Number of items is incorrect");
    String cartItemName = cartItems.get(0).findElement(By.cssSelector(".inventory_item_name")).getText();
    assertEquals(cartItemName, primulProdusTitlu, "Wrong item added to cart");

    String cartItemPrice = cartItems.get(0).findElement(By.className("inventory_item_price")).getText();
    assertEquals(cartItemPrice, primulProdusPret, "Wrong item added to cart");

    assertTrue(isElementPresent(cartItems.get(0), By.className("cart_buton")), "Remove button on cart is not present");
    assertTrue(isElementPresent(By.id("continue-shopping")), "Continue shopping is not present");
    assertTrue(isElementPresent(By.id("checkout")), "Checkout button is not present");
}

private boolean isElementPresent(By locator) {
    try {
        driver.findElement(locator);
        return true;
    } catch (NoSuchElementException e) {
        return false;
    }
}

private boolean isElementPresent(WebElement element, By locator) {
    try {
        element.findElement(locator);
        return true;
    } catch (NoSuchElementException e) {
        return false;
    }
}
}
