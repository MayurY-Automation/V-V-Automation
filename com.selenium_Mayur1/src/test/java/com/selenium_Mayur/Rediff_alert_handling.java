package com.selenium_Mayur;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_alert_handling {
WebDriver driver ;
@BeforeTest

public void launch_browser(){
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
String str=driver.getTitle();
System.out.println(str);
}

@Test
public void Rediff_alert() throws Exception{
driver.findElement(By.name("proceed")).click();
Alert al = driver.switchTo().alert();
Thread.sleep(2000);
String alert_message = al.getText();
System.out.println("javascript alert message =====> "+  alert_message);
String expected = "Please enter a valid user name";
Assert.assertEquals(alert_message, expected);
System.out.println(" test case passed ");
al.accept();
//al.dismiss();
driver.findElement(By.name("login")).sendKeys("mayury515@rediff.com");



}
@AfterTest
public void close_browser(){
System.out.println(" plz close the browser ");
//driver.close();
}
}