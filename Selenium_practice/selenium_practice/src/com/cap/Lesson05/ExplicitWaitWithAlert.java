package com.cap.Lesson05;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithAlert {
	public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("F:\\selenium_learning_185_batch\\selenium_practice\\src\\com\\cap\\Lesson05\\AlertBoxDemos.html");
		
		
		try
		{
			driver.findElement(By.id("alert")).click();
			WebDriverWait wait = new WebDriverWait(driver, 0);
			wait.until(ExpectedConditions.alertIsPresent());
			
			
			
			String alrt = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.print(alrt);
			driver.close();
		}
		catch(Exception ex)
		{
			System.out.println(" alert is not present ");
			//System.out.println(ex);	
		}
	}
}