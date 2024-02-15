package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomepagevalidateSteps 
{

	public WebDriver driver;
	 Loginpage lp ;
	 Homepage hp;
	 
	 @Given("user is in homepage and click homepage icon")
	 public void user_is_in_homepage_and_click_homepage_icon()
	 {
		 hp= new Homepage(Hooks.getDriver());
	     hp.clickmenubutton();
		 
	 }

	 @Then("user chooses nameselect")
	 public void user_chooses_nameselect() throws InterruptedException
	 {
		 hp= new Homepage(Hooks.getDriver());
		 hp.select_name();
	 }
}
