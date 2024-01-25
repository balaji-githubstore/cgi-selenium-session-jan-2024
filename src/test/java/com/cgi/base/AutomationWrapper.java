package com.cgi.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class AutomationWrapper {
	
	public WebDriver driver;
	
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://demo.openemr.io/b/openemr");
	}
	
	@After
	public void endScenario()
	{
		driver.quit();
	}

}
