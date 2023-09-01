package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Decline optional cookies']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vijayalakshmi");
		driver.findElement(By.name("lastname")).sendKeys("Saravanan");
		driver.findElement(By.name("reg_email__")).sendKeys("vijibalu@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vijibalu@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Mahilan@12345");
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("4");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("May");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1991");
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		

	}

}
