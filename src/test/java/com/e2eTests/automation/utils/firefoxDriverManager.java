package com.e2eTests.automation.utils;

import org.openqa.selenium.firefox.FirefoxDriver;


	
	public class FireFoxDriverManager extends DriverManager {

		@Override
		protected void startService() {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		}
		protected void stopService() {
		}
		protected void createDriver() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
	}


