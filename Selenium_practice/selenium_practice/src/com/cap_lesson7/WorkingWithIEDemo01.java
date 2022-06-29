package com.cap_lesson7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithIEDemo01
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.ie.driver", "C:/Advanced Selenium Libs/Drivers/IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		WebDriverWait wait = new WebDriverWait (driver, 15);
		//Title of the webpage is "Software Testing Material - A site for Software Testers"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpathExpression")));

		driver.get("http://demo.opencart.com/");

		Thread.sleep(10000);

		driver.quit();

	}

}
