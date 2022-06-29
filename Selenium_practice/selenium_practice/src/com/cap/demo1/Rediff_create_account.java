package com.cap.demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_create_account {
	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver188\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		String str=driver.getTitle();
		System.out.println(str);
		WebElement full_name=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		full_name.sendKeys("pravin");
		WebElement choose_rediff_mail_id=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
		choose_rediff_mail_id.sendKeys("pravin876543456");
		WebElement choose_availability_button=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		Boolean b1=choose_availability_button.isEnabled();
		System.out.println(b1);
		choose_availability_button.click();
		Thread.sleep(2000);
		WebElement message_availabilibity=driver.findElement(By.xpath("//*[@id='check_availability']/font/b"));

		String str1=message_availabilibity.getText();

		System.out.println(str1);
		driver.findElement(By.xpath("//img[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		Thread.sleep(4000);
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='country_id']/ul/li"));
		int number=allElements.size();
		System.out.println(number);
		//System.out.println(allElements);

		for (WebElement element: allElements) {
			System.out.println(element.getText());
			//element.click();
		}
		String countryName="Australia (+61)";
		for(int i=0;i<allElements.size();i++){
			if(countryName.equals(allElements.get(i).getText())){
				System.out.println(allElements.get(i).getText() +" --- "+" country exist ");
				System.out.println(i);
				allElements.get(i).click();
				// driver.findElement(By.xpath("//*[@id='country_id']/ul/li[2]")).click();
				break;
			}
		}
		//driver.close();
		//Select s1= new Select(choose_availability_button);
		//s1.getOptions();
		//driver.quit();
	}

}
