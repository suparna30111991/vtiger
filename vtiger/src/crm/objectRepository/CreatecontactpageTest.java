package crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatecontactpageTest {
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement newproduct ;
	
	@FindBy(name="productname")
	private WebElement productn ;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactn ;
	
	
	
	public void navigatecontactname(){
		contactn.click();
	}
 
	
	public void navigateproductname(String product){
		productn.sendKeys(product);
	}
 
	
	public void navigateNewproduct(){
		newproduct.click();
	}

}
