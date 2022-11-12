package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutInfoPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutInfoPageTest extends TestBase{

	LoginPage login;
	 InventoryPage invent;
	 CartPage cart;
	 CheckoutInfoPage checkInfo;
	
	
	@BeforeMethod
	public void setup()
	{
		initalization();
		  login = new LoginPage();
		  invent = new InventoryPage();
		  cart = new CartPage();
		  checkInfo = new CheckoutInfoPage();
	}
	
	@Test
	public void verifyTitleTest() 
	{
		String title = checkInfo.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
}
