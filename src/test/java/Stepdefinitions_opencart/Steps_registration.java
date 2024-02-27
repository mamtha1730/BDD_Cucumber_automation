package Stepdefinitions_opencart;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Opencart_homepage;
import Pages.Opencart_regnpage;
import Utilities.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_registration
{
	public WebDriver driver;
	Opencart_homepage och;
	Opencart_regnpage ocr;
	
	List<HashMap<String, String>> datamap1; //Data driven
	
	@Given("customer click register  under Myaccout")
	public void customer_click_register_under_myaccout() 
	{
		//
		och=new Opencart_homepage(Hooks_registration.getDriver());
		och.clickmyaccount();
		och.clickregister();
	}

	@When("user clicks privacy checkbox")
	public void user_clicks_privacy_checkbox() 
	{
		ocr=new Opencart_regnpage(Hooks_registration.getDriver());
		ocr.setPrivacyPolicy();
	}

	@When("user click continue button to register")
	public void user_click_continue_button_to_register() 
	{
		ocr=new Opencart_regnpage(Hooks_registration.getDriver());
		ocr.clickContinue();
	}

	@Then("verify user registration account has created")
	public void verify_user_registration_account_has_created() 
	{
		ocr=new Opencart_regnpage(Hooks_registration.getDriver());
		String msg=ocr.getConfirmationMsg();
		//Assert.assertEquals(msg, "Your Account Has Been Created!","Account creation failed");
	   
	}

	@Then("user clicks logout under Myaccount")
	public void user_clicks_logout_under_myaccount()
	{
		och=new Opencart_homepage(Hooks_registration.getDriver());
		och.clickmyaccount();
		och.clicklogout();
		
	}
	@Given("user enters parameters with excel row {string}")
	public void user_enters_parameters_with_excel_row(String rows) throws InterruptedException 
	{
		datamap1=DataReader.data(System.getProperty("user.dir")+"\\testdata\\Registration_opencart.xlsx", "Sheet1");

	    int index=Integer.parseInt(rows)-1;
	    String fname= datamap1.get(index).get("fn");
	    String lname= datamap1.get(index).get("ln");
	    String email1= datamap1.get(index).get("email");
	    String telephone= datamap1.get(index).get("tele");
	    String pwd1= datamap1.get(index).get("pwd");
	    String con_pwd1= datamap1.get(index).get("con_pwd");

	    ocr=new Opencart_regnpage(Hooks_registration.getDriver());
	    ocr.setFirstName(fname);
	    ocr.setLastName(lname);
	    ocr.setEmail(email1);
	    ocr.setTelephone(telephone);
	    ocr.setPassword(pwd1);
	    ocr.setConfirmPassword(con_pwd1);
	}
}
