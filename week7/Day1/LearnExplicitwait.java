package week7.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitwait {
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/waits.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[text()='Click']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']"))); //visibletext
        String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
        System.out.println(text);
        

	}

}
