package com.cap.demo1;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Rediff_Webtable {
	WebDriver driver;
	// public static void main(String[] args) {
	@Test

	public void rediff_webtable99(){
		String companyName="Acrysil Ltd.";
		



		// code
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");



		int cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		                                        //*[@id="leftcontainer"]/table/tbody/tr[19]/td[1]/a
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		                                        
		System.out.println("number of rows  -====== "+rows);
		System.out.println("number of Cols -==== "+cols);

		List<WebElement> names = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total names " +names.size());
		System.out.println("Total Prices "+currentPrices.size());
//		for(WebElement tdata:driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")))
//
//		{
//
//			System.out.println(tdata.getText());
//
//		}

		for(int i=0;i<names.size();i++){
			if(companyName.equals(names.get(i).getText())){
				System.out.println(names.get(i).getText() +" --- "+ currentPrices.get(i).getText());
				break;
			}
		}



	}

}
