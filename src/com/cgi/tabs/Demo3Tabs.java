package com.cgi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Tabs {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
			if(driver.getTitle().equals("phpMyAdmin"))
			{
				break;
			}
			System.out.println("----------------------------");
		}
		
		//now driver will point to the tab with "phpMyAdmin"
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_go")).click();
		
		String actualHeader= driver.findElement(By.tagName("h1")).getText();
		System.out.println(actualHeader);
		
		String actualError= driver.findElement(By.xpath("(//div[@role='alert'])[2]")).getText();
		System.out.println(actualError);
	}

}
