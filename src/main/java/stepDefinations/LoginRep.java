package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleHome;
import pages.GoogleResult;
import pages.Landing;

public class LoginRep {
	WebDriver driver;

	@Before
	public void setVariable() {
		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver");
		 driver= new ChromeDriver();
		 System.out.println("BEFORE METHOD");
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	@Given("^a user is on landing page$")
	public void a_user_is_on_landing_page(){
		
		driver.get("https://www.google.com");
	//	driver.get("https://premierenroll.com");
		driver.manage().window().maximize();
	}
	
	
	@And("^a user search for ([^\"]*)$")
	public void a_user_search_for(String keyword){
		
		GoogleHome gh = new GoogleHome(driver);
		gh.serachKeyword(keyword);
	}


	@Then("^a user lands on result page and verify ([^\"]*)$")
	public void a_user_lands_on_result_page_and_verify(String agentName) throws InterruptedException {
	GoogleResult gr = new GoogleResult(driver);
		String actual = gr.getResultCount();
	
		Assert.assertEquals(actual, agentName);
	}


}
