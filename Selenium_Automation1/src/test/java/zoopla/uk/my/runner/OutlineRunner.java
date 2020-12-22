package zoopla.uk.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin =// { "pretty", "html:target/cucumber-reports/cucumber.json",
		//"json:target/cucumber.json" },
				{ "pretty", "html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json" }, // For Cucumber report 
				monochrome = true, 
				dryRun= false,
		features= "Cucumber_Feature" ,
		glue = "zoopla.uk.stefdefination"
		
		)

public class OutlineRunner extends AbstractTestNGCucumberTests  {

}
