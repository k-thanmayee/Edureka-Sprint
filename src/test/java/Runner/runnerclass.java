package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features="Features",
		glue="StepDefinition",
		monochrome=true,
plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" //extent.properties
		//plugin={"html:target/cucumber.html"}
		)
public class runnerclass extends AbstractTestNGCucumberTests {

}
 