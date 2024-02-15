package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage
{
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
			
			@FindBy(xpath="//input[@id='user-name']")
			private WebElement txt_username;
			
			@FindBy(xpath="//input[@id='password']")
		    private WebElement txt_pwd;
			
			@FindBy(id="login-button")
			private WebElement btn_login;
			
			public void enter_username(String uname) throws InterruptedException
			{
				//txt_username.click();
				Thread.sleep(4000);
				txt_username.sendKeys(uname);
				
			}
			public void enter_password(String pwd)
			{
				//txt_pwd.click();
				txt_pwd.sendKeys(pwd);
				
			}
			public void click_login()
			{
				btn_login.click();
			}
			}
