package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FBRegister {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");//wait for page load to complete
		
		//findelement->check for presence of element in 0.5s
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		
		//findelement->check for presence of element in 0.5s
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
	}
}
