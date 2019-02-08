package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TroubleTicketpageTest {
	//store all the webElement using @findby

		@FindBy(xpath="//img[@title='Create Ticket...']")
		private WebElement createtroubleticketLink;
		

		@FindBy(xpath="//span[contains(text(),' Trouble Tickets Information')]")
		private WebElement susmsg;
		
		
		 
		//uthilisation through getters
		
	    public WebElement getSusmsg() {
			return susmsg;
		}


		//uthilisation through business libraries/methods

		public void NavigateToCreateTroublepage() {
			 createtroubleticketLink.click();
		}	
		 
	 
			
			
			
			
		 



}
