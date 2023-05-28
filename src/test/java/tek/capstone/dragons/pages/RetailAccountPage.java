package tek.capstone.dragons.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	
	public RetailAccountPage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneField;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updateBttn;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement updateMsg;
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement paymentLink;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberField;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expmonthField;
	
	@FindBy(id="expirationYearInput")
	public WebElement expYearField;
	
	@FindBy(id="securityCodeInput")
	public WebElement secCodeInput;
	
	@FindBy(xpath="//button[text()='Add Your card']")
	public WebElement addCardBttn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodMsg;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editBttn;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBttn;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement paymentUpdateMsg;
	
	@FindBy(xpath="//p[@class='account__payment__sub-text']")
	public List<WebElement> cardEndingNum;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement removeBttn;
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement addAddressBttn;
	
	@FindBy(xpath="//button[text()='Add Your Address']")
	public WebElement addAddressBttn2;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressAddMsg;
	
	@FindBy(id="countryDropdown")
	public WebElement countryDropDown;
	
	@FindBy(name="fullName")
	public WebElement addressNameField;
	
	@FindBy(id="phoneNumberInput")
	public WebElement addressPhoneNumber;
	
	@FindBy(name="street")
	public WebElement addressField;
	
	@FindBy(name="city")
	public WebElement cityField;
	
	@FindBy(name="state")
	public WebElement stateDropDown;
	
	@FindBy(id="apartmentInput")
	public WebElement aptNumber;
	
	@FindBy(name="zipCode")
	public WebElement zipCodeField;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement addressEditBttn;
	
	@FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddressBttn;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdateMsg;
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement addressRemoveBttn;
	
	
		
	}
	
