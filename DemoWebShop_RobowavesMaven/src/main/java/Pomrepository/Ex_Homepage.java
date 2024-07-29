package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex_Homepage {
	
	 @FindBy(xpath="//a[text()='Register']")
	private	WebElement Register;


	 @FindBy(linkText = "Log in")
	private	WebElement loginlink;

	
	 @FindBy(linkText ="abcdem@gmail.com")
	private	WebElement abcdemgmailcom;
	 
	 @FindBy(linkText =  "Log out")
	 private	WebElement logout;
	 
	 @FindBy(name =  "q")
	 private	WebElement searchtextfeild;
	 @FindBy(css =  "input[value='Search']")
	 private	WebElement searchbutton;


	 
	 
	 
	 public WebElement getSearchtextfeild() {
		return searchtextfeild;
	}




	public WebElement getSearchbutton() {
		return searchbutton;
	}

	@FindBy(xpath   ="//span[text() ='Shopping cart']")
	 private	WebElement Shoppingcart;
	 
	 @FindBy(xpath   ="//span[text()='Wishlist']")
	 private	WebElement wishlist;

	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Books')]")		
	 private	WebElement  Books;
	
	 @FindBy(linkText ="Computers")
	 private	WebElement  Computers;

	 @FindBy(linkText ="Electronics")
	 private	WebElement  Electronics;

	 @FindBy(linkText ="Apparel & Shoes")
	 private	WebElement    Shoes;
	 
	 
	 @FindBy(linkText ="Digital downloads")
	 private	WebElement    Digital;
	 
	 @FindBy(linkText ="Jewelry")
	 private	WebElement    Jewelry;
	 
	 @FindBy(linkText ="Gift Cards")
	 private	WebElement    GifTCards;
	 
	 
		@FindBy(css   ="[class='product-name']")
		 private WebElement  searchjeansnameresults;

	 
	 public Ex_Homepage(WebDriver driver) 
	 {
		  
		  PageFactory.initElements(driver, this);
	 }
	 
	 
	 





	public WebElement getRegister() {
		return Register;
	}

	

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getAbcdemgmailcom() {
		return abcdemgmailcom;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getShoppingcart() {
		return Shoppingcart;
	}
	 public WebElement getWishlist() {
		return wishlist;
	}


	public WebElement getBooks() {
		return Books;
	}




	public WebElement getComputers() {
		return Computers;
	}

	public WebElement getElectronics() {
		return Electronics;
	}

	public WebElement getShoes() {
		return Shoes;
	}

	public WebElement getDigital() {
		return Digital;
	}

	public WebElement getJewelry() {
		return Jewelry;
	}

	public WebElement getGifTCards() {
		return GifTCards;
	}
	
	public WebElement getSrerchjeansnameresults() {
		return searchjeansnameresults;
	}


}
