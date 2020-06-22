package com.amazom.utiliies;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions (features = "com.amazon.featureFiles", glue = {"com.amazon.steps"})
public class TestRunners {
	

}
