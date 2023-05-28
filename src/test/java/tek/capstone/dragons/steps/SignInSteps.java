package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.utilities.CommonUtility;

import tek.capstone.dragons.pages.POMFactory;
public class SignInSteps extends CommonUtility {

	
	POMFactory factory=new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		
		String actualTitle=getTitle();
		String expectedTitle="React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(factory.homepage().tekschoolLogo.isDisplayed());
		logger.info("TekSchool logo is present");
	    
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homepage().SignInBttn);
		logger.info("Sign in button was clicked successfully");
		
	    
	 
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		
		sendText(factory.retailSignInPage().emailInputField,emailValue);
		sendText(factory.retailSignInPage().passInputField,passwordValue);
		logger.info("Email and password were entered successfully");
	   
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.retailSignInPage().loginBttn);
	    logger.info("Login button was clicked successfully");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(isElementDisplayed(factory.homepage().AccountBttn));
		Assert.assertTrue(isElementDisplayed(factory.homepage().logOutOption));
		Assert.assertTrue(isElementDisplayed(factory.homepage().ordersOption));
		logger.info("User was successfully signed into account");
		
	    
	}
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.retailSignInPage().CreateNewAccountBttn);
	    logger.info("Create new Account button was clicked successfully");
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		
		List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
		for(Map<String,String> row:data) {
			
			sendText(factory.retailSignInPage().nameInputField,row.get("name"));
			sendText(factory.retailSignInPage().newEmailField,row.get("email"));
			sendText(factory.retailSignInPage().newPassField,row.get("password"));
			sendText(factory.retailSignInPage().confirmPassField,row.get("confirmPassword"));
			
			logger.info("All user info was entered successfully");
		}
	    
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    click(factory.retailSignInPage().signUpBttn);
	    logger.info("SignUp button was clicked successfully");
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.homepage().AccountBttn);
		Assert.assertTrue(factory.retailSignInPage().profilePic.isDisplayed());
	    logger.info("User was logged in successfully");
		
	    
	}


}
