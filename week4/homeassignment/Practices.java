package week4.homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practices {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String firstWindow = driver.getWindowHandle();
		
		System.out.println(firstWindow);
		
		String firstWindowTitle = driver.getTitle();
		
		System.out.println("First Windows Title is :"+firstWindowTitle);
		
		Set<String> childWindow = driver.getWindowHandles();
		
		for(String each :childWindow)
			
			System.out.println(each);
		
		List<String> nextWindow = new ArrayList<>(childWindow);
		
		driver.switchTo().window(nextWindow.get(1));
		
		String SecondWindowTitle = driver.getTitle();
		
		System.out.println("Print the Second Window Title :"+SecondWindowTitle);
		
		//
		driver.switchTo().window(firstWindow);
		
		
		

	}
	

	
}
