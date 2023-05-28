package tek.capstone.dragons.pages;

import tek.capstone.dragons.steps.RetailOrderSteps;

public class POMFactory {
	
	private RetailSignInPage retailSignInPage;
	private RetailHomePage homepage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	
	
	public POMFactory() {
		this.retailSignInPage=new RetailSignInPage();
		this.homepage=new RetailHomePage();
		this.accountPage=new RetailAccountPage();
		this.orderPage=new RetailOrderPage();
	}
    
	public RetailSignInPage retailSignInPage() {
		return this.retailSignInPage;
	}
	public RetailHomePage homepage() {
		return this.homepage;
	}
	public RetailAccountPage accountpage() {
		return this.accountPage;
	}
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
}
