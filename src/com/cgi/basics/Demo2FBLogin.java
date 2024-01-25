package com.cgi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("hello1223344@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome1232");
		
		driver.findElement(By.name("login")).click();
	}

}
