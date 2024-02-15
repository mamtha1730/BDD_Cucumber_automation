package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps
{
	//private static final String Propertyconfigurator = null;
//	public static Class<Logger> logger;
	public WebDriver driver;
	 Loginpage lp ;
	 Homepage hp;
	
@Given("user enters parameters {string} {string}")
public void user_enters_parameters(String uname, String pwd) throws InterruptedException
{
	
	System.out.println("Inside user_enter_parameters");
	lp= new Loginpage(Hooks.getDriver());
	lp.enter_username(uname);
	lp.enter_password(pwd);
  }

@And("user clicks login button")
public void user_clicks_login_button() 
{
	lp= new Loginpage(Hooks.getDriver());
	lp.click_login();
	
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() 
{
	hp= new Homepage(Hooks.getDriver());
	String text1= hp.verifymomepage();
	assertEquals("Swag Labs", text1);
    
}

}


