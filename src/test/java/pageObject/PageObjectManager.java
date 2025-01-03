package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	LandingPage landingPage;
	OffersPage offersPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() 
	{
		landingPage = new LandingPage(driver);
		return landingPage;
		
	}
	
	public OffersPage getOffersPage() 
	{
		offersPage = new OffersPage(driver);
		return offersPage;
		
	}



}
