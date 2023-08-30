package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase02Flipkart {
	
	public static void main(String[] args) {
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--accept cookies");
		
		//Launch Chrome 
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type "Bags" in the Search box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bags");
		
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//div[contains(text(),'boys')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Print the total number of results (like 50000) 1-48 of over 50,000 results for "bags for boys"
		System.out.println(driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText());
		
		//Select the first 2 brands in the left menu(like American Tourister, Generic)
		driver.findElement(By.xpath("//a[contains(@title,'Backpack')]")).click();	
		
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//div[text()='Newest First']")).click();
		
		//Print the first resulting bag info (name, discounted price)
		System.out.println("Result of first iteam listing in the page :" +driver.findElement(By.xpath("//a[@class='IRpwTa']")).getText());
		String price = driver.findElement(By.xpath("//div[@class='_30jeq3']")).getText();
		System.out.println("The Discounted Price is :" +price);
		
		//Get the page title and close the browser(driver.close())
		System.out.println("The page title :" +driver.getTitle());
		driver.close();

}

}
