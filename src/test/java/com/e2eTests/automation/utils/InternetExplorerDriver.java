package com.e2eTests.automation.utils;


public class InternetExplorerDriver extends DriverManager {

	@Override
	protected void startService() {
		System.setProperty("webdriver.ie.driver", "src/test/resources/BrowserDriver/IEDriverServer.exe");
	}
	protected void stopService() {
	}
	protected void createDriver() {

		driver.manage().window().maximize();
	}
	
}
