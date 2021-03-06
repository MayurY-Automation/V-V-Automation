package com.cap_lesson7;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverDemo06 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("internet explorer");
		capabilities.setVersion("10");

		WebDriver driver = new RemoteWebDriver
				(new URL("http://10.51.25.81:4444/wd/hub"), capabilities);

		driver.get("http://demo.opencart.com/");

		Thread.sleep(10000);

		driver.quit();

	}

}
