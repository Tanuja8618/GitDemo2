package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.OffersPage;
import pageObject.PageObjectManager;
import utils.TestContextSetup;

public class OffersPageStepDefinition {
	public String offersPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	
	@Then("User search for {string} shortnmae in offerpage")
	public void user_search_for_shortnmae_in_offerpage(String shortname) throws InterruptedException {
		
		SwitchToOffersPage();
		OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
		offersPage.Searchitem(shortname);
		Thread.sleep(2000);
		offersPageProductName = offersPage.getProductName();
	}
		
		public void SwitchToOffersPage() 
		{
			LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
			landingPage.selectTopDealsPage();
			testContextSetup.genericUtils.SwitchWindowToChild();
		}
		    

	@Then("Validate product name in offerpage matches with landing page")
	public void validate_product_name_in_offerpage_matches_with_landing_page() {
	    Assert.assertEquals(offersPageProductName, testContextSetup.landingPageProductName);
	}

}
