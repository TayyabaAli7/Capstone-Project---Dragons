package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homepage().AccountBttn);
		logger.info("Account button was clicked successfully");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameNameValueAndPhonePhoneValue(String name,String phone) {

		clearTextUsingSendKeys(factory.accountpage().nameField);
		clearTextUsingSendKeys(factory.accountpage().phoneField);
		sendText(factory.accountpage().nameField,name);
		sendText(factory.accountpage().phoneField,phone);
		logger.info(name + phone + "info were sent successfully");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {

		click(factory.accountpage().updateBttn);
		logger.info("Update button was clicked successfully");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountpage().updateMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountpage().updateMsg));
		logger.info("User Information sucessfully updated");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountpage().paymentLink);
		logger.info("Payment link was clicked successfully");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {

			sendText(factory.accountpage().cardNumberField, row.get("cardNumber"));
			sendText(factory.accountpage().nameOnCardField, row.get("nameOnCard"));
			selectByValue(factory.accountpage().expmonthField,row.get("expirationMonth"));
			selectByValue(factory.accountpage().expYearField, row.get("expirationYear"));
			sendText(factory.accountpage().secCodeInput, row.get("securityCode"));
			logger.info("Card Information was entered successfully");

		}

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountpage().addCardBttn);
		logger.info("Add your card button was clicked successfully");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMsg) {
		if(expectedMsg.contains("Payment")) {
		waitTillPresence(factory.accountpage().paymentMethodMsg);
		Assert.assertEquals(expectedMsg,factory.accountpage().paymentMethodMsg.getText());
		logger.info(expectedMsg + "is Displayed");}
		else if(expectedMsg.contains("Address")){
			waitTillPresence(factory.accountpage().addressAddMsg);
			Assert.assertEquals(expectedMsg, factory.accountpage().addressAddMsg.getText());
			
		}else if(expectedMsg.contains("Order Placed")) {
			waitTillPresence(factory.orderPage().orderPlacedMsg);
			Assert.assertEquals(expectedMsg,factory.orderPage().orderPlacedMsg.getText());
			logger.info(expectedMsg + "was verified successfully");
		}
			
	}

	@When("User selects the card ending with {string}")
	public void userSelectsTheCardEndingWith(String string) {
	    List<WebElement> cards = factory.accountpage().cardEndingNum;
	    for(WebElement card: cards) {
	    	if(card.getText().contains(string)){
	    		click(card);
	    		logger.info(string + "is clicked");
	    		break;
	    		
	    	}
	    }
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountpage().editBttn);
		logger.info("Edit button was clicked sucessfully");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			clearTextUsingSendKeys(factory.accountpage().cardNumberField);
			clearTextUsingSendKeys(factory.accountpage().nameOnCardField);
			clearTextUsingSendKeys(factory.accountpage().secCodeInput);

			sendText(factory.accountpage().cardNumberField, row.get("cardNumber"));
			sendText(factory.accountpage().nameOnCardField, row.get("nameOnCard"));
			selectByValue(factory.accountpage().expmonthField, row.get("expirationMonth"));
			selectByValue(factory.accountpage().expYearField, row.get("expirationYear"));
			sendText(factory.accountpage().secCodeInput, row.get("securityCode"));

			logger.info("Updated information was added successfully");
		}

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountpage().paymentSubmitBttn);
		logger.info("Update button was clicked successfully");
		slowDown();

	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountpage().paymentUpdateMsg));

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountpage().removeBttn);

	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("Payment details were removed successfully");

	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountpage().addAddressBttn);
		logger.info("Add Address Button was clicked successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressWithInfo(DataTable datatable) {
		

		List<Map<String, String>> data = datatable.asMaps(String.class, String.class);

		for (Map<String, String> row : data) {
			selectByVisibleText(factory.accountpage().countryDropDown,row.get("country"));
			sendText(factory.accountpage().addressNameField, row.get("fullName"));
			sendText(factory.accountpage().addressPhoneNumber, row.get("phoneNumber"));
			sendText(factory.accountpage().addressField, row.get("streetAddress"));
			sendText(factory.accountpage().aptNumber,row.get("apt"));
			sendText(factory.accountpage().cityField, row.get("city"));
			selectByVisibleText(factory.accountpage().stateDropDown, row.get("state"));
			sendText(factory.accountpage().zipCodeField, row.get("zipCode"));
			logger.info("User information was entered successfully");

		}
	}

	@When("User click Add Your Address button")
	public void userClickOnAddAddressButton() {
		click(factory.accountpage().addAddressBttn2);
		logger.info("Address Button clicked successfully");

	}

	

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountpage().addressEditBttn);
		logger.info("Edit button clicked successfully");
	}

	@When("user edit address form with below information")
	public void userEditAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			clearTextUsingSendKeys(factory.accountpage().addressNameField);
			clearTextUsingSendKeys(factory.accountpage().addressPhoneNumber);
			clearTextUsingSendKeys(factory.accountpage().addressField);
			clearTextUsingSendKeys(factory.accountpage().cityField);
			clearTextUsingSendKeys(factory.accountpage().zipCodeField);
			selectByVisibleText(factory.accountpage().countryDropDown, row.get("country"));
			sendText(factory.accountpage().addressNameField, row.get("fullName"));
			sendText(factory.accountpage().addressPhoneNumber, row.get("phoneNumber"));
			sendText(factory.accountpage().addressField, row.get("streetAddress"));
			sendText(factory.accountpage().cityField, row.get("city"));
			sendText(factory.accountpage().aptNumber,row.get("apt"));
			selectByVisibleText(factory.accountpage().stateDropDown, row.get("state"));
			sendText(factory.accountpage().zipCodeField, row.get("zipCode"));
			logger.info("User information was edited successfully");

		}

	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountpage().updateAddressBttn);
		logger.info("Update address button was clicked successfully");

	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountpage().addressUpdateMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountpage().addressUpdateMsg));
		logger.info("Address updated successfully message displayed");

	}
	   @When("User click on remove option of Address section")
	   public void clickOnRemoveOption() {
		   click(factory.accountpage().addressRemoveBttn);
		   logger.info("Remove address button was clicked successfully");
	   }
	   @Then("Address details should be removed")
	   public void adressDetailsRemovedConfirm() {
		   Assert.assertTrue(isElementDisplayed(factory.accountpage().addAddressBttn));
		   logger.info("Address details were removed successfully");
		   
		   
	   }

}
