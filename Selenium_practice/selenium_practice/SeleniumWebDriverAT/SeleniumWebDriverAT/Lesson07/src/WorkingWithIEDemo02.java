import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WorkingWithIEDemo02 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "C:/Advanced Selenium Libs/Drivers/IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();

		driver.get("http://demo.opencart.com/");
		WebElement searchBox=driver.findElement(By.name("search"));
		
		searchBox.sendKeys("Phone");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("input-group-btn")).click();
		
		Thread.sleep(5000);
		
		WebElement searchBoxInSearchPage=driver.findElement(By.id("input-search"));
		
		searchBoxInSearchPage.clear();
		
		searchBoxInSearchPage.sendKeys("TV");
		
		driver.findElement(By.id("button-search")).click();
		
		Thread.sleep(5000);
		
		searchBoxInSearchPage=driver.findElement(By.xpath("//*[@id='input-search']"));
		
		searchBoxInSearchPage.clear();
		
		searchBoxInSearchPage.sendKeys("Mac");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//html/body/div[2]/div/div/input")).click();;
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("iMac")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("ook Ai")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		System.out.println("'a' tag elements list:");
		
		for(WebElement temp:list)
		{
			System.out.println(temp.getText());
		}
		
		System.out.println("*******************************");
		
		for(WebElement temp:list)
		{
			String text=temp.getText();
			if(text.equals("MacBook Pro"))
			{
				temp.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		List<WebElement> listCSS=driver.findElements(By.cssSelector("span.price-tax"));
		
		System.out.println("CSS selector:");
		
		for(WebElement temp:listCSS)
		{
			System.out.println(temp.getText());
		}
		
		driver.quit();

	}

}