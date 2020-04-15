package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepInfo {
	WebDriver driver;
	
	
	public RepInfo(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	
	
	By next = By.id("firstNext");
	
	
	 

		public void next() {
			driver.findElement(next).click();
			
		}
}
