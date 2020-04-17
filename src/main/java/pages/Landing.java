package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Landing {

	WebDriver driver;
	
	
	public Landing(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	
	By agentName = By.className("mb-none");
	By accessCodeField = By.id("search_acode");
	By submitAgentCode = By.id("submit_agentcode");
	By submitcode = By.id("submit_Agent");
	
	By repRegisteration = By.linkText("Rep Registration");
	
	
	public void accesscode(String code) {
		driver.findElement(accessCodeField).sendKeys(code);

	}
	public void submitAgentCode() {
		driver.findElement(submitAgentCode).click();
	}
	public String validateAgentName() {
		
		String str = driver.findElement(agentName).getText();
		return str;
	}
	
	 public void submitAgent() {
		 driver.findElement(submitcode).click();
	 }
	
		public void registerRep() {
			
			driver.findElement(repRegisteration).click();
		}
		
	
} 

		
		
	

