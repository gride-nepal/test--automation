package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegType {
	
WebDriver driver;
	
	
	public RegType(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	
	By repType=By.id("reptype");
	By next=By.id("rtNext");
	
	
	 public void regtype(String repoption) {
		 Select reg= new Select(driver.findElement(repType));
		 reg.selectByValue(repoption);
	 }
	 
	 public void next() {
			driver.findElement(next).click();
	 }

}
