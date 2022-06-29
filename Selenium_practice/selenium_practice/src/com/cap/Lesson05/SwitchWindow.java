package com.cap.Lesson05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class SwitchWindow
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
        //WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver77\\chromedriver.exe");
        driver= new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/swapnil.html");
		String parentWindow = driver.getWindowHandle().toString();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Open")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window("PopupWindow");
		String str_url= driver.getCurrentUrl();
		System.out.println(str_url);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		String str_url_hemanth_html= driver.getCurrentUrl();
		System.out.println(str_url_hemanth_html);
		Thread.sleep(2000);
		driver.close();

	}

}
