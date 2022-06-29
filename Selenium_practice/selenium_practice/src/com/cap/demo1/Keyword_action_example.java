package com.cap.demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keyword_action_example {
	 WebDriver driver;
	@BeforeTest
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();


	}
	@AfterTest
	public void close_browser(){
		//driver.close();
	}
	@Test(priority=1, enabled=true)
	public void login() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// int no_of_frames=driver.findElements(By.tagName("frame")).size();
		//driver.manage().window().maximize();

		WebElement uname= driver.findElement(By.name("login"));
		// Actions act = new Actions(driver);
	//	Actions act = new Actions(driver);
		Actions act= new Actions(driver);

		
		
		act.moveToElement(uname).click().keyDown(uname, Keys.SHIFT).sendKeys(uname, "pravin")
		.keyUp(uname, Keys.SHIFT).doubleClick(uname).contextClick(uname).build().perform();
		
		

}
}









