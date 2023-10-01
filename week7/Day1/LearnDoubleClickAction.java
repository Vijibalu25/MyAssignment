package week7.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClickAction {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("accept-choices")).click();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement doubleclickaction = driver.findElement(By.xpath("//p[contains(text(),'Double-click')]"));
		
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleclickaction).perform();
		
		
		
		
		
		

	}

}
