package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/"); //Launch the URL
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com"); // Enter UserName
		driver.findElement(By.id("password")).sendKeys("Leaf$1234"); // Enter Password
		driver.findElement(By.id("Login")).click(); // Click on Login
					
		
	}
}
