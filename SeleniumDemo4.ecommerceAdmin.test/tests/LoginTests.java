package SeleniumDemo4.ecommerceAdmin.test.tests;

import SeleniumDemo4.ecommerceAdmin.test.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends  BaseTest{

    @Test(description = "Verify login is successful with a correct username and password")
    public void testValidLogin() {
        driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage loginPage = new LoginPage(driver);
//        loginPage.getEmail().sendKeys("admin@yourstore.com");
//        loginPage.getPassword().sendKeys("admin");
        loginPage.getLoginForm().submit();
        Assert.assertTrue(driver.getCurrentUrl().contains("/admin/"),
                "Login was unsuccessful with the default data");
    }
}
