package com.cap.Lesson05;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo01 
{
static WebDriver driver ; 
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver= new ChromeDriver();
		driver.get("http://demo.opencart.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// by default 
		
        WebDriverWait wait=new WebDriverWait(driver, 15);
       // WebDriverWait wait1= new WebDriverWait(driver, 5);
		
		WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
		
		searchBox.sendKeys("Phone");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("input-group-btn"))).click();
		
		driver.quit();
		
		
		

	}

}
