package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PersonalInfo {
	
WebDriver driver;
	
	
	public PersonalInfo(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	By firstname=By.id("agent_fname");
	By lastname=By.id("agent_lname");
	By middleinitial=By.id("agent_mname");
	By social=By.name("agent_ssn");
	By month=By.id("month");
	By day = By.id("day");
	By year = By.id("year");
	By next = By.id("secondNext");
	
public void myname(String fname) {
		
		driver.findElement(firstname).sendKeys(fname);
		
		
	}
	public void next() {
		driver.findElement(next).click();
	}
	
	
	
	
	public void fillPersonalInfo(String fname, String mi, String lname, 
			String ssn, String month, String day, String year) {
		
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(social).sendKeys(ssn);
		driver.findElement(middleinitial).sendKeys(mi);
		
		
		enterDOB("10","23","1984");
	}
	
	public void enterDOB(String mm, String dd, String yyyy) {
		System.out.println(mm+" / "+dd+" / "+yyyy);
		
		Select bm = new Select(driver.findElement(month));
		bm.selectByValue(mm);
		
		Select bd = new Select(driver.findElement(day));
		bd.selectByVisibleText(dd);
		
		Select by = new Select(driver.findElement(year));
		by.selectByVisibleText(yyyy);
		
		
	
	}

}
