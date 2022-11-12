package TestCases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase {

	LoginPage login; 
	InventoryPage invent;
	CartPage cart;
	
	
	@BeforeMethod
	public void setup()
	{
		initalization();
		 login = new LoginPage();
		 invent = new InventoryPage();
		 cart = new CartPage();
		 
	}
	
	@Test
	public void verifyCurrentUrl() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.remove2Product();
	    String url = cart.verifyCurrentUrl();
		Assert.assertEquals(url,"https://www.saucedemo.com/cart.html");
	}
	
	@Test
	public void remove2MoreItem() throws Exception
	{
		
		login.loginToApp1();
		invent.add6Product();
		invent.remove2Product();
		String result = cart.remove2MoreItem();
		Assert.assertEquals(result, "2");
	}
	

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
		
}
