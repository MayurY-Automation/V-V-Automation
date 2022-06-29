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

public class Rediff_alert_handling {
WebDriver driver;
	@BeforeTest
	public void open_browser(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver= new ChromeDriver();
        
        
	}
	
	@Test
public void rediff_alert() throws Exception{
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement sign_in_button=driver.findElement(By.name("proceed"));
		sign_in_button.click();
		Alert al= driver.switchTo().alert();
		String str=al.getText();
		System.out.println(str);
		Assert.assertEquals(str, "Please enter a valid user name");
		System.out.println("alert text validated ");
		Thread.sleep(3000);
		al.accept();
		//al.dismiss();
		
		
	}
	
	@AfterTest
public void close_browser(){
		driver.close();
	}
}
