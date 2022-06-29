package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_naveen {
WebDriver driver;
	@Given("User is on Home Page99")
	public void pravin() {
	 System.out.println("=====User is on Home Page");  
	 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");  
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		 System.out.println("======User Navigate to LogIn Page"); 
		// driver.findElement(By.linkText("SIGN-ON")).click();
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_Password() {
		 System.out.println("=====User enters UserName and Password");
		 driver.findElement(By.name("login")).sendKeys("mercury");
		  driver.findElement(By.name("passwd")).sendKeys("mercury");
		  
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		 System.out.println("======Message displayed Login Successfully"); 
		 driver.findElement(By.name("proceed")).click();
	}

	
	
}
