package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Loginpage {
	
			public WebDriver driver;
			@FindBy(id="user-name")
			WebElement txt_username;
			
			@FindBy(id="password")
		    WebElement txt_pwd;
			
			@FindBy(id="login-button")
			WebElement btn_login;
			
			public Loginpage(WebDriver  driver)
			{
				this.driver= driver;
				PageFactory.initElements(driver,this);
			}
			public void enter_username(String uname)
			{
				txt_username.click();
				txt_username.sendKeys(uname);
				
			}
			public void enter_password(String pwd)
			{
				txt_pwd.click();
				txt_pwd.sendKeys(pwd);
				
			}
			public void click_login()
			{
				btn_login.click();
			}
			}
