package Stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks 
{
	public static  WebDriver driver;
	 Loginpage lp ;
	 Homepage hp;
	
	@Before
	public void  dosetup()
	{
    	//Logger logger;
    	//logger = LogManager.addLogger(Loginsteps.class); //log4j
    	
		System.out.println("Inside setup");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
	}

	
	@After
	public void teardown() 
	{
		System.out.println("Inside teardown");
		driver.quit();
	}
	@AfterStep
	public void addscreenshot(Scenario scenario)
	{
		//screenshots
		if(scenario.isFailed())
		{
			final byte[] tempBytes = ((TakesScreenshot) driver)
	                .getScreenshotAs(OutputType.BYTES);
			scenario.attach(tempBytes, "image/png", "screenshot");
	    }		
				
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}


}
