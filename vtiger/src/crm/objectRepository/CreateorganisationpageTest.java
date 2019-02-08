package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateorganisationpageTest {
	@FindBy(name="accountname")
	private WebElement organisationname;
	
	 

	
	public void navigateNewOrganisation(String organisation){
		organisationname.sendKeys(organisation);
	}

}
