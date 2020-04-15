package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signature {
	
	WebDriver driver;
	
	public Signature(WebDriver args) {
		driver = args;
	}
	
	By verificationCode = By.tagName("mark");
	By codeInput  = By.id("vcode");
	
	
	
	public String retriveVerificationCode() {
		
		return driver.findElement(verificationCode).getText();
		
		/*
		WebElement xyz = driver.findElement(verificationCode);
		String code = xyz.getText();
		
		return code;
		*/
		
		
	}
	
	public void enterVerificationCode(String code) {
		driver.findElement(codeInput).sendKeys(code);
	}
	
	

}
