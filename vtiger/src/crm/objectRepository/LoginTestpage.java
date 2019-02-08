package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTestpage {
	//store all the webElement using @findby
	
		@FindBy(xpath="//input[@name='user_name']")
		private WebElement UserName;
		
		@FindBy(xpath="//input[@name='user_password']")
		private WebElement Password;
		
		@FindBy(id="submitButton")
		private WebElement Loginbutton;

		//utilisation through getters
		
		public WebElement getUSERNAME() {
			return UserName;
		}

		public WebElement getPASSWORD() {
			return Password;
		}

		public WebElement getLoginbutton() {
			return Loginbutton;
		}
		
		//uthilisation through business libraries/methods

		public void loginToApp(String USERNAME, String PASSWORD) {
			 
			UserName.sendKeys(USERNAME);
			Password.sendKeys(PASSWORD);
			Loginbutton.click(); 
		}

	 
		
		
		
		

		 
		
		
		
		
		

}
