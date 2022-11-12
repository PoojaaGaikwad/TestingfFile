package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadData;
import Utility.captureScreenshots;

public class LoginPageTest extends TestBase {
private static final captureScreenshots CaptureScreenshot = null;
LoginPage login; 
@BeforeMethod
public void setup()
{
	initalization();
	login = new LoginPage();
}
//test case to verify title1
@Test
public void verifyTitleTest() throws Exception

{
	String title = login.verifyTitle();
	//Assert.assertEquals(title, "Swag Labs");
	Assert.assertEquals(title,ReadData.readExcelFile(1, 0));
	}
//test case to verify url2
@Test
public void verifyUrlTest() throws Exception
{
	String url = login.verifyUrl();
//	Assert.assertEquals(url, "https://www.saucedemo.com/");
	assertEquals(url, ReadData.readExcelFile(1,1));
	}

//test case to login to application and verify lable
@Test
public void loginToApp1Test() throws Exception
{
	 String lable = login.loginToApp1();
	// Assert.assertEquals(lable, "PRODUCTS");
	 Assert.assertEquals(lable,ReadData.readExcelFile(1, 3));
}

//test case to login and verify url
@Test
public void loginToApp2Test() throws Exception
{
	 
//Assert.assertEquals(login.loginToApp2(),"https://www.saucedemo.com/inventory.html");
	Assert.assertEquals(login.loginToApp2(), ReadData.readExcelFile(1,2));
}
//test to verify loginLogo
@Test 
public void verifyLoginLogoTest()
{
	boolean result = login.verifyLoginLogo();
	Assert.assertEquals(result, true);
	
}

//test to verify botLogo
@Test 
public void verifyBotLogoTest()
{
	boolean result = login.verifyBotLogo();
	Assert.assertEquals(result, true);
	
}







@AfterMethod
public void closeBrowser(ITestResult it)
{
	if(ITestResult.FAILURE==it.getStatus())
	{
		captureScreenshots.screenshot(it.getName());
	}
	driver.close();
	}
private void CaptureScreenshot.screenshot(String name) {
	// TODO Auto-generated method stub
	
}

}
