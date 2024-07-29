package Pomrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Pom {

	@FindBy(xpath ="//a[text()='Blue Jeans' and parent::*[@class='product-title']]")
	 private WebElement  jeansname;

	@FindBy(xpath ="//input[contains(@class, 'product-box-add-to-cart-button')]")
	 private WebElement  addtocart;
	
	
	
	public Search_Pom(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }



	public WebElement getJeansname() {
		return jeansname;
	}



	public WebElement getAddtocart() {
		return addtocart;
	}


	
}
