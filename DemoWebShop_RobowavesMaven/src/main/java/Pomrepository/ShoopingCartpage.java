package Pomrepository;

	

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ShoopingCartpage 
	{
		@FindBy(xpath="//a[@class='product-name']")
		 private List<WebElement> addtoCartDigitalText;
		
		@FindBy(xpath="//input[@name='removefromcart']")
		 private List<WebElement> removeFromCartCheckbox;
		  
		@FindBy(xpath="//input[@value='Update shopping cart']")
		 private WebElement updateShoppingCartButton;
		
		@FindBy(css =  "[class='qty-input']")
		 private WebElement price;
		
		@FindBy(xpath="//h1[text()='Shopping cart']")
		 private WebElement emptyshoppingcarttext;
		
		@FindBy(xpath="//input[@name='removefromcart']")
		 private WebElement removeFromCartCheckboxsingle;

		

		@FindBy(css = "[class='product-subtotal']")
		 private WebElement totalamount;
		
		@FindBy(xpath="//div[contains(text(),'Your Shopping Cart is empty!')]")
		 private WebElement shoopingcartempty;



		
	






		public ShoopingCartpage(WebDriver driver)
	    {
	 	   PageFactory.initElements(driver, this);
	    }





		public List<WebElement> getAddtoCartDigitalText() {
			return addtoCartDigitalText;
		}





		public List<WebElement> getRemoveFromCartCheckbox() {
			return removeFromCartCheckbox;
		}





		public WebElement getUpdateShoppingCartButton() {
			return updateShoppingCartButton;
		}





		public WebElement getPrice() {
			return price;
		}

		
		public WebElement getEmptyshoppingcarttext() {
			return emptyshoppingcarttext;
		}
		public WebElement getRemoveFromCartCheckboxsingle() {
			return removeFromCartCheckboxsingle;
		}


		public WebElement getTotalamount() {
			return totalamount;
		}

		public WebElement getWishlishempty() {
			return shoopingcartempty;
		}

		  
	}




