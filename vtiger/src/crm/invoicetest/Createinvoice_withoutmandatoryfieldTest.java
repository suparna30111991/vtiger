package crm.invoicetest;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crm.genericlibrery.Baseclass;
import crm.objectRepository.HomepageTest;
import crm.objectRepository.InvoicepageTest;

public class Createinvoice_withoutmandatoryfieldTest extends Baseclass {
	@Test
	public void createTroubletickettest() throws Throwable, IOException{
		
 		String exresult3   =flib.getexcelData("Sheet1", 16, 1);

		/*open invoice page*/
        
		HomepageTest home3=PageFactory.initElements(driver, HomepageTest.class);
        home3.navigatetoemorlink();
        
	    HomepageTest home4=PageFactory.initElements(driver, HomepageTest.class);
	    home4.navigatetoinvoicelink();
	
		/*open create invoice page*/
	     
	    InvoicepageTest invoice=PageFactory.initElements(driver, InvoicepageTest.class);
	    invoice.navigateToinvoice();
	    
		/*save invoice*/
	    
	    InvoicepageTest save=PageFactory.initElements(driver, InvoicepageTest.class);
	    save.navigateTosave();
	    
	     Alert alt=driver.switchTo().alert();
	     String actmsg= alt.getText();
		  
		 Thread.sleep(5000);
		 alt.accept();
 		 
		 boolean status=actmsg.contains(exresult3);
		 Assert.assertTrue(status);
		 
         Reporter.log("Subject cannot be empty",true);  

 	}

}
