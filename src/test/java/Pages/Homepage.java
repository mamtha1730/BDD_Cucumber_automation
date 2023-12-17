package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Homepage {

		WebDriver driver;
		@FindBy(css=".app_logo")
		WebElement lbl_success;
		
		@FindBy(css="#logout_sidebar_link")
		WebElement btn_logout;
		
		@FindBy(id="about_sidebar_link")
		WebElement btn_about;
		
		@FindBy(id="react-burger-menu-btn")
		WebElement btn_menu;
		
		@FindBy(css=".product_sort_container")
		WebElement dropdown;
	 
		@FindBy(xpath="//div[normalize-space()='Sauce Labs Backpack']")		
		WebElement Sauce_backpack_icon;
		
		@FindBy(id="add-to-cart-sauce-labs-backpack")
		WebElement add_to_cart_btn;
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		WebElement cart_icon;
		
		@FindBy(id="checkout")
		WebElement  checkout_btn;
		
		@FindBy(id="first-name")
		WebElement fn;
		
		@FindBy(id="last-name")
		WebElement ln;
		
		@FindBy(id="postal-code")
		WebElement zip;
		
		@FindBy(id="continue")
		WebElement btn_continue;
		
		@FindBy(id="finish")
		WebElement Finish_btn;
		
		@FindBy(id="back-to-products")
		WebElement Back_home_btn;
				
				public Homepage(WebDriver  driver)
				{
					
					PageFactory.initElements(driver,this);
				}

				public void verifysuccess_login()
				{
					Assert.assertEquals(lbl_success.getText(), "Swag Labs");
				}
				public void clickmenubutton()
				{
					btn_menu.click();
					
				}
				public void clickabout()
				{
					btn_about.click();
				}
				
				public void checkaboutitems()
				{
					String actual_title = driver.getTitle();
					String expected_title = "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing";
					if(driver.getTitle().contains("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing"))
							{
						System.out.println("Page Title contains Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
							}
					else 
					{
						System.out.println("Invalid page title");
							}
					
				}
				public void user_clicks_logout_button()
				{
					btn_logout.click();
				}
				
				public void user_clicks_back_pack()
				{
					Sauce_backpack_icon.click();
				}
	          
				public void add_to_cart()
				{
					add_to_cart_btn.click();
				}
				
				public void cart_click()
				{
				 cart_icon.click();
				}
				
				public void checkout_click()
				{
					checkout_btn.click();
					
				}
				public void names_entry() throws InterruptedException
				{
					fn.click();
					fn.sendKeys("Mamtha");
					Thread.sleep(2000);
					ln.click();
					ln.sendKeys("Vel");
					zip.click();
					Thread.sleep(2000);
					zip.sendKeys("2110");
					Thread.sleep(2000);
					btn_continue.click();
					
					
				}
				public void finish_click()
				{
					Finish_btn.click();
				}
				
				public void back_home_click()
				{
					Back_home_btn.click();
				}
				public void select_button_click()
				{
					//dropdown.click();
					Select select1 = new Select(dropdown);
					select1.selectByIndex(1);
				
				}

		

	}


