package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex_Register {
	 
	

		 @FindBy(id="gender-male")
		
		 private	WebElement maleradiobutton;
		 
		 
		 @FindBy(id="FirstName")
			
		 private	WebElement Firstnametextfeild;
		 
		 @FindBy(id="LastName")
			
		 private	WebElement LastName;
		 
		 
		 @FindBy(id   ="Email")

		 private	WebElement Email;

 
		 @FindBy(name   ="Password")
		 private		WebElement password;

		 
		 @FindBy(id  ="ConfirmPassword")
		 private		WebElement confpassword;
		 
		 @FindBy(id  ="register-button")
		 private WebElement registerbutton;


	

public Ex_Register(WebDriver driver) {
	  
	  PageFactory.initElements(driver, this);


}


public WebElement getMaleradiobutton() {
	return maleradiobutton;
}








public WebElement getFirstnametextfeild() {
	return Firstnametextfeild;
}


public WebElement getLastName() {
	return LastName;
}




public WebElement getEmail() {
	return Email;
}




public WebElement getPassword() {
	return password;
}




public WebElement getConfpassword() {
	return confpassword;
}




public WebElement getRegisterbutton() {
	return registerbutton;
}



}
