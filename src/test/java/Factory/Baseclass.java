package Factory;

import org.openqa.selenium.WebDriver;

public class Baseclass 
{
	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
