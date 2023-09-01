package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	 //Launch the browser
	    driver.get("http://leaftaps.com/opentaps/control/main");
	 
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click Leads Link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Find Leads']")).click();
		
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(2000);
		//Enter phone number
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9500768884");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		//Capture lead ID of First Resulting lead
		String leadid = driver.findElement(By.xpath("//td[contains(@class,'partyId')]//a[@class='linktext']")).getText();
		System.out.println("Lead is : " +leadid);
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'partyId')]//a[@class='linktext']")).click();
		
		//Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(3000);
		//Click Find leads
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Find Leads']")).click();
		
		//Enter captured lead ID
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadid);
		Thread.sleep(3000);
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		//String result = driver.findElement(By.className("x-paging-info")).getText();
		String result = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(result);
	
		if(result.contains("No records to display"))
		{
			System.out.println("Verified: Lead has been deleted Sucessfully");
		}
		else
		{
			System.out.println("Verfied: Test has been failed to delete the delete");
		}
		
		Thread.sleep(2000);
		
		//Close the browser (Do not log out)
		driver.close();
		
		
		

}

}