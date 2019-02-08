package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creating_New_InvoiceTest {

	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(xpath="//tbody/tr[8]/td[2]/img")
	private WebElement organisationlookup;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement streetfield;
	
	@FindBy(xpath="//input[@name='bill_pobox']")
	private WebElement poboxfield;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement cityfield;
	
 	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement statefield;
 	
 	@FindBy(xpath="//input[@name='bill_code']")
	private WebElement codefield;
 	
 	@FindBy(xpath="//input[@name='bill_country']")
	private WebElement countryfield;
	
 	@FindBy(xpath="//tbody/tr[11]/td[3]/input")
	private WebElement copybillingadress;
	
 	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement addproduct;
 	
 	@FindBy(xpath="//input[@id='qty1']")
	private WebElement productNo;
	
  	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
	
 	 
	public void navigatetosubject(String subjectname)
	{
		subject.sendKeys(subjectname);
	}
	
	public void navigatetoorganisationlookup()
	{
		organisationlookup.click();
	}
	
	public void navigatetostreetfield(String street)
	{
		streetfield.sendKeys(street);
	}
	
	public void navigatetocityfield(String pobox)
	{
		poboxfield.sendKeys(pobox);
	}
	
	public void navigatetopoboxfield(String city)
	{
		cityfield.sendKeys(city);
	}
	
	public void navigatetostatefield(String state)
	{
		statefield.sendKeys(state);
	}
	
	public void navigatetocodefield(String code)
	{
		codefield.sendKeys(code);
	}
	
	public void navigatetocountryfield(String country)
	{
		countryfield.sendKeys(country);
	}
	
	public void navigatetocopybillingadress()
	{
		copybillingadress.click();
	}
	
	public void navigatetoaddproduct()
	{
		addproduct.click();
	}
	
	public void navigatetoproductNo(String add)
	{
		productNo.sendKeys(add);
	}
	
	public void navigatetosave()
	{
		save.click();
	}




}
