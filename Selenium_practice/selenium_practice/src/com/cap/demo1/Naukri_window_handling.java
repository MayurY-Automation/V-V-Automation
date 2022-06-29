package com.cap.demo1;

import java.util.Iterator; 
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukri_window_handling { 
	WebDriver driver;

	@Test
	public void naukri_window() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\driver77\\chromedriver.exe"); 
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the website
		driver.get("http://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();



		Set<String> s=driver.getWindowHandles();
		int no_of_windows=s.size();
		System.out.println("total number of windows opened after launching naukri.com===> " + "  " + no_of_windows);

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();
			System.out.println(" windows id=====>  " + child_window);


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(" title of child window ===>  " + "  " + driver.switchTo().window(child_window).getTitle());
				Thread.sleep(2000);
				driver.close();

			}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("selenium");
		//driver.findElement(By.name("keyword")).sendKeys("uft");

	}
}