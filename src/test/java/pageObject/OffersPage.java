package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	private By Search = By.xpath("//input[@type='search']");
	private By ProductName = By.cssSelector("tr td:nth-child(1)");
	
	
	public void Searchitem(String name) {
		driver.findElement(Search).sendKeys(name);
		}
	
	public void getSearchText() {
		driver.findElement(Search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(ProductName).getText();
	}
	
	

}
