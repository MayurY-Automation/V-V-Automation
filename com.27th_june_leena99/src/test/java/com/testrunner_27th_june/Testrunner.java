package com.testrunner_27th_june;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		features="Feature",
		glue={"step_definition"}
		)

public class Testrunner {

}