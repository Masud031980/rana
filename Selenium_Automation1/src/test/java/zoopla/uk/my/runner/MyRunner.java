package zoopla.uk.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		//plugin= {"pretty", "json:target/cucumber-reports/cucumber.json"}
		plugin= {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
				monochrome=true,
		//Location of folder
		features = "Cucumber_Feature",
		//Location of stef defination	
	     glue = "zoopla.uk.stefdefination"
  	 
	
	    	
		
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
