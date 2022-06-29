package com.cap.demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apollorunner {
	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		//String userProfile= "C:\\Users\\Dell\\AppData\\Local\\Google\\Chrome\\User Data\\";
		
		ChromeOptions options = new ChromeOptions();
		// options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		//options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
		driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
		//Create Browser object
		//driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();


		//String userProfile= "C:\\Users\\JJAUHARI\\AppData\\Local\\Google\\Chrome\\User Data\\";
		//System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Java Training VnV 16march\\\\\\\\selenium_all_jars_25apr\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//// options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		//options.addArguments("--user-data-dir="+userProfile);
		//options.addArguments("--profile-directory=Default");
		//options.addArguments("--start-maximized");
		//options.addArguments("--disable-notifications");
		//driver = new ChromeDriver(options);
		driver.get("https://www.apollo247.com");
		System.out.println("apollo site opened");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Thread.sleep(4000);
		WebElement doctor = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/header/div[4]/div[1]/a[1]"));
		System.out.println(doctor.getText());
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		// act.moveToElement(doctor).build().perform();
		act.moveToElement(doctor).click(doctor).build().perform();
		Thread.sleep(2000);
		 String str = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/h1")).getText();
		 System.out.println(str);

		// driver.close();
	}
}
