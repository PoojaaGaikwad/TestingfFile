package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//This class will be extended to all page classes and test classes
public class TestBase {

	//driver is	defined	globally by	which it can be	used by	all	page and test classes
	//Static cause single copy of driver will be used all across the classes	
	
	public static WebDriver driver;
	public void initalization()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.saucedemo.com/");
	
	}
}
