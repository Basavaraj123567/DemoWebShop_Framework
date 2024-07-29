package genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pomrepository.Ex_Homepage;
import Pomrepository.Loginpage;


public class BaseTest {
	public DataUtility data = new DataUtility();

	public WebDriver driver;
	public static WebDriver lisWebDriver;
	public Ex_Homepage home;

	@BeforeClass

	public void launchTheBrowser() throws IOException {

		driver = new ChromeDriver();
		lisWebDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.getDataFormProperties("url"));
	}

	@BeforeMethod

	public void performLogin() throws IOException {

		home = new Ex_Homepage(driver);

		home.getLoginlink().click();

		Loginpage lp = new Loginpage(driver);
		lp.getEmailtextfeild().sendKeys(data.getDataFormProperties("email"));
		lp.getPasstextfeild().sendKeys(data.getDataFormProperties("pwd"));
		lp.getLoginbutton().click();

	}
	@AfterMethod
	
	public void performLogot() {
		
		home.getLogout().click();
		
	}
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
		
	}
}


