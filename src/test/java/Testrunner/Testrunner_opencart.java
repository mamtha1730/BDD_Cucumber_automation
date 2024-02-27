package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
/*This program executes DDT for registration page in opencart 
 * uses opencart_regnpage and Opencart_homepage Obj repo
 */
@RunWith(Cucumber.class) 
@CucumberOptions
( 
		features="src/test/resources/Features/Registration_DDT.feature", 
		glue= {"Stepdefinitions_opencart"},
		monochrome = true,
		dryRun= false,
		//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		plugin = {"pretty","html:target/HTMLreports/report_opencart.html"}
)
public class Testrunner_opencart {

}
