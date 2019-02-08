package crm.invoicetest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crm.genericlibrery.Baseclass;
import crm.objectRepository.ContactpageTest;
import crm.objectRepository.CreateQuotespageTest;
import crm.objectRepository.CreatecontactpageTest;
import crm.objectRepository.CreateorganisationpageTest;
import crm.objectRepository.CreateproductpageTest;
import crm.objectRepository.Creating_New_InvoiceTest;
import crm.objectRepository.HomepageTest;
import crm.objectRepository.OrganisationpageTest;

public class EndToEndInvoiceTest extends Baseclass {

	 @Test  
		public static void  EndtoendprocessofCreateinvoice() throws Throwable {
	 			  
			 
			String organisationName1=flib.getexcelData("Sheet1", 10, 1);
			String productName      =flib.getexcelData("Sheet1", 1, 1);
			String lastName         =flib.getexcelData("Sheet1", 2, 1);
			String subjectName      =flib.getexcelData("Sheet1", 3, 1);
	 		String streetname       =flib.getexcelData("Sheet1", 4, 1);
			String poboxName        =flib.getexcelData("Sheet1", 5, 1);
			String cityName         =flib.getexcelData("Sheet1", 6, 1);
			String stateName        =flib.getexcelData("Sheet1", 7, 1);
	 		String countryName      =flib.getexcelData("Sheet1", 8, 1);
	 		String productorder     =flib.getexcelData("Sheet1", 9, 1);
	 		String countrycode      =flib.getexcelData("Sheet1", 11, 1);
	 	    String exresult1        =flib.getexcelData("Sheet1", 14, 1);
	 		String actresult2       =flib.getexcelData("Sheet1", 15, 1);

	         /*click on organisation*/
	 		
	 		HomepageTest orga=PageFactory.initElements(driver, HomepageTest.class);
	 		orga.navigatetoorganisation();
	 		
	 		 /* click new organisation  button*/
	 		
	 		OrganisationpageTest create=PageFactory.initElements(driver, OrganisationpageTest.class);
	 		create.navigateToorganisation();
	 		
	 		 /*create new organisation*/
	 		
	 		CreateorganisationpageTest crt=PageFactory.initElements(driver, CreateorganisationpageTest.class);
	 		crt.navigateNewOrganisation(organisationName1);
	 		
	 		 /*save*/
	 		
	 		Creating_New_InvoiceTest u9=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
			  u9.navigatetosave();
			  Thread.sleep(3000);

			  
			  /*click on product*/
			  
			 ContactpageTest contact=PageFactory.initElements(driver, ContactpageTest.class);
			 contact.navigatetocontact();
			 
			  /* click new product  button*/
			 
			 CreatecontactpageTest cp=PageFactory.initElements(driver, CreatecontactpageTest.class);
			 cp.navigateNewproduct();
			 
			 /*create new product*/
			 
			 CreateproductpageTest cpp=PageFactory.initElements(driver, CreateproductpageTest.class);
			 cpp.navigatetoproductname(productName);
			 
			 /*save*/
			
		 	 Creating_New_InvoiceTest u91=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
			 u91.navigatetosave();
			 Thread.sleep(3000);
			 
			 /*click on contact*/
			 
			 CreatecontactpageTest clickcontact=PageFactory.initElements(driver, CreatecontactpageTest.class);
			 clickcontact.navigatecontactname();
			 
			 /* click new contact  button*/
			 
			 CreatecontactpageTest prod=PageFactory.initElements(driver, CreatecontactpageTest.class);
			 prod.navigatecontactname();
			 
			 /*add lastname*/
			 
			 CreateproductpageTest name=PageFactory.initElements(driver, CreateproductpageTest.class);
			 name.navigatetoproductname(lastName);
			 
			 /*click on organisation */
			 
			 CreateproductpageTest orgaAdd=PageFactory.initElements(driver, CreateproductpageTest.class);
			 orgaAdd.navigatetoorganisationadd();
			  
			    Set<String>set=driver.getWindowHandles();
		 			 
		 		 Iterator<String>it=set.iterator();
		 		 
		 		 String parentwindow=it.next();
		 		 String childwindow=it.next();
		 			 
		 	 driver.switchTo().window(childwindow);
		 			 
		 	 driver.findElement(By.xpath("//a[text()='gamlin comyany']")).click();
		 	 Thread.sleep(5000);
		 			
	 	 	 driver.switchTo().window(parentwindow);
	 	 	 
	 	 	/*save*/
	 	 	 
	 	 	 Creating_New_InvoiceTest u92=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
			 u92.navigatetosave();
			 Thread.sleep(3000);
			 
			/*show more dynamic option*/
		        
			 HomepageTest home3=PageFactory.initElements(driver, HomepageTest.class);
		     home3.navigatetoemorlink();
		     
		    /*click on quotes*/
		     
		     HomepageTest clickquotes=PageFactory.initElements(driver, HomepageTest.class);
		     clickquotes.navigatetooquotes();
		     
		     /*click on quotes*/
		     
		     CreateQuotespageTest quotes=PageFactory.initElements(driver, CreateQuotespageTest.class);
		     quotes.navigatetoquoteslink();
		     
		     /*add subject*/
		     
		     CreateQuotespageTest addsub=PageFactory.initElements(driver, CreateQuotespageTest.class);
		     addsub.navigatetsubjectadd(subjectName);
		     
         /*click on organisation */
			 
			 CreateQuotespageTest orgaonce=PageFactory.initElements(driver, CreateQuotespageTest.class);
			 orgaonce.navigatetoorgaonce();
			  
			 Set<String>set1=driver.getWindowHandles();
			 
			 Iterator<String>it1=set1.iterator();
			 String parentwindow1=it1.next();
			 String childwindow1=it1.next();
			 
			 driver.switchTo().window(childwindow1);
			 
			 driver.findElement(By.xpath("//a[text()='gamlin comyany']")).click();
			 Thread.sleep(5000);
			
			 Alert alt=driver.switchTo().alert();
			 alt.accept();
			 
			 driver.switchTo().window(parentwindow1);
			 
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
			 
			 CreateQuotespageTest copyadr=PageFactory.initElements(driver, CreateQuotespageTest.class);
			 copyadr.navigatetocopyadr();
			 
			 /* click on product*/	
			 
			 Creating_New_InvoiceTest uuu8=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
			 uuu8.navigatetoaddproduct();
			 
			 Set<String>set2=driver.getWindowHandles();
			 Iterator<String>it2=set2.iterator();
			 String parentwindow2=it2.next();
			 String childwindow2=it2.next();
			 
			 driver.switchTo().window(childwindow2);
			 
			 driver.findElement(By.xpath("//a[text()='Laptop']")).click();
			 driver.switchTo().window(parentwindow2);
		
			 
			 /* Add no product*/
			 
			  Creating_New_InvoiceTest uu10=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
			  uu10.navigatetoproductNo(productorder);
			  
			 /*add  contact*/
			  
			  CreateQuotespageTest contactad=PageFactory.initElements(driver, CreateQuotespageTest.class);
			  contactad.navigatetoaddcontact1();
			  
			 Set<String>set3=driver.getWindowHandles();
			 Iterator<String>it3=set3.iterator();
			 String parentwindow3=it3.next();
			 String childwindow3=it3.next();
			 
			 driver.switchTo().window(childwindow3);
			 
			 driver.findElement(By.xpath("//a[text()='PRAVAKAR RANA']")).click();
	 			
			 
			 driver.switchTo().window(parentwindow3);
			 
         /*save*/
	 	 	 
	 	 	 Creating_New_InvoiceTest u93=PageFactory.initElements(driver, Creating_New_InvoiceTest.class);
			 u93.navigatetosave();
			 
			/*validation*/	
			 
			 CreateQuotespageTest cr=PageFactory.initElements(driver, CreateQuotespageTest.class);
			 cr.getQuotescreated();
			 

		      String actmsg=cr.getQuotescreated().getText();
		      
		      System.out.println(actmsg);
		         
		      boolean status=actmsg.contains("Quote Information");
		        
		      Assert.assertTrue(status);
		        
		      Reporter.log(cr.getQuotescreated().getText()+ " created sucessfully ",true);   	
	 }			
}
