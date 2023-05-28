package tek.capstone.dragons.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		selectByVisibleText(factory.orderPage().allDepartmentDropdown, smartHome);
		logger.info(smartHome + " button was clicked successfully");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.homepage().searchField, kasaOutdoorSmartPlug);
		logger.info(kasaOutdoorSmartPlug + "text was send successfully");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homepage().searchBttn);
		logger.info("Search button was clicked successfully");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.orderPage().plugImg);
		logger.info("Item was clicked on successfully");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().qtyDropdown,itemQty);
		logger.info("Quantity of item was selected successfully");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartBttn);
		logger.info("Add to cart button was clicked successfully");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQty) {
		waitTillPresence(factory.orderPage().cartQty);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cartQty));
		logger.info("Cart quantity changed successfully to 2");
		click(factory.orderPage().cartQty);
		click(factory.orderPage().deleteBttn);
	}

	

	@When("User search for an item Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String apexLegends) {
		sendText(factory.homepage().searchField, apexLegends);
		logger.info("Apex Legends text was searched");

	}
	@When("User clicks on item")
	public void userClicksOnItem() {
		click(factory.orderPage().apexLegends);
		logger.info("Apex Legends was clicked on successfully");
	}


	@When("User select Apex Legends quantity {string}")
	public void userSelectsQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().qtyDropdown,itemQty);
		logger.info( itemQty +"was selected successfully");

	}

	@Then("the cart icon quantity Apex Legends should change to {string}")
	public void theCartIconQuantityShouldChange(String expectedQty) {
		
		Assert.assertEquals(expectedQty,factory.orderPage().cartQty2.getText());
		logger.info(expectedQty + "was validated successfully");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartOption);
		logger.info("Cart option was clicked successfully");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().checkoutOption);
		logger.info("Proceed to checkout button was clicked successfully");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeOrder);
		logger.info("Place your order button was clicked successfully");

	}

	

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homepage().ordersOption);
		logger.info("Orders section was clicked successfully");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().itemInOrder);
		logger.info("Item was clicked on successfully");

	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBttn);
		logger.info("Cancel button was clicked successfully");

	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String cancellationReason) {
		selectByVisibleText(factory.orderPage().returnDropdown,cancellationReason );
		logger.info("Bought wrong item field was selected from dropdown");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderBttn);
		logger.info("Cancel order button was clicked successfully");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String message) {
		waitTillPresence(factory.orderPage().orderCancelMsg);
		Assert.assertEquals(message,factory.orderPage().orderCancelMsg.getText());
		logger.info(message + "was displayed");
		

	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		
		
		click(factory.orderPage().buyAgainBttn);
		click(factory.orderPage().placeOrder);
		click(factory.homepage().ordersOption);
		click(factory.orderPage().returnBttn);
		logger.info("Return button was clicked successfully");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String message) {
		selectByVisibleText(factory.orderPage().returnDropdown, message);
		logger.info("Item damaged option was selected with success");

	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String option) {
		selectByVisibleText(factory.orderPage().dropoffDropdown, option);
		logger.info("Drop off service was selected as FedEx successfully");

	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBttn);
		logger.info("Return order button was clicked successfully");
	}

	@Then("a cancelation message should be displayed as {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String message) {
		waitTillPresence(factory.orderPage().returnOrderMsg);
		Assert.assertEquals(message,factory.orderPage().returnOrderMsg.getText());
		logger.info("Cancelation message" + message + "was displayed successfully");

	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBttn);
		logger.info("Review button was clicked successfully");

	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline,String review) {
		sendText(factory.orderPage().headlineField, "Cool game");
		sendText(factory.orderPage().descriptionField,
				"Really enjoyed playing the game, will recommend to all my friends");
		logger.info("Review text was sent succesfully");
	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReviewBttn);
		logger.info("Review button was clicked successfully");

	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String message) {
		waitTillPresence(factory.orderPage().reviewMsg);
		Assert.assertEquals(message,factory.orderPage().reviewMsg.getText());
		logger.info("Review was posted successfully");

	}

}
