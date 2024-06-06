package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/resources/Features/Ekhool.feature"},
glue = {"StepDefinition","Hooks"},
dryRun = !true,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty",
"html:Reports/Cucumber.html",
"json:Reports/result.json",
"junit:Reports/result.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags = "@Group")
public class EkhoolRunner extends AbstractTestNGCucumberTests
{
	
}