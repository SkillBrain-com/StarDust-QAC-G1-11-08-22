package Object_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {
// definim un constructor ProductPage unde apelam metoda de PageFactory

    public static final String PRODUCT_LIST_CSS = "#products-grid tbody tr";
    public static final String EMPTY_PRODUCT_LIST_CSS ="#products-grid tbody tr .dataTables_empty";

    public ProductPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "SearchProductName")
    private WebElement productName;

    @FindBy(id="search-products")              // facem click pe butonul de cautare "search"
    private WebElement searchButton;

    @FindBy(css=PRODUCT_LIST_CSS)                // sau folosim "products-grid_wrapper"
    private List<WebElement> productList;

    @FindBy(css="#products-grdi tbody tr td:nth-child(3)")
    private List<WebElement> productTitles;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getProductList() {
        return productList;
    }

    public List<WebElement> getProductTitles() {
        return productTitles;
    }

    public WebElement getEditButtonFromProduct(WebElement product){
        return product.findElement(By.cssSelector("a.btn.btn-default"));
    }

    public WebElement getTitleFromProduct(WebElement product){
        return product.findElement(By.cssSelector("td:nth-child(3)"));
    }

}
