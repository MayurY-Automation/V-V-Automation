package com.cap_lesson7;

import org.testng.annotations.Test;

public class Grouping_demo_new99 {
	//stcm datprovider 
	@Test (groups = { "retesting" })

	public void retesting11() {

		System.out.println("print retesting11");

	}

	@Test (groups = { "retesting" })

	public void retesting12() {

		System.out.println("print retesting12()");

	}

	@Test (groups = { "regression" })

	public void regression11() {

		System.out.println("regression11()");

	}

	@Test (groups = { "regression", })

	public void regression12() {

		System.out.println("regression12()");

	}

	@Test (groups = { "regression" })

	public void regression_retesting13() {

		System.out.println("either regression or retesting ");

	}

	@Test (groups = { "adeep" })

	public void regression_retesting14() {

		System.out.println("adeep team 1 ");

	}
	@Test (groups = { "adeep" })

	public void regression_retesting15() {

		System.out.println("adeep team 2 ");

	}
	
}



