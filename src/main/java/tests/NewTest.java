//package tests;
//
//import org.testng.annotations.Test;
//
//import pages.AddressInfo;
//import pages.BusinessInfo;
//import pages.ContactInfo;
//import pages.Landing;
//import pages.PaymentInfo;
//import pages.PersonalInfo;
//import pages.RegType;
//import pages.RepInfo;
//import pages.Signature;
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//
//public class NewTest {
//	
//	 
//	 WebDriver driver;
//	
//  @Test
//  public void f() throws InterruptedException {
//	  Landing landing = new Landing(driver);
//		landing.accesscode("NENY0000");
//		landing.submitAgentCode();
//		landing.submitAgent();
//		landing.registerRep();
//		Thread.sleep(5000);
//		
//		RepInfo repInfo = new RepInfo(driver);
//		repInfo.next();
//		Thread.sleep(5000);
//		
//		PersonalInfo personalInfo = new PersonalInfo(driver);
//		personalInfo.fillPersonalInfo("Test", "","Test","123454676","10", "23", "1984");
//		personalInfo.next();
//		Thread.sleep(5000);
//	  
//  }
//  
//  @Test
//  public void contact_info() throws InterruptedException {
//	  ContactInfo contactInfo=new ContactInfo(driver);
//		contactInfo.phonenum("7890008789");
//		contactInfo.details("","saaw@go.com", "34567", "567889");
//		contactInfo.tzone("Samoa (UTC-11)");
//		contactInfo.next();
//		Thread.sleep(5000);
//		
//		AddressInfo addressInfo =new AddressInfo(driver);
//		addressInfo.enterAddress("37873", "2353", "34353", "76556767","Ohio (OH)");
//		addressInfo.stateinfo("Ohio (OH)");
//		addressInfo.next();
//		Thread.sleep(5000); 
//  }
//
//  @Test
//  public void reg_info() throws InterruptedException {
//	  RegType regType = new RegType(driver);
//		regType.regtype("Individual");
//		regType.next();
//		Thread.sleep(5000);
//		
//		BusinessInfo businessInfo = new BusinessInfo(driver);
//		businessInfo.next();
//		Thread.sleep(5000);
//  }
//  
//  
//  
//  @Test
//  public void payment_info() throws InterruptedException {
//	  PaymentInfo paymentInfo = new PaymentInfo(driver);
//		paymentInfo.payTo("Individual");
//		paymentInfo.paymentInfo("042000013", "6743647", "987483", "");
//		paymentInfo.next();
//		Thread.sleep(5000);
//  }
//  
//  @Test
//  public void verify_login_funcation() {
//		Signature signature = new Signature(driver);
//		String verificationCode = signature.retriveVerificationCode();
//		signature.enterVerificationCode(verificationCode);
//  }
//  
//  
//  
//  
//  @BeforeMethod
//  public void beforeMethod() {
//	  
//	  System.out.append("BEFORE METHOD");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.append("AFTER METHOD");
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	  System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver");
//	  driver = new ChromeDriver();
//	  driver.get("https://premierenroll.com");
//		driver.manage().window().maximize();
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//}
