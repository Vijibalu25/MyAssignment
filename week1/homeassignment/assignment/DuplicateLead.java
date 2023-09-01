package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Find Leads']")).click();
		
		
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("vijibalu2225@gmail.com");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		//Capture name of First Resulting lead
		String firstname = driver.findElement(By.xpath("//td[contains(@class,'firstName')]//a[@class='linktext']")).getText();
		System.out.println("Printing the First Lead ID name :" +firstname);
		
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'firstName')]//a[@class='linktext']")).click();
		
		//Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead"))
			
		{
			System.out.println("Verify the Title : " +title);
		}
		else
		{
			System.out.println("Invalid Title" +title);
		}
		
		//Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(3000);
		//Confirm the duplicated lead name is same as captured name
		String verifyduplicatename = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(verifyduplicatename);
				
		if(verifyduplicatename==firstname)

		{
			System.out.println("Verified: duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("Verified: duplicated lead name is not same as captured name");
		}
		
	}

}
