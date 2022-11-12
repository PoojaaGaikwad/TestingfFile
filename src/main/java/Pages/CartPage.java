package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{
//TC1-verify url
//TC2-Remove 2more item

	//object repo
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartLink;
	
	@FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']") private WebElement removeRedTshirtProduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement removeBoltTshirtProduct;
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutBtn;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement productCountIcon;
	
	//constructor
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	
	public String verifyCurrentUrl()
	{
		cartLink.click();	
		 return driver.getCurrentUrl();
	}
	
	
	public String remove2MoreItem()
	{
		cartLink.click();	
		removeRedTshirtProduct.click();
		removeBoltTshirtProduct.click();
		checkoutBtn.click();
		String count = productCountIcon.getText();
		return count;
	}
	
	
	
	
	
	
	}
	
	
	
	
	
