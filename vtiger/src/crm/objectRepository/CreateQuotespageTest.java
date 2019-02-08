package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateQuotespageTest {
	@FindBy(xpath="//img[@title='Create Quote...']")
	private WebElement createquotes;
	
	@FindBy(name="subject")
	private WebElement subjectName;
	 
	@FindBy(xpath="//tbody/tr[7]/td[4]/img")
	private WebElement organisationonce;
	
	@FindBy(xpath="//tbody/tr[10]/td[3]/input")
	private WebElement copybillingadr;
	
	@FindBy(xpath="//tbody/tr[5]/td[4]/img")
	private WebElement addcontact1;
	
	@FindBy(xpath="//span[contains(text(),'Quote Information')]")
	private WebElement quotescreated;
	
	
	 
	
	public WebElement getQuotescreated() {
		return quotescreated;
	}

	
	
	public void navigatetoaddcontact1(){
		addcontact1.click();
	}
 
	public void navigatetocopyadr(){
		copybillingadr.click();
	}

	public void navigatetoorgaonce(){
		organisationonce.click();
	}
 
	public void navigatetsubjectadd(String subjectname){
		subjectName.sendKeys(subjectname);
	}

	public void navigatetoquoteslink(){
		createquotes.click();
	}


}
