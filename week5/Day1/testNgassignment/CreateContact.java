package week5.Day1.testNgassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	
	
	public  void createcontact() {
		
		
		//Click on contacts Button
		driver.findElement(By.xpath("//div[@class='x-panel-tc']//a[text()='Contacts']")).click();
		
		//Click on Create Contact
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Create Contact']")).click();
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Vijayalakshmi");
		
		//Enter LastName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Balasubramanian");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.name("firstNameLocal")).sendKeys("Viji");
		
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.name("lastNameLocal")).sendKeys("Balu");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is to check to Create Contact functionality");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vijibalu2225@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		Select state = new Select(driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")));
		state.selectByVisibleText("New York");
		
		//Click on Create Contact
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		
		//Click on edit button 
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("This is to check the Edit Functionality");
		
		// Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the Title of Resulting Page
	    System.out.println("The title of this page is :" +driver.getTitle());
		
	}

}
