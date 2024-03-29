package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions
( 
		//features="src/test/resources/Features/",
	  // features="src/test/resources/Features/HomepageOptions.feature",
	   //features="src/test/resources/Features/All_Items.feature",
		features="src/test/resources/Features/Login_DDT.feature", 
		glue= {"Stepdefinitions"},
		monochrome = true,
		dryRun= false,
		//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		plugin = {"pretty","html:target/HTMLreports/report.html"}
)
public class Testrunner {

}
