package pkgTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = "TestCode"
		)

public class CucumberRunner {

	
}
