package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\java\\Features\\Login.feature"
		,glue= {"stepDefinition"}
		,plugin= {"pretty","html:test-output"}
		,monochrome=true
		,dryRun=false
		)

public class TestRunner {
	
	}
