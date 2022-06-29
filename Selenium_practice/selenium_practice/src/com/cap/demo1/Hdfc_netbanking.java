package com.cap.demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hdfc_netbanking {
	WebDriver driver;
	@BeforeTest
	public void open_browser(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
      
        
	}
	
	@Test
public void hdfc_frame() throws Exception{
		int no_of_frames=driver.findElements(By.tagName("frame")).size();
		System.out.println(no_of_frames);
		//driver.switchTo().frame("footer");
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("login_page");
//		driver.switchTo().frame(0);
//		driver.findElement(By.name("fldLoginUserId")).sendKeys("444378");
//		driver.switchTo().defaultContent();
//		//driver.switchTo().frame("footer");
//		driver.switchTo().frame(1);
//		driver.findElement(By.linkText("Terms and Conditions")).click();
//		driver.switchTo().defaultContent();
//		//driver.switchTo().frame("login_page");
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//img[@alt='continue']")).click();
//		driver.findElement(By.name("fldPassword")).sendKeys("pravin123");
//		
		
		
	}
	
	@AfterTest
public void close_browser(){
		driver.close();
	}
}


