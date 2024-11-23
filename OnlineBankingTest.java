import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlineBankingTest {
    @BeforeSuite
    public void beforeSuite() {
        // This runs once before all tests
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
//        System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.example-bank.com");
        System.out.println("Before Test: Browser opened and navigated to the banking website");
    }

    @BeforeMethod
    public void setUp() {
        // This runs before each test method
    //    driver.get("https://www.example-bank.com/login");
        System.out.println("Before Method: Navigated to ");
    }

    @Test
    public void login() {
        // Test case for logging in
        // Here you would add code to enter login credentials and submit the form
        System.out.println("Login" );
    }

    @Test
    public void checkBalance() {
        // Test case for checking account balance
        // Assume the user is already logged in
      //  driver.get("https://www.example-bank.com/account");
        System.out.println("Check Balance" );
       
    }

    @Test
    public void transferFunds() {
        // Test case for transferring funds
        // Assume the user is already logged in
      //  driver.get("https://www.example-bank.com/transfer");
        System.out.println("Transfer Funds " );
        
    }

    @AfterClass
    public void afterTest1() {
        // This runs after all test methods in the current class
      //  driver.quit();
        System.out.println("After Class: Browser closed");
    }

    @AfterTest
    public void afterTest() {
        // This runs after all test methods in the test class
        System.out.println("After Test: Test execution finished");
    }
}



