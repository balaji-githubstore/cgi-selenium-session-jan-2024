package com.cgi.base;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class AutomationWrapper {

	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void setup(@Optional("ch") String browserName) {
		
		
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.get("https://demo.openemr.io/b/openemr");
	}

	@AfterMethod(alwaysRun = true)
	public void teardown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File file= ts.getScreenshotAs(OutputType.FILE);
			file.renameTo(new File("error.png"));
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			
		}
		
		
		
		
		driver.quit();
	}
}
