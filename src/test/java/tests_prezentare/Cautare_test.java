package tests_prezentare;

import Object_packages.Login_page_C8;
import Object_packages.ProductPage;
import Object_packages.Product_Edit_Page;
import Object_packages.SideBarPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

import static Object_packages.ProductPage.EMPTY_PRODUCT_LIST_CSS;
import static Object_packages.ProductPage.PRODUCT_LIST_CSS;
import static org.testng.Assert.*;

public class Cautare_test extends Base_Test_C8{

    @BeforeClass
    public void beforeClass(){
        driver.get("https://admin-demo.nopcommerce.com/");
        Login_page_C8 login_page = new Login_page_C8(driver);
        login_page.getLoginForm().submit();
    }

    @Test(description = "Verify serach is success when check by name")
    public void testSearchByProductName(){
        SideBarPage sidebarpage = new SideBarPage(driver);
        sidebarpage.getCatalogLink().click();
        sidebarpage.getProductList().click();

        ProductPage productPage = new ProductPage(driver);
        productPage.getProductName().sendKeys("Windows 8 Pro");
        productPage.getSearchButton().click();

// facem un WAIT EXPLICIT pentru a verifica
        FluentWait<ChromeDriver> wait =  new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(PRODUCT_LIST_CSS),1));

        assertEquals(productPage.getProductList().size(),1, "Cautarea nu a returnat produsul asteptat");
//        assertEquals(productPage.getProductTitles().size(),1, "Cautarea nu a returnat titlul asteptat");
        assertEquals(productPage.getProductTitles().size(), productPage.getProductList().size(),
                "Lista de produse are alta marime fata de ce aveam initial");
        assertEquals(productPage.getProductTitles().get(0).getText(), "Windows 8 Pro",
                "Lista de produse cautate nu este corecta");
    }
    @Test(description = " Se face verificarea ca dupa rulare numele nu mai este in lista")
    public void test_Edit_Prod_Name() {
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
        ProductPage productPage = new ProductPage(driver);
        getWait(driver).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(PRODUCT_LIST_CSS), 0));
//        assertFalse(productPage.getProductList().size() ==0);
//        productPage.getProductList().get(0).findElement(By.cssSelector("a.btn.btn-default"));
//        productPage.getEditButtonFromProduct(productPage.getProductList().get(0)).click();
        assertNotEquals(productPage.getProductList().size(), 0, "Produs inexistent!");
        WebElement firstProduct = productPage.getProductList().get(0);
        String firstProductTitle = productPage.getTitleFromProduct(firstProduct).getText();
        productPage.getEditButtonFromProduct(firstProduct).click();

//  edit product name - ca asa spune la curs
        Product_Edit_Page productEditPage = new Product_Edit_Page(driver);
        productEditPage.getProductName().clear();
        productEditPage.getProductName().sendKeys(RandomStringUtils.randomAlphanumeric(21));
        productEditPage.getSaveButton().click();

//      research the old product
        productPage.getProductName().sendKeys(firstProductTitle);
        productPage.getSearchButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(PRODUCT_LIST_CSS)));
        assertEquals(productPage.getProductList().size(), 1,
                "Lista de produse dupa ediatre si verificare nu este egala cu 1");
        assertTrue(isElementPresent(By.cssSelector(EMPTY_PRODUCT_LIST_CSS)), "Lista de produse nu este goala cand cautam un nou produs");
    }
}


