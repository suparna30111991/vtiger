package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactpageTest {
	@FindBy(xpath="//a[@href=\"index.php?module=Products&action=index\"]")
	private WebElement contactlink;
	
	
	public void navigatetocontact(){
		contactlink.click();
	}
}
