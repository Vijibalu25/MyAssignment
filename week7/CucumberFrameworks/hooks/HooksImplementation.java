package hooks;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import week5.Day1.testcases.BaseClass;

public class HooksImplementation extends BaseClass {
	
    @Before
	public void preCondition()
	{

			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();

		}
    @After
    public void postCondition() {
    	driver.quit();
    	System.out.println("Test Case is passed");
	}

}
