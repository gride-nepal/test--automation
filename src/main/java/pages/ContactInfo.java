package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
 

public class ContactInfo {
	WebDriver driver;
	
	public ContactInfo(WebDriver args) {
		driver = args;
	}
	
 
	By phone=By.name("agent_phone1");
	By time=By.name("timezone");
	By email=By.name("agent_email");
	By phoneno=By.id("phone2");
	By fax=By.id("phone3");
	By next=By.id("fourthNext");
	
	public void phonenum(String number) {
		driver.findElement(phone).sendKeys(number);
	}
	
	 
	
		public void details(String tm, String mail, String phonen, String faxn) {
			driver.findElement(time).sendKeys(tm);
			driver.findElement(email).sendKeys(mail);
			driver.findElement(phoneno).sendKeys(phonen);
			driver.findElement(fax).sendKeys(faxn);
			
			//tzone("Samoa (UTC-11)");
		}
		 
		public void tzone(String tm) {
		Select tmz= new Select(driver.findElement(time)); 
		 tmz.selectByVisibleText(tm);
		}
		
		public void next() {
		driver.findElement(next).click();
		}
		
	} 

