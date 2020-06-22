package com.amazon.commonAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BisunessLibraries {

	public static WebDriver driver;
	public static WebElement element;

	// open browser
	public static void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						(System.getProperty("user.dir") + "//BrowserDrivers//chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				// ie code
			} else if (browser.equalsIgnoreCase("gecko")) {
				// gecko code
			} else {
				System.out.println("Invalid browser selection");
			}
			System.out.println("User select " + browser + " browser");
		} catch (Exception a) {
			a.printStackTrace();
		}
	}

	// launch the application
	public static void launchApp() {
		try {
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			System.out.println("User is launched the application");
		} catch (Exception g) {
			g.printStackTrace();
			System.out.println("User is not able to launch the application");
		}
	}

	// enter text value for a text field\area
	public static void enterText(String xpath, String value) {
		try {
			element = driver.findElement(By.xpath(xpath));
			element.sendKeys(value);
		} catch (Exception g) {
			g.printStackTrace();
		}
	}

	// click button
	public static void clickButton(String xpath) {
		try {
			element = driver.findElement(By.xpath(xpath));
			element.click();
		} catch (Exception g) {
			g.printStackTrace();
		}
	}

	// select an item from drop down
	public static void selectItem(String xpath, String item) {
		try {
			element = driver.findElement(By.xpath(xpath));
			Select select = new Select(element);
			select.selectByVisibleText(item);
		} catch (Exception g) {
			g.printStackTrace();
		}
	}

	// verify an item
	public static void verifyEleemntValue(String xpath, String value) {
		try {
			element = driver.findElement(By.xpath(xpath));
			String actualValue = element.getText();
			if ((actualValue.trim()).equalsIgnoreCase(value)) {
				System.out.println("User is able to view with expected result - " + actualValue);
			} else {
				System.out.println("User is not able to view with expected result");
			}
			element.click();
		} catch (Exception g) {
			g.printStackTrace();
		}
	}

	// close the browser
	public static void closeBrowser() {
		try {
			driver.close();
			driver.quit();
		} catch (Exception g) {
			g.printStackTrace();
		}
	}
}
