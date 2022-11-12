package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	@Test(enabled=false)
	public void openGoogle() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.close();
	
	}
	
	@Test
	public void openSaucelab() throws Exception
	{
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(4000);
	driver.quit();
	
	}
	@Test(enabled=false)
	public void openRediff() throws Exception
	{
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	driver.get("https://www.rediff.com/");
	Thread.sleep(2000);
	driver.close();
	
	}
	@Test(enabled=false)
	public void openFb() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
//WebDriverManager.safaridriver().setup();
//WebDriver driver = new SafariDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.close();
	
	}
	
	
	
	
	
	

}
