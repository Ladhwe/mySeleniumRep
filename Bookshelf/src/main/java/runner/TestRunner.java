package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\hp\\workspace\\Bookshelf\\src\\main\\java\\features\\bookshelflogin.feature"
		,glue ={"stepDefinations"}
	    ,format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"} 
		,monochrome = true //display the console output more readable
		,dryRun = false //true
		,strict = false
		)

public class TestRunner {
	
	

}
