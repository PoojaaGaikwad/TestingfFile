package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutInfoPage extends TestBase {
//TC1-Verify title
//TC2-checkout
	
//object reo
	@FindBy(xpath="//input[@id='first-name']") private WebElement nameTextbox; 
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastNameTextbox;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement codeTextbox;
	@FindBy(xpath="//input[@id='continue']") private WebElement continuebtn;
	
	//constructor
	public CheckoutInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	//method
	
	
	
	
	
	
	
	
}



