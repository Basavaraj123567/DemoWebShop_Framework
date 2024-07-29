package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	  @FindBy(id="Email")
	
	
	 private   WebElement emailtextfeild;
	    
	    
	  @FindBy(id = "Password")

	  private  WebElement passtextfeild;

	  @FindBy(xpath  ="//input[@value='Log in']")
	  
	  private  WebElement   loginbutton;

	  
	  
	  public Loginpage(WebDriver driver) {
		  
		  PageFactory.initElements(driver, this);
		  
	  }



	public WebElement getEmailtextfeild() {
		return emailtextfeild;
	}



	public WebElement getPasstextfeild() {
		return passtextfeild;
	}



	public WebElement getLoginbutton() {
		return loginbutton;
		
		//8
		//	13
	}	  
		  
		
		 
		 
	  }

