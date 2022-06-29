package com.selenium_Mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APIdocs_selenium_Framehandling {

	WebDriver driver;
	@BeforeTest
	public void launch_browser(){
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	driver.manage().window().maximize();
	String str=driver.getTitle();
	System.out.println(str);
	}
	@Test
	public void language() throws Exception{
		WebElement  java_api= driver.findElement(By.xpath("/html/body/div/main/div[5]/div[3]/div/div[2]/p[4]/a"));
		java_api.click();
		WebElement  frames= driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/ul[1]/li[1]/a"));
		frames.click();
		Thread.sleep(4000);
	driver.switchTo().frame("classFrame");
	driver.findElement(By.xpath("//*[@id=\"i0\"]/th/a")).click();
	String str=driver.findElement(By.xpath("/html/body/main/div[1]/h1")).getText();
	System.out.println("Text"+str);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[1]/a")).click();
	
	}
	//@AfterTest
	//public void close_browser(){
	//System.out.println(" plz close the browser ");
	//driver.close();
	//}


	}
