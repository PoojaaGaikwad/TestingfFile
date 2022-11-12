package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class InventoryPage extends TestBase {
//TC1-verify visibility of small logo
//TC2-verify visibility of big logo	
//TC3-Add 6 product in cart	
//TC4-Remove 2 product in cart
//TC5-verify visibility of twitter logo
//TC6-verify visibility of facebook logo	
//TC7-verify visibility of linkdin logo	
	
	
	//Object Repo
	@FindBy(xpath="//div[@class='peek']") private WebElement smallLogo;
	@FindBy(xpath="//img[@class='footer_robot']") private WebElement bigLogo;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement sortDropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesieProduct;
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTshirtProduct;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement redTshirtProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacketProduct;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement productCountIcon;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebookLogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkdinLogo;
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']") private WebElement removeOnesieProduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") private WebElement removeBikeLightproduct;
	
	
	//constructor
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	 
	//methods
	//TC1-verify visibility of small logo	
public boolean verifySmallLogo()
{
	return smallLogo.isDisplayed();
}
	
public boolean verifyBigLogo()
{
	return bigLogo.isDisplayed();
}

public String add6Product()
{
	Select a = new Select(sortDropdown);
a.selectByVisibleText("Price (low to high)");
onesieProduct.click();
bikeLightproduct.click();
boltTshirtProduct.click();
redTshirtProduct.click();
backpackProduct.click();
jacketProduct.click();
 String count = productCountIcon.getText();
 return count;
}

public String remove2Product()
{
	removeOnesieProduct.click();
	removeBikeLightproduct.click();
	String count = productCountIcon.getText();
	return count;
}

public boolean verifyTwitterLogo()
{
	return twitterLogo.isDisplayed();
}

public boolean verifyFacebookLogo()
{
	return facebookLogo.isDisplayed();
}

public boolean verifyLinkdinLogo()
{
	return linkdinLogo.isDisplayed();
}


}
