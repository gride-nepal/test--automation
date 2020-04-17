package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleResult {
	WebDriver driver;

	public GoogleResult(WebDriver args) {
		driver=args;
	
	}
	
	By resultCount= By.id("result-stats");
	
	
	public String getResultCount() {
		
		 String fullResultText = driver.findElement(resultCount).getText();
		 
		 
		 return fullResultText.substring(0, 5);

	}
	
//	public void serachKeyword(String keyword) {
//		driver.findElement(searchField).sendKeys(keyword);
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(submitButton)));
//		driver.findElement(submitButton).click();
//		
//	}

	 

}
