package week7.Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'of Use & Sale')]"));
		
		Actions builder = new Actions(driver);
		
		builder.scrollToElement(link).perform();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snaps/scroll.png");
		
		FileUtils.copyFile(src, dest);
		
		String privacy = driver.findElement(By.xpath(" //a[contains(text(),'Privacy Notice')]")).getText();
		
		if(privacy.equalsIgnoreCase(privacy))
		{
			System.out.println("Test Case Passed :"+privacy);
		}

	}

}
