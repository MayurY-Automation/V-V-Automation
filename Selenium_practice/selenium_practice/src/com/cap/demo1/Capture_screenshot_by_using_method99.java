package com.cap.demo1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Capture_screenshot_by_using_method99 {
	public static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.firefox.marionette", "G://geckodriver.exe");

		//System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		//Create Browser object
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Pass the url, call the method
		driver.get("http://www.google.com");
		Capture_screenshot_by_using_method99.captureScreenShot99(driver);
		WebElement search_box_google=driver.findElement(By.name("q"));
		search_box_google.sendKeys("selenium");
		Thread.sleep(3000);
		Capture_screenshot_by_using_method99.captureScreenShot99(driver);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		Capture_screenshot_by_using_method99.captureScreenShot99(driver);
		String str = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3")).getText();
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		Thread.sleep(3000);
		Capture_screenshot_by_using_method99.captureScreenShot99(driver);
		System.out.println(" title===> "+ driver.getTitle());
		driver.close();

	}

	public static void captureScreenShot99(WebDriver driver1) throws IOException{

		//Take screenshot and store as a file format            
		File src=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		
		try {
			// now copy the  screenshot to desired location using copyFile method

			File Dest=new File("C:\\driver\\screenshot\\"+timestamp()+" "+ "google_seema_search_box.png");
			//FileUtils.copyFile(src, new File("C:\\driver9999\\screenshot\\"+timestamp()+" "+ "google_search_box.png"));
			FileUtils.copyFile(src, Dest);
			
			
		}
		catch (IOException e)

		{
			System.out.println(e.getMessage()) ;
		}

	}

	public static String timestamp() {
		//yyyy-MM-dd HH-mm-ss
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
		//return new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		
	} }






