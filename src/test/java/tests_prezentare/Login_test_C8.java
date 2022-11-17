package tests_prezentare;

import Object_packages.Login_page_C8;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Login_test_C8 extends Base_Test_C8{

    @Test (description = "Verify login with correct user name and password ")
    public void testValidLogion(){
        driver.get("https://admin-demo.nopcommerce.com/");
        Login_page_C8 login_page = new Login_page_C8(driver);
//        login_page.getEmail().sendKeys("admin@yourstore.com");
//        login_page.getPasword().sendKeys("admin");
        login_page.getLoginForm().submit();
        assertTrue(driver.getCurrentUrl().contains("/admin/"),
                "Logarea nu a avut succes cu valorile \"default\" ");


    }


}
