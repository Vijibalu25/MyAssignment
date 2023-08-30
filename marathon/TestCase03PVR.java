package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase03PVR {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the Url  https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com/");
		
		//Click  on Movie Library
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		
		//Select the City -->chennai
		Thread.sleep(2000);
		Select city = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		city.selectByVisibleText("Chennai");
		Thread.sleep(2000);
		
		//Select the Genre-->Animation
		Select genre =new Select(driver.findElement(By.name("genre")));
		genre.selectByVisibleText("ANIMATION");
		Thread.sleep(2000);
		
		//Select the Language-->english
		Select lang = new Select(driver.findElement(By.name("lang")));
		lang.selectByVisibleText("ENGLISH");
		
		//Click on Apply
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		//Click on first resulting animation movie
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']")).click();
		Thread.sleep(2000);
		
		//) Click proceed to book
		driver.findElement(By.xpath("//div[@class='header-info-fixed']//button")).click();
		
		//Enter  all  the fields, cinema
		Thread.sleep(3000);
		Select cinema =new Select(driver.findElement(By.id("cinemaName")));
		cinema.selectByVisibleText("PVR Velachery Chennai");
		Select time= new Select(driver.findElement(By.name("timings")));
		time.selectByIndex(1);
		
		//Enter the date details
		driver.findElement(By.xpath("(//input[contains(@class,'ng-pristine ng-valid')])[3]")).click();
		driver.findElement(By.xpath("//div[@class='controls']/*[2]")).click();
		driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[2]")).click();
		
		//Enter  all  the Name, Prefered show time, no of seats, food and beverages,Email and Mobile
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vijayalakshmi");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijibalu2225@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9500768884");
		Select food = new Select(driver.findElement(By.name("food")));
		food.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NA");
		
		//Click on copy to self 
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		
		//Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		//Click cancel 
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		//Close the OTP dialog
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		
		//Verify the title of the page
		System.out.println("Title of the page :" +driver.getTitle());
		
		driver.close();
		
	
			
	}
	
}
