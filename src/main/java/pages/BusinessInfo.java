package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusinessInfo {
WebDriver driver;
	
	
	public BusinessInfo(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	By bypass=By.id("bypass1");
	By next=By.id("sixthNext");
	
	
	public void next() {
		 driver.findElement(bypass).click();
		 
		 driver.findElement(next).click();
}
}
