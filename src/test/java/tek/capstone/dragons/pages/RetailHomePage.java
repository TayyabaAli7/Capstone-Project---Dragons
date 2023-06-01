package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;

	@FindBy(linkText = "Sign in")
	public WebElement SignInBttn;

	@FindBy(linkText = "Account")
	public WebElement AccountBttn;

	@FindBy(xpath="//a[text()='Orders']")
	public WebElement ordersOption;

	@FindBy(id = "logoutBtn")
	public WebElement logOutOption;

	@FindBy(id = "searchInput")
	public WebElement searchField;

	@FindBy(id = "searchBtn")
	public WebElement searchBttn;

	@FindBy(xpath = "//span[text()='All']")
	public WebElement allSection;

	@FindBy(xpath = "//div[@class='sidebar_content-item']")
	public List<WebElement> allDepartments;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsOption;

	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computersOption;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHomeOption;

	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportsOption;

	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automativeOpt;

	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement tvAndVideoOption;
	
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGamesOpt;
	
	@FindBy(xpath="//span[text()='Accessories']")
	public WebElement accessoriesOpt;
	
	@FindBy(xpath="//span[text()='Networking']")
	public WebElement networkingOpt;
	
	@FindBy(xpath="//button[@id='submenuBtn']")
	public WebElement mainMenu;
	
	@FindBy(xpath="//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLightning;
	
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlet;
	
	@FindBy(xpath="//span[text()='Athletic Clothing']")
	public WebElement atlethicClothing;
	
	@FindBy(xpath="//span[text()='Exercise & Fitness']")
	public WebElement exerciseAndFitness;
	
	@FindBy(xpath="//span[text()='Automative Parts & Accessories']")
	public WebElement automativeParts;
	
	@FindBy(xpath="//span[text()='MotorCycle & Powersports']")
	public WebElement motorcycleAndPower;
	
	
	
}

