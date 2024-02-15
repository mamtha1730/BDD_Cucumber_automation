package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyItemSteps {
	public WebDriver driver;
	Loginpage lp;
	Homepage hp;

	@Given("user clicks sauce_labs_backpack")
	public void user_clicks_sauce_labs_backpack() throws InterruptedException {
		hp= new Homepage(Hooks.getDriver());
		hp.user_clicks_back_pack();
		Thread.sleep(2000);
		hp.add_to_cart();
		Thread.sleep(3000);
	}

	@When("user clicks cart_icon")
	public void user_clicks_cart_icon() throws InterruptedException 
	{
		hp= new Homepage(Hooks.getDriver());
		hp.cart_click();
		Thread.sleep(2000);

	}

	@When("user clicks check_out_button")
	public void user_clicks_check_out_button() throws InterruptedException 
	{
		hp= new Homepage(Hooks.getDriver());
		hp.checkout_click();
		Thread.sleep(2000);
	}

	@When("user enters his info")
	public void user_enters_his_info() throws InterruptedException
	{
		hp= new Homepage(Hooks.getDriver());
		hp.names_entry();
		Thread.sleep(2000);
	}

	@When("user clicks finish_button")
	public void user_clicks_finish_button() throws InterruptedException
	{
		hp= new Homepage(Hooks.getDriver());
		hp.finish_click();
		Thread.sleep(2000);
	}

	@When("user clicks Back_home")
	public void user_clicks_back_home() 
	{
		hp= new Homepage(Hooks.getDriver());
		hp.back_home_click();
     }
	@Then("validate success buy")
	public void validate_success_buy()
	{
		hp= new Homepage(Hooks.getDriver()); 
		hp.verifymomepage();
	}


}
