package com.cap.demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo3 {

	@BeforeTest
	public void launch_browser(){
		
		System.out.println(" i m in bt");
	}
	@BeforeTest
	public void launch_browser1(){
		
		System.out.println(" i m in bt1");
	}
	@BeforeSuite
public void launch_browser99(){
		
		System.out.println(" i m in bs");
	}
	@BeforeMethod
public void method99(){
		
		System.out.println(" i m in method");
	}
	@AfterMethod
public void method991(){
		
		System.out.println(" i m in after method");
	}
	@Test(priority=-2,enabled=true)
public void LOgin2(){
		
		System.out.println(" i m in test");
	}
	@Test(priority=-1,enabled=true)
	public void LOgin1(){
			
			System.out.println(" i m in test1");
		}
	
}
