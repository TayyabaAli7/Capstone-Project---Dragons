package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="search")
	public WebElement allDepartmentDropdown;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement plugImg;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement qtyDropdown;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartBttn;
	
	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement cartQty;
	
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement plugAndOutletBttn;
	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronicsText;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement computersText;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeText;
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sportsText;
	
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement automativeText;
	
	@FindBy(xpath="//span[text()='Video Games']")
	public WebElement videoGames;
	
	@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegends;
	
	@FindBy(xpath="//span[text()='5']")
	public WebElement cartQty2;
	
	@FindBy(id="cartBtn")
	public WebElement cartOption;
	
	@FindBy(xpath="//button[text()='Proceed to Checkout']")
	public WebElement checkoutOption;
	
	@FindBy(xpath="//button[text()='Place Your Order']")
	public WebElement placeOrder;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMsg;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement itemInOrder;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkbox;
	
	@FindBy(id="cancelBtn")
	public WebElement cancelBttn;
	
	@FindBy(id="reasonInput")
	public WebElement returnDropdown;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement showDetails;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderBttn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelMsg;
	
	@FindBy(xpath="//button[@id='returnBtn']")
	public WebElement returnBttn;
	
	@FindBy(css="select#dropOffInput")
	public WebElement dropoffDropdown;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnOrderBttn;
	
	@FindBy(xpath="//div[@class='return__confirm-message']//p")
	public WebElement returnOrderMsg;
	
	@FindBy(xpath="//button[text()='Review']")
	public WebElement reviewBttn;
	
	@FindBy(id="headlineInput")
	public WebElement headlineField;
	
	@FindBy(id="descriptionInput")
	public WebElement descriptionField;
	
	@FindBy(xpath="//button[text()='Add Your Review']")
	public WebElement addReviewBttn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewMsg;
	
	@FindBy(xpath="//span[text()='Delete']")
	public WebElement deleteBttn;
	
	@FindBy(xpath="//button[text()='Buy again']")
	public WebElement buyAgainBttn;
	
	
}
