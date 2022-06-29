package com.cap.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours {
static WebDriver driver;
	//public static void main(String[] args) throws Exception {
@BeforeTest
public void launch_browser(){
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("http://demo.guru99.com/test/newtours/");
}
	@Test(priority=1,enabled=false)
	public void registration() throws Exception{
		
		//driver.get("http://demo.guru99.com/test/newtours/");
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("pravin");
		driver.findElement(By.name("lastName")).sendKeys("singh");
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("9986111370");
		driver.findElement(By.xpath("//form/table/tbody/tr[4]/td[2]/input")).sendKeys("9986111370");
        driver.findElement(By.id("userName")).sendKeys("pravinsingh918@gmail.com");
        WebElement cnt_name=driver.findElement(By.name("country"));
        Select s1= new Select(cnt_name);
        s1.selectByVisibleText("INDIA");
        Thread.sleep(2000);
        s1.selectByIndex(93);
        Thread.sleep(2000);
        s1.selectByValue("ALGERIA");
       // driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//input[@src='images/submit.gif']")).click();
      
        
	}
	@Test(priority=2)
	public void login(){
		  driver.findElement(By.partialLinkText("SIGN-ON")).click();
		  driver.findElement(By.name("userName")).sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("mercury");
		  driver.findElement(By.name("submit")).click();
		  
	}
	@Test(priority=3,enabled=false)
	public void findflights(){
		Boolean flight_field=driver.findElement(By.linkText("Flights")).isEnabled();
		System.out.println(flight_field);
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
	@AfterTest
	public void close_browser(){
		//driver.close();
	}

}
