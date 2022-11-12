package TestCases;

import org.testng.Assert;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {

	
	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup()
	{
		initalization();
	    invent = new InventoryPage();
		login = new LoginPage();
	}
	
	
	@Test
	public void verifySmallLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifySmallLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyBigLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyBigLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void add6ProductTest() throws Exception
	{
		login.loginToApp1();
	    String result = invent.add6Product();
	    Assert.assertEquals(result, "6");
	}
	
	@Test
	public void remove2ProductTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		String result = invent.remove2Product();
		 Assert.assertEquals(result, "4");
	}
	@Test
	public void verifyFacebookLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyFacebookLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyTwitterLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyTwitterLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyLinkdinLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyLinkdinLogo();
		Assert.assertEquals(result, true);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
