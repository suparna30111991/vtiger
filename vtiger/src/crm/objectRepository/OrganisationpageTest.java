package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganisationpageTest {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement organisationlink;
	
	
	public void navigateToorganisation(){
		organisationlink.click();
	}

}
