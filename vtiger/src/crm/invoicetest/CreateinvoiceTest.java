package crm.invoicetest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crm.genericlibrery.Baseclass;
import crm.objectRepository.Creating_New_InvoiceTest;
import crm.objectRepository.HomepageTest;
import crm.objectRepository.InvoicepageTest;
import crm.objectRepository.Validation_invoiceTest;

public class CreateinvoiceTest extends Baseclass{
	@Test
	public void createTroubletickettest() throws Throwable, IOException{
		
 		String subjectName=flib.getexcelData("Sheet1", 3, 1);
 		String streetname =flib.getexcelData("Sheet1", 4, 1);
 		String poboxName   =flib.getexcelData("Sheet1", 5, 1);
		String cityName   =flib.getexcelData("Sheet1", 6, 1);
		String stateName  =flib.getexcelData("Sheet1", 7, 1);
 		String countryName=flib.getexcelData("Sheet1", 8, 1);
 		String productorder=flib.getexcelData("Sheet1", 9, 1);
 		String countrycode =flib.getexcelData("Sheet1", 11, 1);
		//String exresult5   =flib.getexcelData("Sheet1", 12, 1);

 

		/*open invoice page*/
        
		HomepageTest home3=PageFactory.initElements(driver, HomepageTest.class);
        home3.navigatetoemorlink();
        
	    HomepageTest home4=PageFactory.initElements(driver, HomepageTest.class);
	    home4.navigatetoinvoicelink();
	
		/*open create invoice page*/
	     
	    InvoicepageTest invoice=PageFactory.initElements(driver, InvoicepageTest.class);
	    invoice.navigateToinvoice();
	   
		/*fill subject field*/
	    
	    Creating_New_InvoiceTest uu=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
	    uu.navigatetosubject(subjectName);
	    
	    /* organisation lookup image*/
	    
	    Creating_New_InvoiceTest uuu=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
	    uuu.navigatetoorganisationlookup();
	      
		 Set<String>set=driver.getWindowHandles();
		 
		 Iterator<String>it=set.iterator();
		 String parentwindow=it.next();
		 String childwindow=it.next();
		 
		 driver.switchTo().window(childwindow);
		 
		 driver.findElement(By.xpath("//a[text()='gamlin comyany']")).click();
		  Thread.sleep(5000);
		
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
		
		 driver.switchTo().window(parentwindow);
		 
     	 /* billing adress*/
		 
		 Creating_New_InvoiceTest uuu1=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu1.navigatetostreetfield(streetname);
		 
		 Creating_New_InvoiceTest uuu2=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu2.navigatetopoboxfield(poboxName);
		 
		 Creating_New_InvoiceTest uuu3=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu3.navigatetocityfield(cityName);
		 
		 Creating_New_InvoiceTest uuu4=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu4.navigatetostatefield(stateName);
		 
		 Creating_New_InvoiceTest uuu5=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu5.navigatetocodefield(countrycode);
		 
		 Creating_New_InvoiceTest uuu6=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu6.navigatetocountryfield(countryName);
		 
		 /* copy billing adress*/	 
		 
		 Creating_New_InvoiceTest uuu7=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu7.navigatetocopybillingadress();
		 
		 /* click on product*/	
		 
		 Creating_New_InvoiceTest uuu8=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		 uuu8.navigatetoaddproduct();
		 
		 Set<String>set1=driver.getWindowHandles();
			 Iterator<String>it1=set1.iterator();
			 String parentwindow1=it1.next();
			 String childwindow1=it1.next();
			 
          driver.switchTo().window(childwindow1);
			 
		  driver.findElement(By.xpath("//a[text()='Laptop']")).click();
		  
		  driver.switchTo().window(parentwindow1);
			 	
		 
		 /* Add product*/
		 
		  Creating_New_InvoiceTest uu10=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		  uu10.navigatetoproductNo(productorder);
  		 
		 /*save*/
		 
		  Creating_New_InvoiceTest uuu9=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
		  uuu9.navigatetosave();
		 
		 /*validation of invoice*/
		 
	      Validation_invoiceTest aa=PageFactory.initElements(driver, Validation_invoiceTest.class);
	      aa.getValidation();
	     
	      String actmsg=aa.getValidation().getText();
	         
	      boolean status=actmsg.contains("Invoice Information");
	        
	      Assert.assertTrue(status);
	        
	      Reporter.log(aa.getValidation().getText()+ " created ",true);   






	}}
