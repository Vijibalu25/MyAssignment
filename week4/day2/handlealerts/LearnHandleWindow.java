package week4.day2.handlealerts;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnHandleWindow {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
		String ptitle = driver.getTitle();
		
		System.out.println("Print the parent title :"+ptitle);
		
		String pwHandle = driver.getWindowHandle();
		
		System.out.println(pwHandle);
		
		
		Set<String> multiwindows = driver.getWindowHandles();
		

		for(String each :multiwindows) {
			System.out.println(each);
		}
		//switch to particular window
		List<String> handles = new ArrayList<>(multiwindows);
		
		driver.switchTo().window(handles.get(1));
		 
		
		String childTabTile = driver.getTitle();
		System.out.println("Child Window Title :"+childTabTile);
		
		
	}
	

}
