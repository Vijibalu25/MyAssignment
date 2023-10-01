package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {

	
	public static ChromeDriver driver;
	
	 @BeforeMethod
		public void preCondition()
		{

				driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();

			}
	    @AfterMethod
	    public void postCondition() {
	    	driver.quit();
	    	System.out.println("Test Case is passed");
		}
}
