package com.cap.demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest99 {
	
	//STCM 
	WebDriver driver;

	@DataProvider(name = "Mayur")

	public static Object[][] credentials() {

		return new Object[][] {
			{ "vaishakh", "password123" },
			{ "nitish", "password456" },
			{ "abhi", "password567" },

		};

	}

	@DataProvider(name="fowzia")
	public static Object[][] logindata99(){
		return new Object[][]{
			{ "ram", "password123" },
			{ "sanskruthi", "password456" },
			//{ "gaurav", "password567" },	
		};
	}

	@DataProvider(name="omkar")
	public static Object[][] logindata991(){
		return new Object[][]{
			{ "ajay", "password123" },
			{ "nitin", "password456" },
			{ "fowzia", "password567" },	
		};
	}

	//Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "fowzia")

	public void invalid_login(String Username, String Password) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		//Create Browser object
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

       driver.findElement(By.name("login")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		String str2=  driver.getTitle();
		System.out.println(str2);
		//  Assert.assertEquals(str2,"Rediffmail" );
		//            
		//System.out.println("test passed");
		//            Assert.assertEquals(10, 10);
		//            System.out.println("9 is equal to 10 ");
		//            Assert.assertFalse(false);
		driver.quit();





	}



}

