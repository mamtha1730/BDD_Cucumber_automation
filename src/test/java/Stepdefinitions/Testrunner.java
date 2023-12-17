package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions
(
		features="src/test/resources/Features/Login.feature", 
		glue= {"Stepdefinitions"},
		monochrome = true,
		dryRun= false,
		//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		plugin = {"pretty","html:target/HTMLreports/report.html"}
		
		
		)
public class Testrunner {

}
