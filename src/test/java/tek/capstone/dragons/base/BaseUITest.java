package tek.capstone.dragons.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.dragons.utilities.CommonUtility;

public class BaseUITest extends CommonUtility {	@Before
	
	public void setupTests() {
		super.setupBrowser();
	}
	
    @After
    public void closeTests(Scenario scenario) {
    	//We need to write our code to check and see if Scenario is failed,
    	//it should take a screenshot and attach it to our test report
    	
    	if(scenario.isFailed()) {
    		byte[] screenshot=takeScreenShotAsBytes();
    		scenario.attach(screenshot, "image/png", scenario.getName()+ "scenario failed");
    	}
    	super.quitBrowser();
    	
    	
    }
}



