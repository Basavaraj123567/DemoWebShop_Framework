package TestScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericlibrary.ListnersImplimentation.class)


public class AddtoWishlistTest extends genericlibrary.BaseTest {

    @Test(groups = "integration")
    public void Verify_User_is_Able_To_Add_Product_to_Wishlist() throws InterruptedException {
        // Navigate to Books page
        home.getBooks().click();
        Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books"); 
        Reporter.log("Navigate to bookpage succesfuly", true);

        
        
        // Validate navigation to Books page
        Pomrepository.Books_EX bd = new Pomrepository.Books_EX(driver);
        String expectedBookName = bd.getBooksNamesLink().getText();
        bd.getBooksNamesLink().click();
        Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX"); 
        Reporter.log("Navigate to Fictionpage succesfuly", true);

        // Validate navigation to Fiction book detail page
        Pomrepository.FictionEx f = new Pomrepository.FictionEx(driver);
        f.getAddtowishlist().click();
        
        // Navigate to Wishlist
        home.getWishlist().click();
        
        driver.navigate().refresh();
        
        // Validate that the book was added to the wishlist
        Pomrepository.Wishlist w = new Pomrepository.Wishlist(driver);
        String actualWishlistText = w.getFictionExWishListText().getText();
        
        
        Assert.assertEquals(actualWishlistText, expectedBookName);
        Reporter.log("Book is added wishlist Sucessfully", true);


        
        // Remove all books from wishlist
        List<WebElement> allRemove = w.getRemoveBooksFromcart();
        for (WebElement checkbox : allRemove) {
            checkbox.click();
        
        
        // Update the wishlist to reflect the removal
        w.getUpdateWishlistButton().click();
        Assert.assertEquals(w.getWishlistempty().isDisplayed(),true );
        Reporter.log("Book is remooved from wishlist Sucessfully", true);
        }
        
    }
}
