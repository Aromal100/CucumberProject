package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/resources/Features/AAEB.feature"},
glue = {"StepDefinition"},
dryRun = !true,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty",
"html:Reports/Cucumber.html",
"json:Reports/result.json",
"junit:Reports/result.xml"},
tags = "@Test"
)
public class Runner extends AbstractTestNGCucumberTests{

}
