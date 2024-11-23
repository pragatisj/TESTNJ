import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnotation {
	@Test
	public void amazon() {
//		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.amazon.in/");
		System.out.println("Amazon");
	}
	
	@Test
	public void flipcard() {
//		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver1.get("https://www.flipkart.com/");
		System.out.println("Filpcard");
	}
	
	@BeforeMethod               
	public void test3() {
//		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
//		FirefoxDriver driver2 = new FirefoxDriver();
//		driver2.get("https://www.meesho.com/");	
		System.out.println("Before method--Meesho");
	}
	
	@AfterClass                          //runs mtd after each test mtd
	public void test4() {                                 
//		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
//		FirefoxDriver driver3 = new FirefoxDriver();
//		driver3.get("https://www.google.com/");
		System.out.println("After class--Google");
	}
	
	@BeforeTest
	public void beforeTest() {
//		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
//		FirefoxDriver driver4 = new FirefoxDriver();
//		driver4.get("https://www.facebook.com/");
		System.out.println("Before Test--facebook");	
	}
	
	@AfterTest 
	public void afterTest() {
		System.out.println("After test");		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");				
	}
	

}
