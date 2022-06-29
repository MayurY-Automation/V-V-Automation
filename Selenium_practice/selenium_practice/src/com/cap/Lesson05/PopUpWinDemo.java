package com.cap.Lesson05;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpWinDemo
{
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver= new ChromeDriver();

		driver.get("file:///F:/selenium_learning_185_batch//selenium_practice//src//com//cap//Lesson05//PopUpWinDemo.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("newtab")).click();
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window: "+parentWindow);
		
		for (String childWindow : driver.getWindowHandles())
		{
		  if(!childWindow.equals(parentWindow))
		 {
						driver.switchTo().window(childWindow);
						driver.findElement(By.id("alert")).click();
						Alert alert=driver.switchTo().alert();
						alert.accept();
						System.out.println("Window: "+childWindow);
		}
		}
		
		for (String childWindow : driver.getWindowHandles())
		{
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(childWindow);
				break;
			}
		}
		
		Thread.sleep(5000);

		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}