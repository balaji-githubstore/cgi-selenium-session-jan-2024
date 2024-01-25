package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchOrAddPatientPage {

	private WebDriver driver;

	public SearchOrAddPatientPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String firstName)
	{
		driver.switchTo().frame(driver.findElement(By.name("pat")));
		driver.findElement(By.id("form_fname")).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		// TODO Auto-generated method stub
//		driver.switchTo().frame(driver.findElement(By.name("pat")));
		driver.findElement(By.id("form_lname")).sendKeys(lastName);
	}
}
