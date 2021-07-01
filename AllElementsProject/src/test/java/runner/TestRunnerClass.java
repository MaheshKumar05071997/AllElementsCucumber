package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features",
glue = "stepDefinition",
plugin = {"pretty", "html:target/report.html",
		"json:target/jsonReport.json",
		"junit:target/xmlReport.xml"},
monochrome = true,
strict = true,
tags = "@SumTable",
stepNotifications = true)
public class TestRunnerClass {
	

}
