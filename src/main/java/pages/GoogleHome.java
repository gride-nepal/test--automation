package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHome {
	WebDriver driver;

	public GoogleHome(WebDriver args) {
		driver=args;
	
	}
	
	By searchField= By.name("q");
	By submitButton = By.name("btnK");
	
	public void serachKeyword(String keyword) {
		driver.findElement(searchField).sendKeys(keyword);
		driver.findElement(searchField).sendKeys(Keys.ENTER);

		
	}

	 

}
