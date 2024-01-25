package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://nasscom.in/");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Become a Member']"))).perform();
		
		//make the element visible and then click on it
		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();
		
	}
}
