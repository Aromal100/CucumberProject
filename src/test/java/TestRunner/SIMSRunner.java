package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/SIMS.feature"},
dryRun = !true,
glue = {"StepDefinition"})
public class SIMSRunner extends AbstractTestNGCucumberTests {

}
