package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicepageTest {
	@FindBy(xpath="//img[@title='Create Invoice...']")
	private WebElement invoicelnk;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	
	public void navigateToinvoice()
	  {
		invoicelnk.click();
	  }
	
	public void navigateTosave()
	{
		save.click();
	}
	
}
