package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentInfo {
WebDriver driver;
	
	
	public PaymentInfo(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	
	By ach=By.id("radioExample3");
	
	By routingno=By.id("broker_routing_num");
	By bankname=By.id("broker_bank_name");
	By accountno=By.id("broker_acct_num");
	By bankaccount=By.id("broker_bank_acct");
	By next=By.id("seventhNext");
	
	By payTo=By.name("payto");
	
	
	
	
	 public void payTo(String paytype) {
		 
		List<WebElement> payToRadios =  driver.findElements(payTo);
		
		for(WebElement payto : payToRadios) {
			if(payto.getAttribute("value").equalsIgnoreCase(paytype)) {
				payto.click();
			}
		}

		 driver.findElement(ach).click();
	 }
	 public void paymentInfo(String R,  String An, String Nba, String C) throws InterruptedException {
		 driver.findElement(routingno).sendKeys(R);
		 driver.findElement(bankname).click();
		 driver.findElement(accountno).sendKeys(An);
		 driver.findElement(bankaccount).sendKeys(Nba);
		
		
		 
		 
	 }
	 
	 public void next() {
		 driver.findElement(next).click();
		 
	 }
}
