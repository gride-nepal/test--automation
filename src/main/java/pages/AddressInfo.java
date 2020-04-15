package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressInfo {
	WebDriver driver;

	public AddressInfo(WebDriver args) {
		driver=args;
	
	}
	
	By add= By.id("agent_address1");
	By apart= By.id("agent_address2");
	By city=By.id("agent_city");
	By state=By.id("agent_state");
	By zipp=By.id("agent_zip");
	By nextfive=By.id("fifthNext");
	
	By bypass=By.id("bypass");
	
	
	
	
	
	

	
	
	
	
	public void enterAddress(String street, String apt, String citi, String zip, String state ) {
		driver .findElement(add).sendKeys(street);
		driver.findElement(apart).sendKeys(apt);
		driver.findElement(city).sendKeys(citi);
		
		stateinfo(state);
		
		driver.findElement(zipp).sendKeys(zip);
		
	}
	
	public void stateinfo(String stat) {
	Select sts= new Select(driver.findElement(state)); 
	 sts.selectByVisibleText(stat);
	}
	 
	 
	 public void next() {
			driver.findElement(bypass).click();
			driver.findElement(nextfive).click();
	 }
	 

	

	 

}
