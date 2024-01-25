package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//all menu will be handled here
public class MainPage {
	
	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getMainPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnCalendarMenu()
	{
		
	}
	
	public void clickOnPatientMenu()
	{
		driver.findElement(By.xpath("//div[text()='Patient']")).click();
	}
	public void clickOnNewSearchMenu()
	{
		driver.findElement(By.xpath("//div[text()='New/Search']")).click();
	}

}
