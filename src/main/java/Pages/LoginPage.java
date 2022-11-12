package Pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	//TC1- verify application title
	//TC2- Verify application url
	//TC3- Verify visibility of login logo
	//TC4- Verify visibility of bottom logo
	//TC5- Login to application
	//TC6- verify url of 2nd page inventory page
	
	@FindBy(xpath="//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath="//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath="//input[@id='user-name']") private WebElement userNameTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement logInBtn;
	@FindBy(xpath="//span[@class='title']") private WebElement productLable; 
	
	//constructor to initalize the elements of pages
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// method verify the application title
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	// method verify the application current url
		 public String loginToApp2() throws Exception
		 {
			 loginToApp1();
			 return driver.getCurrentUrl();
		 }
		
//method to verify visibility of login logo
		 public boolean verifyLoginLogo()
		 {
			  return loginLogo.isDisplayed();
		 }
	
	
		//method to verify visibility of bot logo
		 public boolean verifyBotLogo()
		 {
			  return botLogo.isDisplayed();
		 }
	
	//method for login application
	public String loginToApp1() throws Exception
	{
		userNameTextbox.sendKeys(ReadData.readPropertyFile("username"));
		passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
		//userNameTextbox.sendKeys("username");
		//passwordTextbox.sendKeys("password");
		logInBtn.click();
		return productLable.getText();
	}
		

	 //method to verify the URL
	 public String verifyUrl()
	 {
		return driver.getCurrentUrl();
		 
	 }
	 
}
