package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	
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
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'partyId')]//a[@class='linktext']")).click();
		Thread.sleep(2000);
		
		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
        
		//Click Edit
		driver.findElement(By.xpath("//div[text()='Lead']/following::a[text()='Edit']")).click();
		
		//Change the company name
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Natwest");
		 System.out.println("Change the company name");
	
		
		//Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Print the updated company Name :" +companyname);
		
		if(companyname.contains("Natwest"))
		{
			System.out.println("Updated Succesfully");
		}
		else
		{
			System.out.println("Not Updated");
			
		}
		
		//Close the browser (Do not log out)
		driver.close();
		
}
}