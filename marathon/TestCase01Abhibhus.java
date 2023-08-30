package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase01Abhibhus {
	
	public static void main(String[] args) {
		
		//Launch  Chrome broswer
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load https://www.abhibus.com/
		driver.get("https://www.abhibus.com/");
		//Click on Bus
		driver.findElement(By.id("pills-home-tab")).click();
		
		//Type "Chennai" in the FROM text box
		driver.findElement(By.id("source")).sendKeys("Chennai");
		
		// Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		//Type "Bangalore" in the TO text box
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		//Select tomorrow s date in the Date field
		driver.findElement(By.id("datepicker1")).click();
		
		//Click Search Buses
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		//Print the name of the first resulting bus (use .getText())
		System.out.println(driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//p[@class='noseats AvailSts ng-binding'])")).getText());	
		
		//Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//li[@id='bustypeSLEEPER']")).click();
		driver.findElement(By.className("book")).click();
		
		//Click SelectSeat // Choose any one Available seat
		driver.findElement(By.xpath("//span[@class='pillow']")).click();
		
		//Print Seats Selected ,Total Fare
		System.out.println("Seat No: "+driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
		System.out.println("Ticket Fare: " +driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());
		
		//Select Boarding Point  and Dropping Point (Select class)
		Select bp = new Select(driver.findElement(By.id("boardingpoint_id")));
		bp.selectByVisibleText("velachery-22:54");
		Select dp = new Select(driver.findElement(By.id("droppingpoint_id")));
		dp.selectByVisibleText("HSR Layout-05:37");
		
		//Get the Title of the page(use .getTitle())
		System.out.println("Page Title is :" +driver.getTitle());
		
		//Close the browser (driver.close())
		driver.close();

	}

}
