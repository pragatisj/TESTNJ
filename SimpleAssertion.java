import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class SimpleAssertion {

	public void assertionFunction() {
		System.setProperty("webdriver.Firefox.driver","C:\\Selenium Jar\\FireFoxJars\\geckodriver-v0.35.0-win-aarch64");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Change Language Settings";
		Assert.assertEquals(ActualTitle, ExpectedTitle);		
	}
}
