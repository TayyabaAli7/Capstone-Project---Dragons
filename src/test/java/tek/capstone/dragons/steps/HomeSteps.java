package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homepage().allSection);
		logger.info("All section department was clicked successfully");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {

		List<List<String>> optionsToDisplay = dataTable.asLists(String.class);
		
		for(List row:optionsToDisplay) {
			Assert.assertEquals(row.get(0),factory.homepage().electronicsOption.getText());
			Assert.assertEquals(row.get(1),factory.homepage().computersOption.getText());
			Assert.assertEquals(row.get(2),factory.homepage().smartHomeOption.getText());
			Assert.assertEquals(row.get(3),factory.homepage().sportsOption.getText());
			Assert.assertEquals(row.get(4),factory.homepage().automativeOpt.getText());
			logger.info("Electronics,Computers,SmartHome,Sports and Automative options are present");
		}
		
	}
		
		
		
	

	@When("User on {string}")
	public void userOn(String string) {
		List<WebElement> departments=factory.homepage().allDepartments;
		for(WebElement elements:departments) {
			elements.click();
			break;
			
		}
		
		
		

	}

	
        
		@Then("below options are present in department")
		public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		  List<List<String>> depts = dataTable.asLists(String.class);
		  List<WebElement> options =factory.homepage().allDepartments;
		  for(int i=0; i<depts.get(0).size();i++) {
			  for(WebElement elements : options) {
				  if(elements.getText().equals(depts.get(0).get(i))) {
					  Assert.assertTrue(elements.isDisplayed());
					  logger.info(elements.getText()+ "is present");
				  }
			  }
		  }
        

	}

}
