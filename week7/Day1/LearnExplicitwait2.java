package week7.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitwait2 {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'I am about to hide')]")).getText();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'I am about to hide')]"	)));
		
		
		
	
		

	}

}
