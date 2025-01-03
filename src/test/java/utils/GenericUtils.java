package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void SwitchWindowToChild(){
		Set<String>S1 = driver.getWindowHandles();
		Iterator<String>i1 = S1.iterator();
		String parentwindow =  i1.next();
		String Childwindow = i1.next();
		driver.switchTo().window(Childwindow);
		
	}

}
