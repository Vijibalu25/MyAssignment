package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	
//	
//	@Given("Launch the browser")
//	public void launchBrowser()
//	{
//		driver = new ChromeDriver();
//	}
//	
//	@And("load the URL")
//	public void loadURL()
//	{
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();
//	}

	@And("Enter the username as {string}")
	public void enterUsername(String uName)
	{
		
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	

	@And("Enter the password as {string}")
	public void enterPassword(String pWord)
	{
		
        driver.findElement(By.id("password")).sendKeys(pWord);
	
	}
	
	@When("Click on Login button")
	public void ClickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomepage()
	{
		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Leaftaps")) {
			System.out.println("HomePage is Displayed :"+text);
		}
		else
		{
			System.out.println("Hoempage is not displayed :" +text);
		}
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage()
	{
		String text1 = driver.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']")).getText();
		if(text1.contains("User not found"))
		{
			System.out.println("Test Case is passed :" +text1);
		}
		else
		{
			System.out.println("Test case is failed :" +text1);
		}
		
	}
	
	@When("Click on CRMSFA link")
	public void clickoncrmsfa() {
		driver.findElement(By.partialLinkText("CRM")).click();
	}
	
	}


