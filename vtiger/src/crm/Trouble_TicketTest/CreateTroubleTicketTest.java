package crm.Trouble_TicketTest;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crm.genericlibrery.Baseclass;
import crm.objectRepository.CreateTroubleTicketPageTest;
import crm.objectRepository.HomepageTest;
import crm.objectRepository.TroubleTicketpageTest;

public class CreateTroubleTicketTest extends Baseclass{
	@Test
	public void createTroubletickettest() throws Throwable, IOException{
		
		String subjectName=flib.getexcelData("Sheet1", 3, 1);
		String exresult   =flib.getexcelData("Sheet1", 12, 1);

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

       
       /*varify*/
       
        String actmsg=ttt.getSusmsg().getText();
        System.out.println(actmsg);
        System.out.println(exresult);
       
        boolean status=actmsg.contains("Tickets Information");
        
        Assert.assertTrue(status);
        
        Reporter.log(ttt.getSusmsg().getText()+ " available",true);  

      
	}		

}
