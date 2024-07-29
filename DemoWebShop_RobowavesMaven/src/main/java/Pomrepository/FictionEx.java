package Pomrepository;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class FictionEx   
	{ 
		@FindBy(xpath ="//h1[contains(text(),'Fiction EX')]")
		private WebElement fictionExText;
		    
	     @FindBy(id="add-to-wishlist-button-78")
		 private WebElement addtowishlist;

		
		public FictionEx(WebDriver driver)
	    {
	 	   PageFactory.initElements(driver, this);
	    }

		public WebElement getFictionExText() {
			return fictionExText;
		}

		public WebElement getAddtowishlist() {
			return addtowishlist;
		}

		
		
	 
	}



