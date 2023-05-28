package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage(){
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	
	@FindBy(id="email")
	public WebElement emailInputField;
	
	@FindBy(id="password")
	public WebElement passInputField;
	
	@FindBy(id="loginBtn")
	public WebElement loginBttn;
	
	
	@FindBy(linkText="Create New Account")
	public WebElement CreateNewAccountBttn;
	
	@FindBy(id="nameInput")
	public WebElement nameInputField;
	
	@FindBy(id="emailInput")
	public WebElement newEmailField;
	
	@FindBy(id="passwordInput")
	public WebElement newPassField;

	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassField;
	
	@FindBy(id="signupBtn")
	public WebElement signUpBttn;

	@FindBy(xpath="//img[@alt='profile pic']")
	public WebElement profilePic;
	

		
		
	}
	
	
	

