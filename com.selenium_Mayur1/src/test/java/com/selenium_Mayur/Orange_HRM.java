package com.selenium_Mayur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Orange_HRM {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String str = driver.getTitle();
		System.out.println(str);
	}
	
	
	
	public void afterTest() {
		System.out.println("Please close the browser");
	}

}
