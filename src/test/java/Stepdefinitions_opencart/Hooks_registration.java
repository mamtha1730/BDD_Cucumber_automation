package Stepdefinitions_opencart;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Opencart_homepage;
import Pages.Opencart_regnpage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks_registration 
{
	public static  WebDriver driver;
	Opencart_homepage och;
	Opencart_regnpage ocr;
	
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
		driver.get("https://tutorialsninja.com/demo/index.php");
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
			scenario.attach(tempBytes, "image/png", "screenshot1");
	    }		
				
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}


}
