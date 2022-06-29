package com.selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_demo {
	WebDriver driver;

	@BeforeTest
	public void launch_browser() {
		System.out.println(" hello selenium how r u ? ");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
// driver.get("https://demo.guru99.com/test/newtours/");
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
// driver.navigate().forward();
// driver.navigate().back();
// driver.navigate().refresh();
		String nt_title = driver.getTitle();
		System.out.println(nt_title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void registartion_valid() throws Exception {
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		String nt_title1 = driver.getTitle();

		System.out.println(nt_title1);
		driver.findElement(By.name("firstName")).sendKeys("pravin");

		driver.findElement(By.name("lastName")).sendKeys("singh");
		String phone_rel_xpath = "//form/table/tbody/tr[4]/td[2]/input";
		String phone_abs_xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input";
//driver.findElement(By.xpath(phone_abs_xpath)).sendKeys("857966180");
		driver.findElement(By.xpath(phone_rel_xpath)).sendKeys("857966180");

		WebElement cnt_drp_down = driver.findElement(By.name("country"));
		Select s1 = new Select(cnt_drp_down);
		s1.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		s1.selectByValue("BANGLADESH");
		Thread.sleep(2000);
		s1.selectByIndex(6);

	}

	@Test
	public void un_registartion() {
		System.out.println(" test case 2 ");
	}

	@AfterTest
	public void close_browser() {
		driver.close();
	}

}