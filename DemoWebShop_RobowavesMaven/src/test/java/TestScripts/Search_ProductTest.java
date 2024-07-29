package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Search_ProductTest extends genericlibrary.BaseTest {
	
    @Test(groups = "integration")
    public void Verify_User_is_Able_To_Search_Product() throws InterruptedException, EncryptedDocumentException, IOException  {
        // Navigate to Books page
        Pomrepository.Ex_Homepage hom =new  Pomrepository.Ex_Homepage(driver);

         
        hom.getSearchtextfeild().click();
        hom.getSearchtextfeild().sendKeys(data.getDatafromExel("Search", 0, 0));

        
        hom.getSearchbutton().click();
        Pomrepository.Search_Pom  sh =new Pomrepository.Search_Pom(driver);
        String jeansname1 =sh.getJeansname().getText();
        Assert.assertEquals(jeansname1, "Blue Jeans"); 
          Reporter.log("Blue jeans product visible", true);

        
        
        sh.getAddtocart().click();
   
     Pomrepository.ShoopingCartpage M=new Pomrepository.ShoopingCartpage(driver);
     Thread.sleep(3000);

     hom.getShoppingcart().click();
     

     
     M.getPrice().click();
     M.getPrice().clear();
     M.getPrice().sendKeys("5",Keys.ENTER);
     
     
     Thread.sleep(3000);

     String totalamount1 =M.getTotalamount().getText();
     Assert.assertEquals(totalamount1, "5.00");
     Reporter.log("total amount verifed", true);

     
     M.getRemoveFromCartCheckboxsingle().click();
     M.getUpdateShoppingCartButton().click();
     
     
          String cartempty =M.getEmptyshoppingcarttext().getText();
      Assert.assertEquals(cartempty, "Shopping cart"); 
      Reporter.log("Prouct removed", true);
   
        


	}

}
