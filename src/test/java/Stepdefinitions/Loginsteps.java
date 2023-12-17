package Stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps
{
	//private static final String Propertyconfigurator = null;
//	public static Class<Logger> logger;
	WebDriver driver = null;
	 Loginpage lp ;
	 Homepage hp;
	 
	    @BeforeClass
		public void dosetup()
		{
	    	//Logger logger;
	    	//logger = LogManager.addLogger(Loginsteps.class); //log4j
	    	
			System.out.println("Inside setup");
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
			
		}
		@AfterClass
		public void teardown(Scenario scenario) throws InterruptedException, IOException
		{
			System.out.println("Inside teardown");
			Thread.sleep(2000);
			//screenshots
			final File tempFile = ((TakesScreenshot) driver)
	                .getScreenshotAs(OutputType.FILE);
			
			File screenshot = new File("C:\\Users\\ics-guest\\eclipse-workspace1\\cucumberproject" + "login.png");
			   
			Files.copy(tempFile, screenshot);
			
			 
			final byte[] tempBytes = ((TakesScreenshot) driver)
	                .getScreenshotAs(OutputType.BYTES);
			scenario.attach(tempBytes, "image/png", "login");
			
			driver.quit();
		}
		
	
@When("user enters parameters {string} {string}")
public void user_enters_parameters(String uname, String pwd)
{
	
	System.out.println("Inside user_enter_parameters");
	lp= new Loginpage(driver);
	lp.enter_username(uname);
	lp.enter_password(pwd);
  }

@When("user clicks login button")
public void user_clicks_login_button() 
{
	lp.click_login();
	
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() 
{
	hp= new Homepage(driver);
	AssertJUnit.assertEquals(driver.findElement(By.cssSelector(".app_logo")).getText(), "Swag Labs");
	hp.verifysuccess_login();
	System.out.println("Inside user should be logged in successfully :");
    
}

@When("user is in homepage and click homepage icon")
public void user_is_in_homepage_and_click_homepage_icon()
{
	hp.clickmenubutton();
   }

@Then("menu items are displayed")
public void menu_items_are_displayed()
{
   System.out.println("Menu items are displayed");
}

@When("user clicks about icon")
public void user_clicks_about_icon()
{
   hp.clickabout();
}

@Then("user views about items")
public void user_views_about_items() 
{
  hp.checkaboutitems();  
}

@When("user clicks sauce_labs_backpack")
public void user_clicks_sauce_labs_backpack() throws InterruptedException 
{
   hp.user_clicks_back_pack();
   Thread.sleep(2000);
   hp.add_to_cart();
   Thread.sleep(3000);
}

@When("user clicks cart_icon")
public void user_clicks_cart_icon() throws InterruptedException
{
	hp.cart_click();
	Thread.sleep(2000);
	
   
}

@When("user clicks check_out_button")
public void user_clicks_check_out_button() throws InterruptedException 
{
 hp.checkout_click();
 Thread.sleep(2000);
}

@When("user enters his info")
public void user_enters_his_info() throws InterruptedException
{
    
	hp.names_entry();
	Thread.sleep(2000);
}

@When("user clicks finish_button")
public void user_clicks_finish_button() throws InterruptedException 
{
    hp.finish_click();
    Thread.sleep(2000);
}

@When("user clicks Back_home")
public void user_clicks_back_home()
{
	hp.back_home_click();
	
    }


@Given("user is home page and clicks select icon")
public void user_is_home_page_and_clicks_select_icon() 
{
	
   hp.select_button_click();
}

@Then("user views contents according to his selection")
public void user_views_contents_according_to_his_selection()
{
  
	System.out.println("Contents are displayed !");
	
}
}


