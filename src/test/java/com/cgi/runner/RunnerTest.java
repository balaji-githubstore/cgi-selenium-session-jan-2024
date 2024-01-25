package com.cgi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/feature/"}
		,glue = {"com.cgi.steps","com.cgi.base"}
		,plugin = "html:target/cucumber-report.html"
		,publish = false
//		,dryRun = true
		,tags = "@patient"
		)

public class RunnerTest extends AbstractTestNGCucumberTests {
	

}
