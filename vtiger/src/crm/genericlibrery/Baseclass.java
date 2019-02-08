package crm.genericlibrery;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import crm.objectRepository.LoginTestpage;

public class Baseclass {
	public static WebDriver driver;
	public static Fileutil flib=new Fileutil();
	
	@BeforeClass 
	public void configBc() throws IOException
	{
		System.out.println("========Lunch browser========");
		Properties pobj=flib.getpropertiesfileobject();
		String browsername=pobj.getProperty("BROWSER");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "‪./Data/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
 		}
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver", "");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod 
	public void configBm() throws IOException
	{
		System.out.println("login");
		Properties pobj=flib.getpropertiesfileobject();
		driver.get(pobj.getProperty("URL"));
		LoginTestpage login=PageFactory.initElements(driver, LoginTestpage.class);
		login.loginToApp(pobj.getProperty("USERNAME"), pobj.getProperty("PASSWORD"));
		
	}
	
	 @AfterMethod 
	 public void configAm()
	{
			System.out.println("logout");
			
			//HomepageTest home=PageFactory.initElements(driver, HomepageTest.class);
			//home.logout();
			  driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			
		}
	 
		@AfterClass 
		public void configAc()
		{
			System.out.println("========close browser=========");
        driver.close();
        driver.quit();
		
	 }
 	

}
