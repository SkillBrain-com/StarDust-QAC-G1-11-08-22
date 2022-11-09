package TEST_NG_TEME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Team_Sawg_Test_DataProvider extends BaseTest_Suite_Group {


        @Test(description = "Verify user and password for SAWG site", dataProvider = "loginUser", groups = {"fara_logare"})
        public void SwagLabsTest2(String username, String password, boolean shouldLogin, boolean shouldWait) throws InterruptedException {
            pasi_logare(username, password);

            if(shouldLogin){
                assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Utilizatorul nu e pe pagina corecta");
                List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item"));
                assertFalse(inventoryItems.isEmpty(), "Nici un element nu este prezent dupa logare");
                for (WebElement item: inventoryItems){
                    assertTrue(item.isDisplayed(), "Produsele nu sunt afisate" );
            }
            } else {
                assertFalse(driver.getCurrentUrl().contains("inventory.html"), "Utilizatorul e pe pagina corecta cu user incorect");

                if(shouldWait) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                assertTrue(isElementPresent(By.cssSelector("h3[data-test='error']")),
                        "Mesajul de eroare apare pentru un utilizator incorect");
            }
        }

    @DataProvider(name = "loginUser")
        public Object[][]loginUsers() {

        return new Object[][]{
            {"standard_user", "secret_sauce", true, false},
            {"locke_out_user", "secret_sauce", false, false},
            {"problem_user", "secret_sauce", true, false},
            {"performance_glitch_user", "secret_sauce", true, true},

        };
    }
}