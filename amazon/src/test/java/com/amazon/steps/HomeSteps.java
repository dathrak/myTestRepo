package com.amazon.steps;

import com.amazon.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeSteps extends HomePage{

	@Given ("^I want to launch application on \"(.*)\"$")
	public void want_launch_app (String browser) {
		openBrowser(browser);
		launchApp();
	}
	
	@And ("^I want to search for an item \"(.*)\" from \"(.*)\" category$")
	public void want_search_item (String value, String item) {
		searchFunction(item, value);
	}
	
	@Then ("^I want to verify search results \"(.*)\" value$")
	public void verify_element (String elementval) {
		verifyEleemntValue("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]", elementval);
	}
	
}
