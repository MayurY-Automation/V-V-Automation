package com.cap.Lesson05;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo03
{
	static WebDriver myTestDriver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
		myTestDriver= new ChromeDriver();
		myTestDriver.get("http://jsfiddle.net/tKQFN/");
		
		
		//WebDriverWait wait = new WebDriverWait(myTestDriver,10);
		myTestDriver.manage().window().maximize();

		try{
			WebElement myDynamicElement = (new WebDriverWait(myTestDriver, 5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='register']")));
			
		}
		catch (TimeoutException e) 
		{
			System.out.println(e);
		}

	}

}
