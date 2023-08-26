package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_EditLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balasubramanian");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Viji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Lead");
		WebElement state1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec2 = new Select(state1);
		sec2.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is to check the Edit Functionality");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle()); 
		if (driver.getTitle().contains("CRM"))
		{
			System.out.println("I confirm the title is correct");
		}
		else
		{
			System.out.println("The title is not correct");
		}
		
		
		
		
			
		
	}

}
