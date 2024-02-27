package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Opencart_homepage extends Basepage
{
	
	public Opencart_homepage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	public void clickmyaccount()
	{
		lnkMyaccount.click();
	}
	public void clickregister()
	{
		lnkRegister.click();
	}
	public void clicklogout()
	{
		lnkLogout.click();
	}
	
	}
