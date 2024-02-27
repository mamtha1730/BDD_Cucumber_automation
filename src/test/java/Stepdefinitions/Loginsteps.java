package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.Loginpage;
import Utilities.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginsteps
{
	//private static final String Propertyconfigurator = null;
//	public static Class<Logger> logger;
	public WebDriver driver;
	 Loginpage lp ;
	 Homepage hp;
	 
	 List<HashMap<String, String>> datamap; //Data driven
	
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
	String text1= hp.verifyhomepage();
	assertEquals("Swag Labs", text1);
    
}

//Login DDT
@Given("user enters parameters with excel row {string}")
public void user_enters_parameters_with_excel_row(String rows) throws InterruptedException 
{
	datamap=DataReader.data(System.getProperty("user.dir")+"\\testdata\\saucedemo_login.xlsx", "Sheet1");

    int index=Integer.parseInt(rows)-1;
    String email= datamap.get(index).get("username");
    String pwd= datamap.get(index).get("password");
    String exp_res= datamap.get(index).get("res");

    lp=new Loginpage(Hooks.getDriver());
    lp.enter_username(email);
    lp.enter_password(pwd);
    try
    {
        boolean targetpage=hp.isLoginSuccess();
        System.out.println("target page: "+ targetpage);
        if(exp_res.equals("Valid"))
        {
            if(targetpage==true)
            {
               
                hp.clicklogout();
                Assert.assertTrue(true);
            }
            else
            {
                Assert.assertTrue(false);
            }
        }

        if(exp_res.equals("Invalid"))
        {
            if(targetpage==true)
            {
               hp.clicklogout();
                Assert.assertTrue(false);
            }
            else
            {
                Assert.assertTrue(true);
            }
        }


    }
    catch(Exception e)
    {

        Assert.assertTrue(false);
    }
  }


  }









