package com.e2eTests.automation.utils;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverType type) {
		
		DriverManager driverManager = null ;
		
	switch(type) {
		case CHROME :
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX :
			driverManager = new FireFoxDriverManager();
			break;
		case IE :
			driverManager = new InternetExplorerDriver();
			break;
				default :
					driverManager =  new EdgeDriverManager();
					break;
		
	}
	return driverManager;
	}
}



