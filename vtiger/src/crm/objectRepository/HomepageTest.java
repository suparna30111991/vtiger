package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageTest {
	//store all the webElement using @findby
	

		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement signoutpage;

	    @FindBy(xpath="//a[text()='Sign Out']")
		private WebElement logoutlink;


		@FindBy(xpath="//a[@href='index.php?module=HelpDesk&action=index']")
		private WebElement troubleticketLink;
		
		@FindBy(xpath="//a[text()='More']/..")
		private WebElement moreoption;
		
		@FindBy(xpath="//a[text()='Invoice']")
		private WebElement clickinvoice;
		
		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement clickchechbox;
		
		@FindBy(xpath=".//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[2]")
		private WebElement clickmassedit;
	 	
		@FindBy(xpath="//input[@id='ticket_title_mass_edit_check']")
		private WebElement checkbox;
		
		@FindBy(xpath="//textarea[@name='ticket_title']")
		private WebElement titlemassedit;
		
		@FindBy(xpath="//a[text()='Organizations']")
		private WebElement organisationlink;
		
		@FindBy(xpath="//a[text()='Quotes']")
		private WebElement clickquotes;
		
		
		public void navigatetooquotes()
		 {
			clickquotes.click();
		 }
	 	
		public void navigatetoorganisation()
		 {
			organisationlink.click();
		 }
		
		public void navigatetoedittitlelink(String Title)
		 {
			titlemassedit.sendKeys(Title);
		 }
	 	
		public void navigatetocheckboxselectedlink()
		 {
			checkbox.click();
		 }
		
		public void navigatetomasseditlink()
		 {
			clickmassedit.click();
		 }
		
		 public void navigatetocheckboxlink()
		 {
			 clickchechbox.click();
		 }
		
		 public void navigatetoemorlink()
		 {
			 moreoption.click();
		 }
		 
		 public void navigatetoinvoicelink()
		 {
			 clickinvoice.click();
		 }
		 
	 
		 public void navigatetosignoutlink()
		 {
			 signoutpage.click();
		 }
		 
		 public void NavigateToTroublepage() {
				 
			 troubleticketLink.click();
		 }
		 public void logout(){
			 logoutlink.click();
			 
		 }
		 
				 	
			

}
