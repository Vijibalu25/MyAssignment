package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
	
	@When("Click on Leads link")
	public void clickonleadslink() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click on CreateLead link")
	public void clickoncreateleadlink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the companyname as (.*)$")
	public void enterthecompanyname(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("Enter the firstname as (.*)$")
	public void enterthefirstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@Given("Enter the lastname as (.*)$")
	public void enterthelastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@When("Click on submit Button")
	public void clickonsubmitbutton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("View leads page should be displayed")
	public void viewleadspage() {
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("Test case is passed" +title);
		}
		else
		{
			System.out.println("Test Case is failed" +title);
		}
	}
}
