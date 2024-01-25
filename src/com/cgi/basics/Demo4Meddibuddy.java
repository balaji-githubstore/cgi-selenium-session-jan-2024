package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4Meddibuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.medibuddy.in/");
		
//		Check which basic locator suits the element or write xpath
		//click on login 
		//click on I have a corporate account -
		//click on Learn more
		//click on continue verification
	}

}
