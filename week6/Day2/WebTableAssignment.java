package week6.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {
	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
		fromstation.clear();
		fromstation.sendKeys("MS", Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));		
		toStation.clear();
		toStation.sendKeys("CBE", Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		
		for(WebElement eachtrain: trainnames)
		{
			System.out.println(eachtrain.getText());
		}
	}

}
