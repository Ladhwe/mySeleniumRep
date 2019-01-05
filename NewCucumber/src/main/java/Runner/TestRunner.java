package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features =  "D:\\Java\\Workspace\\NewCucumber\\src\\main\\java\\Feature\\Login.feature"
,glue = {"StepDefinations.steps"} 
)
public class TestRunner { 
	
}
	
	

