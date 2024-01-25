package com.cgi.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.name("q"))).click().keyDown(Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.pause(1000).sendKeys(Keys.ENTER).perform();
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("error.png"));
	}
}
