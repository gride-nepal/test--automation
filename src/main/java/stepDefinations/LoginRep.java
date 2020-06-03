package stepDefinations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleHome;
import pages.GoogleResult;

public class LoginRep {
	WebDriver driver;

	@Before
	public void setVariable() {
//		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver");
//		 driver= new ChromeDriver();
//		 System.out.println("BEFORE METHOD");
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	@Given("^a user is on landing page$")
	public void a_user_is_on_landing_page() throws SQLException, ClassNotFoundException{
		 //Load mysql jdbc driver		
   	    Class.forName("com.mysql.cj.jdbc.Driver");
		//Connecting to database
		Connection con = DriverManager.getConnection("jdbc:mysql://3.12.28.169:3306/ssoapp", "qa-user", "ssouser@123!");
		
		if(con != null) {
			System.out.println("Database connected "+con);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT verification_code FROM sso_users WHERE email =  'hellofromcts@gmail.com';");
			System.out.println("Results: "+rs);
			
			System.out.println("Records: "+rs.getRow());
			while (rs.next()){
        		String verificationcode = rs.getString(1);								        
                			                               
                System. out.println("Code: "+verificationcode);		
        }
		}
	//	driver.get("https://www.google.com");
	//	driver.get("https://premierenroll.com");
	//	driver.manage().window().maximize();
	}
	
	
	@When("^a user search for ([^\"]*)$")
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
