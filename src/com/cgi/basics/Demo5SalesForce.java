package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5SalesForce {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.name("UserFirstName")).sendKeys("jack");
		
		driver.findElement(By.xpath("//input[contains(@id,'UserLastName')]")).sendKeys("daniel");
		
		Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("IT Manager");
		
//		selectJobTitle.selectByValue("IT_Manager_AP");
//		selectJobTitle.selectByIndex(5);
		
		Select selectEmployees=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmployees.selectByVisibleText("101 - 200 employees");
		
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
	}

}
