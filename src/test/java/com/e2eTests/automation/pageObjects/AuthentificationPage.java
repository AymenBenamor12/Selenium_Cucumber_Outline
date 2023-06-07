package com.e2eTests.automation.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.CommondMethods;
import com.e2eTests.automation.utils.Setup;

public class AuthentificationPage extends CommondMethods {
	
	public static WebDriver driver;
	
	//private CommondMethods commonMethods = new CommondMethods();
	public AuthentificationPage() {
		driver = Setup.driver; //driver de cette classe egale driver de Setup
		//PageFactory.initElements(driver, AuthentificationPage.class);
	}
	
	
	
	/*Locators*/
	final static String FIRSTNAME_ID = "firstName";
	final static String LASTSTNAME_ID = "lastName";
	final static String EMAIL_ID = "userEmail";
	final static String GENDER_ID = "gender-radio-1";	
	final static String NUMBER_ID = "userNumber";
	final static String CURRENTADRESS_ID = "currentAddress";
	final static String SUBMIT_ID = "submit";
	final static String CLOSE_ID = "closeLargeModal";
	/*@FindBy*/
	@FindBy(how= How.ID, using=FIRSTNAME_ID)
	public static WebElement firstName;

	@FindBy(how= How.ID, using=LASTSTNAME_ID )
	public static WebElement lastLame;

	@FindBy(how= How.ID, using=EMAIL_ID )
	public static WebElement email;
	
	@FindBy(how= How.ID, using=GENDER_ID  )
	public static WebElement gender;
	
	@FindBy(how= How.ID, using=NUMBER_ID )
	public static WebElement number;
	
	@FindBy(how= How.ID, using=CURRENTADRESS_ID )
	public static WebElement currentadress;
	
	@FindBy(how= How.ID, using=SUBMIT_ID )
	public static WebElement submit; 

	@FindBy(how= How.ID, using=CLOSE_ID )
	public static WebElement close ; 
	/*Methods*/
	public static  void fillfirstname(String firstname ) {
		firstName.sendKeys(firstname );
	}

	public static  void filllasttname(String lastname) {
		lastLame.sendKeys(lastname);
	}

	public static  void fillemail(String emailuser) {
		email.sendKeys(emailuser);
	}
	
	public static  void clickGenderButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", gender);

	}
	
	public static  void fillnumber(String mobile) {
		number.sendKeys(mobile);
	}
	public static  void fillcurrentadress(String adress) {
		currentadress.sendKeys(adress);
	}
	public static  void clickSubmitButton() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", submit);

	}
	public  static void clickCloseButton() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click();", close);
}
	public static void scrennshot( String screenShot1) {
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
    File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

    //String destinationPath = "C:\\Users\\AYMEN\\Desktop\\excelProjet.screenshot.png";

    File destinationFile = new File("C:\\Users\\AYMEN\\Desktop\\screen shot\\"+screenShot1+".png");
    
    		try {
        FileUtils.copyFile(screenshotFile, destinationFile);
        System.out.println("Capture d'écran effectuée avec succès. Chemin du fichier : " + destinationFile.getAbsolutePath());
    } catch (IOException e) {
        System.out.println("Erreur lors de l'enregistrement du screenshot : " + e.getMessage());
    }
}
}