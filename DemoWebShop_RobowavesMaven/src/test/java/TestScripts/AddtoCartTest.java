package TestScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import Pomrepository.Ex_Homepage;

@Listeners(genericlibrary.ListnersImplimentation.class)

public class AddtoCartTest extends genericlibrary.BaseTest {

    @Test
    public void verify_User_Is_Able_To_Add_the_Products_to_the_cart() throws InterruptedException {
        // Navigate to digital downloads page
        Pomrepository.Digitaldownloads_Pom digitaldownload = new Pomrepository.Digitaldownloads_Pom(driver);

        home.getDigital().click();
        
        Assert.assertEquals(digitaldownload.getDigtaldownloadtext().isDisplayed(), true);
        Reporter.log("Navigated digtal download page sucessfully", true);

        
        
       //  Products added to cart
        List<WebElement> addtocartall = digitaldownload.getAddtoCartDigitalButton();
        int expectedresult = addtocartall.size();
        for (WebElement addtocartallpdt : addtocartall) {
            addtocartallpdt.click();
            Thread.sleep(2000);
        }

        // Navigate to shopping cart
            Ex_Homepage hom=new Ex_Homepage(driver);
            hom.getShoppingcart().click();
        // Validation of shopping cart page display
            Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart"); 
            Reporter.log("Navigate to shoping cart page succesfuly", true);

        Pomrepository.ShoopingCartpage sh = new Pomrepository.ShoopingCartpage(driver);
        
        // Removing the product
        java.util.List<WebElement> allchk =  sh.getRemoveFromCartCheckbox();
        int actualresult = allchk.size();
        
        // Validation of product 
        Assert.assertEquals(actualresult, expectedresult);
       Reporter.log("verify_User_Is_Able_To_Add_the_Products_to_the_cart", true);

        for (WebElement allcheckbox : allchk) {
            allcheckbox.click();
        }
        
        sh.getUpdateShoppingCartButton().click();
        Assert.assertEquals(sh.getEmptyshoppingcarttext().isDisplayed(),true );
        Reporter.log("prouct is remooved from shopping cart Sucessfully", true);

        
        driver.close();
    }
}
