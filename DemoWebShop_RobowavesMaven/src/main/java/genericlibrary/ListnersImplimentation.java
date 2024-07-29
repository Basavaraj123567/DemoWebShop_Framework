package genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnersImplimentation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("........Excution of ||" +result.getName()+" ||Started......");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("........Excution of ||" +result.getName()+" ||Sucess......");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("........Excution of ||" +result.getName()+" ||Failure......");
	
	
	TakesScreenshot ts=(TakesScreenshot)BaseTest.lisWebDriver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File trg=new File("./Errorshots/"+result.getName()+".png");
			
			try {
				FileHandler.copy(src, trg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	
	}
		

}
