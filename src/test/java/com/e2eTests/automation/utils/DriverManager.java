package com.e2eTests.automation.utils;

public class DriverManagerFactory {
	
	public static DriverManager getManager (DriverType) {
		
		DriverManager driver.Manager ;
		
		switch(type) {
		case Chrome :
			driver.Manager = new ChromeDriverManager();
			break:
		case FIREFOX :
			driver.Manager = new FirefoxDriver.Manager();
			break:
		case IE :
			driver.Manager = new InternetExplorerDriver();
			break:
				default :
					driver.Manager = new EdgeDriver.Manager();
					break;
		}
	
		return driverManager ;
	} 

}
