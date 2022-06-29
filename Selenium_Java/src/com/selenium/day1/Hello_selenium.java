package com.selenium.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_selenium {

public static void main(String[] args) throws Exception {
System.out.println(" hello selenium how r u ? ");
System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
String google_title= driver.getTitle();
System.out.println(google_title);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(3000);
WebElement  google_search_button= driver.findElement(By.name("btnK"));
google_search_button.click();
String google_title11= driver.getTitle();
System.out.println(google_title11);



}

}