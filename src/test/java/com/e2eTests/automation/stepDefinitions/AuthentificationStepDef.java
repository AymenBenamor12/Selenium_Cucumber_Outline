package com.e2eTests.automation.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.utils.CommondMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AuthentificationStepDef extends CommondMethods {
	
public WebDriver driver;
private AuthentificationPage authentificationPage = new AuthentificationPage();
private CommondMethods commonMethods = new CommondMethods();
public AuthentificationStepDef() {
	driver = Setup.driver; //driver de cette classe egale driver de Setup
	PageFactory.initElements(driver, AuthentificationPage.class);
}

@Given("^je me connecte sur l'application demoqa$")
public void jeMeConnecteSurLApplicationDemoqa() throws Throwable {
	logger.info("je me connecte sur l'application demoqa");
	commonMethods.openURLWithConfigFile("url1");
}

@When("^je saisie le firstnom d'utilisateur \"([^\"]*)\"$")
public void jeSaisieLeFirstnomDUtilisateur(String name) throws Throwable {
	logger.info("je saisie le firstnom d'utilisateur"); 
	AuthentificationPage.fillfirstname(name);
}

@When("^je saisie le lastname de l'utilisateur \"([^\"]*)\"$")
public void jeSaisieLeLastnameDeLUtilisateur(String lastname) throws Throwable {
	logger.info("je saisie le lastname de l'utilisateur");
	AuthentificationPage.filllasttname(lastname);
}

@When("^je saisie le email de l'utilisateur \"([^\"]*)\"$")
public void jeSaisieLeEmailDeLUtilisateur(String email) throws Throwable {
	logger.info("je saisie le email de l'utilisateur");
	AuthentificationPage.fillemail(email);
}

@When("^je clique sur le genderMale$")
public void jeCliqueSurLeGenderMale() throws Throwable {
	logger.info("je clique sur le genderMale");
	AuthentificationPage.clickGenderButton();
}

@When("^je saisie le mobile de l'utilisateur \"([^\"]*)\"$")
public void jeSaisieLeMobileDeLUtilisateur(String mobile) throws Throwable {
	logger.info("je saisie le mobile de l'utilisateur");
	AuthentificationPage.fillnumber(mobile);
}

@When("^je saisie le address de l'utilisateur \"([^\"]*)\"$")
public void jeSaisieLeAddressDeLUtilisateur(String adress) throws Throwable {
	logger.info("je saisie le address de l'utilisateur");
	AuthentificationPage.fillcurrentadress(adress);
}

@When("^je clique sur submitBtn$")
public void jeCliqueSurSubmitBtn() throws Throwable {
	logger.info("je clique sur submitBtn");
	AuthentificationPage.clickSubmitButton();
}
@When("^je prend un sreenshot \"([^\"]*)\"$")
public void jePrendUnscreenshot(String screenShot ) throws Throwable {
	logger.info("je prend un sreenshot");
	AuthentificationPage.scrennshot(screenShot);
}
@When("^je clique sur closebtn$")
public void jeCliqueSurClosebtn() throws Throwable {
	AuthentificationPage.clickCloseButton();
}
@Then("^je me redirige vers la plage home$")
public void jeMeRedirigeVersLaPlageHome() throws Throwable {
    
}
}

