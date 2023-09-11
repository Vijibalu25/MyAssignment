package week4.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		
		driver.findElement(By.xpath("//div[@jsid='partyIdFromComboBoxStore']/following::img")).click();
		
		String fWindow = driver.getWindowHandle();
		
		System.out.println("First window is :"+fWindow);
		
		String MergeWindowTitle = driver.getTitle();
		
		System.out.println("Merge Window Title is :"+MergeWindowTitle);
		
		
		Set<String> cWindow = driver.getWindowHandles();
		
		for(String each :cWindow)
		{
			System.out.println(each);
		}
		 
		List<String> findcontacts = new ArrayList<>(cWindow);
		
		driver.switchTo().window(findcontacts.get(1));
		
		//To print the second title
		
        String frc = driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).getText();
		
		System.out.println("Print First Resulting Contact :"+frc);
		//Click on First Resulting Contact
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//Return to Parent window
		driver.switchTo().window(fWindow);
		
		
		// Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following::img")).click();
		
		String sWindow = driver.getWindowHandle();
		System.out.println("Print the seconf Window title :"+sWindow);
		
		String swindowTitle = driver.getTitle();
		
		System.out.println("Second Window Title :"+swindowTitle);
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		for(String each :windowHandles1)
			
			System.out.println(each);
		
		
		List <String> findcontacts2 = new ArrayList<>(windowHandles1);
		
		driver.switchTo().window(findcontacts2.get(1));
		
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();		
		
		////Return to Parent window
		driver.switchTo().window(fWindow);
		
		//Click on Merge button using Xpath Locator
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//Accept the Alert - confirmation Alert
		
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		
		System.out.println("Print the Alert text :"+alertText);
		confirmationAlert.accept();
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		//Verify the title of the page
		if(pageTitle.contains("opentaps CRM"))
		{
			System.out.println("Test case is success");
		}
		else
			System.out.println("Test case is failed: Unable to merge the contact");
	}

}
