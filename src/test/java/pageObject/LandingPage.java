package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By Search = By.xpath("//input[@type='search']");
	By ProductName = By.cssSelector("h4.product-name");
	By TopDeals = By.linkText("Top Deals");
	
	public void Searchitem(String name) {
		driver.findElement(Search).sendKeys(name);
		}
	
	public void getSearchText() {
		driver.findElement(Search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(ProductName).getText();
	}
	
	public void selectTopDealsPage() {
		driver.findElement(TopDeals).click();
	}

	

}
