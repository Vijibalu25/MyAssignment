package week4.day2.handlealerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*Classroom:
	   - Load leafground.com(https://www.leafground.com/alert.xhtml)
		   - click show button under Alert(Prompt Dialog)
		   - pass an input message in the alert text box
		   - read the alert message
		   - accept/dismiss the alert
		   - verify */

public class LearnPromptAlert {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click show button under Alert(Prompt Dialog)
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[2]")).click();
		Alert promptAlert = driver.switchTo().alert();
		//read the alert message
		String alerttext = promptAlert.getText();
		System.out.println("Prompt Alert Text :"+alerttext);
		//  - pass an input message in the alert text box
		promptAlert.sendKeys("Viji");
		//accept/dismiss the alert
		promptAlert.accept();
		
		String promptsucess = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();		
		if(promptsucess.contains("entered"))
			
		{
			System.out.println("Prompt Alert is handled");
		}
			}

}
