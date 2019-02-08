package crm.genericlibrery;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult r) {
		String FailedTestName=r.getMethod().getMethodName();
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(Baseclass.driver);
		
		File src=edriver.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("./screenshot/"+ FailedTestName + ".png");
		
		try
		{
			org.apache.commons.io.FileUtils.copyFile(src, dst);
		}
		catch(IOException e)
		{
			
		}		

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
