package com.e2eTests.automation.utils;


import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	public static WebDriver driver;
	static DriverManager driverManager;
 @Before
	/**
	 * Cal browser with the design factory navigator
	 */
	public static void setup() {
	driverManager = DriverManagerfactory.getManager(DriverType.FIREFOX);
	driver = driverManager.getDriver('');}
	
 @After
        /**
		 * 	
		 */
     
	public void embedScreen (Scenario scenario) {
		if ( scenario.isFailed()) {
			try {
				scenario.write("current page URL is: "+driver.getCurrentUrl());
				byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot,"image/ong");
			}catch (WebDriverException somePlateformDontScreenshots ){
				System.err.println(somePlateformDontScreenshots.getMessage());
			}
	}
	driver.quit();
}
}
