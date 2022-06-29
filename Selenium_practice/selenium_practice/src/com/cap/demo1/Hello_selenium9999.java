package com.cap.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

class Hello_selenium9999 {
 WebDriver driver ;
	//public static void main(String[] args) throws Exception {
		@BeforeTest
		public void newtours_code(){
		System.out.println("hello selenium how r u ? ");
        System.out.println("hello java what r u doing now ? ");
      //  System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
      //  driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		
		driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		}
		
        @AfterTest
        public void search() throws InterruptedException{
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(3000);
      
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
      
        String str=driver.getTitle();
        System.out.println(str);
        //driver.close();
       // driver.quit();
        
		}
        
	}


