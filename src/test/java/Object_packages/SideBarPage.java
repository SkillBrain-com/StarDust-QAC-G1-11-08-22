package Object_packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBarPage {

// definim un constructor, unul public care accepta un driver - ChromeDriver - ca si paramateru
//  apelam metoda PageFactory care se apeleaza pentru fiecare page object pt initializarea elementelor din interior

    public SideBarPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="nav.mt-2 .nav-item.has-treeview:nth-child(2)")
    private WebElement catalogLink;

    @FindBy(css=".nav-item a[href='/Admin/Product/List']")
    private WebElement productList;

// "li.has-treeview:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"

    public WebElement getCatalogLink() {
        return catalogLink;
    }

    public WebElement getProductList() {
        return productList;
    }
}
