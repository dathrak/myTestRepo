package com.amazon.pages;

import com.amazon.commonAction.BisunessLibraries;

public class HomePage extends BisunessLibraries{
	
	//search functionality
	//select an item - enter a value - click search button
	//verfication
	public static void searchFunction (String item, String value) {
		selectItem("//select[@id='searchDropdownBox']", item);
		enterText("//input[@id='twotabsearchtextbox']", value);
		clickButton("//input[@type='submit']");
	}
	
	//search for multiple items by having ,

}
