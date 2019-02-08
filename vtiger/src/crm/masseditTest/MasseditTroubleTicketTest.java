package crm.masseditTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crm.genericlibrery.Baseclass;
import crm.objectRepository.CreateTroubleTicketPageTest;
import crm.objectRepository.HomepageTest;
import crm.objectRepository.TroubleTicketpageTest;

public class MasseditTroubleTicketTest extends Baseclass {
	@Test
	public void createTroubletickettest() throws Throwable, IOException{
		
		String subjectName=flib.getexcelData("Sheet1", 3, 1);
  		String lastName   =flib.getexcelData("Sheet1", 2, 1);
 		String exname22   =flib.getexcelData("Sheet1", 22, 1);
		String exname1    =flib.getexcelData("Sheet1", 20, 1);

 	  

		/*open trouble ticket page*/
        
		HomepageTest home=PageFactory.initElements(driver, HomepageTest.class);
        home.NavigateToTroublepage();
        
        /*open trouble ticket page*/
	
        TroubleTicketpageTest ttt=PageFactory.initElements(driver, TroubleTicketpageTest.class);
        ttt.NavigateToCreateTroublepage(); 
 
        /*creating new trouble ticket*/
        
        CreateTroubleTicketPageTest ctp=PageFactory.initElements(driver, CreateTroubleTicketPageTest.class);
        ctp.Navigatetocreate(subjectName);
       
       /*save TroubleTicket*/
       
        CreateTroubleTicketPageTest ctp1=PageFactory.initElements(driver, CreateTroubleTicketPageTest.class);
        ctp1.savetroubleticket();

       /*Navigate to TroubleTicket*/
       
        HomepageTest home1=PageFactory.initElements(driver, HomepageTest.class);
        home1.NavigateToTroublepage();
        
       /*check for pravakar111 trouble ticket available or not*/
        for(int i=17;i<=17;i++)
		{
 		 String actname=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[3]")).getText();
		  
 		 Assert.assertEquals(actname, exname22);
	     Reporter.log(actname + " trouble ticket available",true);  
		}
        
 		/*mass edit checkbox*/
        
         HomepageTest masscheckbox=PageFactory.initElements(driver, HomepageTest.class);
         masscheckbox.navigatetocheckboxlink();
         
 		/*click on mass edit*/
         
         HomepageTest massedit=PageFactory.initElements(driver, HomepageTest.class);
         massedit.navigatetomasseditlink();
         
 		/*click on checkbox*/
         
         HomepageTest checkbox=PageFactory.initElements(driver, HomepageTest.class);
         checkbox.navigatetocheckboxselectedlink();
         
 		/*title on mass edit*/
         
         HomepageTest titlemassedit=PageFactory.initElements(driver, HomepageTest.class);
         titlemassedit.navigatetoedittitlelink(lastName);
         
         /*save*/
         
         CreateTroubleTicketPageTest ctp2=PageFactory.initElements(driver, CreateTroubleTicketPageTest.class);
         ctp2.savetroubleticket();
         
         /*open trouble ticket page*/
         
         HomepageTest home2=PageFactory.initElements(driver, HomepageTest.class);
         home2.NavigateToTroublepage();
         
         /*validation for mass edit or not*/ 
         for(int j=3;j<=17;j++)
         {
    	  String actname1= driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+j+"]/td[3]")).getText();
    		     
   		  Assert.assertEquals(actname1, exname1);
 		   
          Reporter.log(actname1 + " Trouble ticket sucessfully edited",true);  
         }
  
	}

}
