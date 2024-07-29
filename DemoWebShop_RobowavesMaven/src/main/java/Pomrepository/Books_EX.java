package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_EX {

	
	     @FindBy(id="products-orderby")
		 private WebElement sortByDropdown;
	     
	     @FindBy(id="products-pagesize")
		 private WebElement displayDropdown;
	     
	     @FindBy(linkText =   "Fiction EX")
		 private WebElement BooksNamesLink;
	     
	     @FindBy(id="add-to-wishlist-button-78")
		 private WebElement addtowishlist;

	     
	     
	     public WebElement getAddtowishlist() {
			return addtowishlist;
		}

		public Books_EX(WebDriver driver)
	     {
	  	   PageFactory.initElements(driver, this);
	     }

		public WebElement getSortByDropdown() {
			return sortByDropdown;
		}

		public WebElement getDisplayDropdown() {
			return displayDropdown;
		}

		public WebElement getBooksNamesLink() {
			return BooksNamesLink;
		}

		
	     
	}



