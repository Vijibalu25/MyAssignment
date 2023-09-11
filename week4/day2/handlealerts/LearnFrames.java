package week4.day2.handlealerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alertprompt = driver.switchTo().alert();
		String alerttext = alertprompt.getText();
		System.out.println("Text of Alert message :"+alerttext);
		alertprompt.accept();
		
		String success = driver.findElement(By.id("demo")).getText();
		
		if(success.contains("OK"))
		{
			System.out.println("Handled an Alert");
		}
		
		
		}

}
