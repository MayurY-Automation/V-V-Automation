package com.cap.demo1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxDemos
{
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver= new ChromeDriver();

		driver.get("file:///F:/desktop%2027%20december%20back%20up/shubhangi_alert.html");

		Thread.sleep(2000);

		driver.findElement(By.id("alert")).click();

		Thread.sleep(3000);

		Alert alert=driver.switchTo().alert();
		System.out.println("The alert message is : " + alert.getText());
		alert.accept();

		Thread.sleep(3000);

		driver.findElement(By.id("confirm")).click();

		Thread.sleep(2000);

		Alert confirm=driver.switchTo().alert();

		confirm.accept();//ok 

		Thread.sleep(3000);

		driver.findElement(By.id("confirm")).click();

		Thread.sleep(3000);

		confirm=driver.switchTo().alert();

		confirm.dismiss();//cancel

		Thread.sleep(3000);

		driver.findElement(By.id("prompt")).click();

		Thread.sleep(3000);

		Alert prompt=driver.switchTo().alert();

		String text=prompt.getText();
		System.out.println(text);

		prompt.sendKeys("Shivani");

		Thread.sleep(3000);

		prompt.accept();

		Thread.sleep(3000);

		driver.findElement(By.id("prompt")).click();

		Thread.sleep(3000);

		prompt=driver.switchTo().alert();

		prompt.dismiss();

		Thread.sleep(3000);

		driver.quit();
	}

}