package com.cap.demo1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Hdfc_window_handling {

	public  WebDriver driver;

	//public static void main(String[] args) throws Exception {
	@Test

	public void hdfc_window() throws Exception{
		String userProfile= "C:\\Users\\Dell\\AppData\\Local\\Google\\Chrome\\User Data\\";
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
		//Create Browser object
		//driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		Thread.sleep(2000);

		int total = driver.findElements(By.tagName("frame")).size();

		System.out.println("Total frames - "+ total);

		driver.switchTo().frame(0);// switch to first frame

		driver.findElement(By.linkText("Privacy Policy")).click();

		Set<String> winIds = driver.getWindowHandles();

		//winIds = driver.getWindowHandles();

		Iterator<String> it = winIds.iterator();

		System.out.println("Total windows - "+ winIds.size());

		//it = winIds.iterator();

		String hdfc_main_window = it.next();

		String privacy_policy_window = it.next();

		System.out.println(hdfc_main_window);

		System.out.println(privacy_policy_window);

		driver.switchTo().window(privacy_policy_window);

		driver.findElement(By.linkText("Personal")).click();
		String str=driver.getTitle();
		System.out.println(str);
		//Assert.assertEquals(str, "abcd");
		driver.switchTo().window(hdfc_main_window);
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("44434378");
		driver.switchTo().window(privacy_policy_window);
		driver.findElement(By.linkText("NRI")).click();
		String str1=driver.getTitle();
		System.out.println(str1);
		driver.switchTo().window(hdfc_main_window);
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
	//	driver.findElement(By.xpath("//img[@alt='continue']")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("abcdefgh");
		driver.findElement(By.name("chksecmod")).click();
		

	}



}
